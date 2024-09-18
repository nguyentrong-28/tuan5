package tuan6HangThucPham;

import java.util.Date;

public class KiemNghiemHang {
	public static void main(String[] args) {
        // Tạo đối tượng HangThucPham và kiểm tra
        HangTP htp1 = new HangTP("TP01", "Sữa tươi", 15000, new Date(), new Date(new Date().getTime() + 1000L * 60 * 60 * 24 * 10));
        System.out.println(htp1);

        System.out.println("\n---\n");

        HangTP htp2 = new HangTP("TP02");
        htp2.setTenHang("Bánh mì");
        htp2.setDonGia(5000);
        htp2.setNgaySX(new Date());
        htp2.setNgayHH(new Date(new Date().getTime() - 1000L * 60 * 60 * 24 * 5)); // Đặt ngày hết hạn trước ngày hiện tại
        System.out.println(htp2);
    }

}