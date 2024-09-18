package tuan6_chuyenXe;

public class ChuyenXeNoiThanh extends ChuyenXe {
    private int soTuyen;
    private double soKm;

    public ChuyenXeNoiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, int soTuyen, double soKm) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }

    public int getSoTuyen() {
		return soTuyen;
	}
	public void setSoTuyen(int soTuyen) {
		this.soTuyen = soTuyen;
	}
	public double getSoKm() {
		return soKm;
	}
	public void setSoKm(double soKm) {
		this.soKm = soKm;
	}

	@Override
    public String toString() {
        return super.toString() + "\nSố tuyến: " + soTuyen + "\nSố km đi được: " + soKm;
    }
}
