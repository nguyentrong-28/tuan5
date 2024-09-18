package tuan4SinhVien;

import java.util.Arrays;
import java.util.Scanner;

public class QuanLySinhVien {
    private SinhVien[] danhSachSinhVien;
    private int soLuongSinhVien;

    public QuanLySinhVien(int soLuongSinhVien) {
        this.soLuongSinhVien = soLuongSinhVien;
        danhSachSinhVien = new SinhVien[soLuongSinhVien];
    }

    public void nhapDanhSachSinhVien() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < soLuongSinhVien; i++) {
            System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1) + ":");
            System.out.print("Mã sinh viên: ");
            int maSinhVien = scanner.nextInt();
            scanner.nextLine();  
            System.out.print("Họ tên: ");
            String hoTen = scanner.nextLine();
            System.out.print("Địa chỉ: ");
            String diaChi = scanner.nextLine();
            System.out.print("Số điện thoại: ");
            int soDienThoai = scanner.nextInt();

            danhSachSinhVien[i] = new SinhVien(maSinhVien, hoTen, diaChi, soDienThoai);
        }
    }

    public void sapXepDanhSachSinhVien() {
        Arrays.sort(danhSachSinhVien, (sv1, sv2) -> Integer.compare(sv1.getMaSinhVien(), sv2.getMaSinhVien()));
    }

    public void xuatDanhSachSinhVien() {
        for (SinhVien sinhVien : danhSachSinhVien) {
            System.out.println(sinhVien);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();

        QuanLySinhVien quanLySinhVien = new QuanLySinhVien(n);
        quanLySinhVien.nhapDanhSachSinhVien();
        quanLySinhVien.sapXepDanhSachSinhVien();
        System.out.println("Danh sách sinh viên sau khi sắp xếp:");
        quanLySinhVien.xuatDanhSachSinhVien();
    }
}

