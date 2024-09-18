package tuan2_nganHangAccount;


public class DSAccount {
	private Account ds[];
	public int soluongHT = 0;//hiện tai
	//them, xao , sua
	public DSAccount(int soluong)
	{
		ds = new Account[soluong];
	}
	public Account[] getAllAccounts() {
		return ds;
	}
	// tăng kích thước của mảng nếu đầy
		public void TangKichThuoc() {
			
			Account temp[] = new Account[ds.length * 2];
			for (int i = 0; i < ds.length; i++) {
				temp[i] = ds[i];
			}
			ds = temp;
		}

		// thêm 1 tài khoản
		public void them(Account ac) throws Exception {
			if (soluongHT == ds.length)
				TangKichThuoc();

			if (timKiem(ac.getAccountNumber()) == -1) // không tìm thấy
			{
				ds[soluongHT] = ac;
				soluongHT++;
			} 
			else
			{
				throw new Exception("Trùng mã");
			}
		}
		
		public int timKiem(long  accountNumber) 
		{
			for (int i = 0; i < soluongHT; i++) {
				if (accountNumber == ds[i].getAccountNumber())
					return i;
			}
			return -1;
		}

}
