package tuan6_chuyenXe;

import java.util.Scanner;

public class TestCX {
	public static void main(String[] args) {
        QuanLyChuyenXe qlChuyenXe = new QuanLyChuyenXe();
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng chuyến xe nội thành
        System.out.print("Nhập số lượng chuyến xe nội thành: ");
        int soXeNoiThanh = scanner.nextInt();
        scanner.nextLine();  // Đọc ký tự xuống dòng

        for (int i = 0; i < soXeNoiThanh; i++) {
            System.out.println("Nhập thông tin chuyến xe nội thành " + (i + 1) + ":");
            System.out.print("Mã số chuyến: ");
            String maSoChuyen = scanner.nextLine();
            System.out.print("Họ tên tài xế: ");
            String hoTenTaiXe = scanner.nextLine();
            System.out.print("Số xe: ");
            String soXe = scanner.nextLine();
            System.out.print("Doanh thu: ");
            double doanhThu = scanner.nextDouble();
            System.out.print("Số tuyến: ");
            int soTuyen = scanner.nextInt();
            System.out.print("Số km đi được: ");
            double soKm = scanner.nextDouble();
            scanner.nextLine();  // Đọc ký tự xuống dòng

            ChuyenXeNoiThanh xeNoiThanh = new ChuyenXeNoiThanh(maSoChuyen, hoTenTaiXe, soXe, doanhThu, soTuyen, soKm);
            qlChuyenXe.themChuyenXe(xeNoiThanh);
        }

        // Nhập số lượng chuyến xe ngoại thành
        System.out.print("Nhập số lượng chuyến xe ngoại thành: ");
        int soXeNgoaiThanh = scanner.nextInt();
        scanner.nextLine();  // Đọc ký tự xuống dòng

        for (int i = 0; i < soXeNgoaiThanh; i++) {
            System.out.println("Nhập thông tin chuyến xe ngoại thành " + (i + 1) + ":");
            System.out.print("Mã số chuyến: ");
            String maSoChuyen = scanner.nextLine();
            System.out.print("Họ tên tài xế: ");
            String hoTenTaiXe = scanner.nextLine();
            System.out.print("Số xe: ");
            String soXe = scanner.nextLine();
            System.out.print("Doanh thu: ");
            double doanhThu = scanner.nextDouble();
            System.out.print("Nơi đến: ");
            scanner.nextLine();  // Đọc ký tự xuống dòng trước khi nhập chuỗi
            String noiDen = scanner.nextLine();
            System.out.print("Số ngày đi được: ");
            int soNgay = scanner.nextInt();
            scanner.nextLine();  // Đọc ký tự xuống dòng

            ChuyenXeNgoaiThanh xeNgoaiThanh = new ChuyenXeNgoaiThanh(maSoChuyen, hoTenTaiXe, soXe, doanhThu, noiDen, soNgay);
            qlChuyenXe.themChuyenXe(xeNgoaiThanh);
        }

        // Xuất danh sách chuyến xe bằng toString
        System.out.println("\nDanh sách các chuyến xe:");
        qlChuyenXe.xuatDanhSach();

        // Tính tổng doanh thu cho từng loại xe
        System.out.println("\nTổng doanh thu xe nội thành: " + qlChuyenXe.tinhTongDoanhThuNoiThanh());
        System.out.println("Tổng doanh thu xe ngoại thành: " + qlChuyenXe.tinhTongDoanhThuNgoaiThanh());
    }
}
