package tuan2_nganHangAccount;

public class Account
{
	private long accountNumber;
	private String accountName;
	private double blance;
	private  final long   BLANCEDEFAULT=50000;
	public long  getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public double getBlance() {
		return blance;
	}
	public void setBlance(double blance) {
		this.blance = blance;
	}
	//constructor
	public Account(long accountNumber, String accountName, double blance) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.blance = blance;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(long accountNumber, String accountName)
	{
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.blance = BLANCEDEFAULT;
	}
	public boolean deposit(double amountTienNap) 
	{
		double blanceTrongTK;
		if (amountTienNap > 0) 
		{
			//blance += amount;
			blanceTrongTK= getBlance();
			blanceTrongTK+=amountTienNap;
			this.setBlance(blanceTrongTK);
			return true;
		} 
		else 
		{
		//	throw new Exception("Số tiền không được bé hơn không");
			//throw new MissingFormatArgumentException("Số tiền không được bé hơn không");
		}
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	String str="";
	str+= String.format("%15d%30s%15.2f",getAccountNumber(), getAccountName(),getBlance());
	return str;
}

}