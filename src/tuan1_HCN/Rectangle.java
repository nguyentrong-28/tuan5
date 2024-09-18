package tuan1_HCN;

public class Rectangle {
	private int chieuDai;
	private int chieuRong;

	public Rectangle() {
		super();
	}
	public Rectangle(int cd, int cr) {
		super();
		this.chieuDai = cd;
		this.chieuRong = cr;
	}
	public int getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(int chieuDai) {
		this.chieuDai = chieuDai;
	}
	public int getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(int chieuRong) {
		this.chieuRong = chieuRong;
	}
	public long tinhDienTich() {
		long s;
		s = this.getChieuDai() * this.getChieuRong();
		return s;
	}
	public int tinhChuVi() {
		int CV;
		CV = (this.getChieuDai() + this.getChieuRong()) * 2;
		return CV;
	}
	@Override
	public String toString() {
		return String.format("%10d %10d %12d %12d", getChieuDai(), getChieuRong(), tinhDienTich(), tinhChuVi());
	}
	
}
