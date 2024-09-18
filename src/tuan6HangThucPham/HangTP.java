package tuan6HangThucPham;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HangTP {
	private final String maHang;
	private String tenHang;
	private double donGia;
	private Date ngaySX;
	private Date ngayHH;
	public HangTP(String maHang, String tenHang, double donGia, Date ngaySX, Date ngayHH) {
		super();
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.donGia = donGia;
		this.ngaySX = ngaySX;
		this.ngayHH = ngayHH;
	}
	public HangTP(String maHang) {
		super();
		if (maHang == null || maHang.isEmpty()) {
	            throw new IllegalArgumentException("Mã hàng không được để trống");
	    }
	    this.maHang = maHang;
	}
	public String getMaHang() {
       return maHang;
   }

	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		if (tenHang == null || tenHang.isEmpty()) {
            this.tenHang = "Không xác định";
        } else {
            this.tenHang = tenHang;
        }
		this.tenHang = tenHang;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		if (donGia <= 0) {
            this.donGia = 1.0;
        } else {
            this.donGia = donGia;
        }
		this.donGia = donGia;
	}
	public Date getNgaySX() {
		return ngaySX;
	}
	public void setNgaySX(Date ngaySX) {
		 if (ngaySX == null) {
	            this.ngaySX = new Date();
	        } else {
	            this.ngaySX = ngaySX;
	        }
		this.ngaySX = ngaySX;
	}
	public Date getNgayHH() {
		return ngayHH;
	}
	public void setNgayHH(Date ngayHH) {
		if (ngayHH == null || (ngaySX != null && ngayHH.before(ngaySX))) {
            this.ngayHH = new Date(ngaySX.getTime() + (1000L * 60 * 60 * 24 * 30)); 
        } else {
            this.ngayHH = ngayHH;
        }
		this.ngayHH = ngayHH;
	}
	public boolean isHetHan() {
        Date currentDate = new Date();
        return ngayHH.before(currentDate);
    }
	@Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        DecimalFormat decimalFormat = new DecimalFormat("#,###.00");

        return "Mã hàng: " + maHang + "\n" +
               "Tên hàng: " + tenHang + "\n" +
               "Đơn giá: " + decimalFormat.format(donGia) + "\n" +
               "Ngày sản xuất: " + dateFormat.format(ngaySX) + "\n" +
               "Ngày hết hạn: " + dateFormat.format(ngayHH) + "\n" +
               "Hết hạn: " + (isHetHan() ? "Có" : "Không");
    }
	
}
