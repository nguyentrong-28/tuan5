package tuan5DoiTuongCD;

import java.util.Scanner;

public class QuanLyCD {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        DanhSachCD danhSachCD = new DanhSachCD(100); 

	        int luaChon;
	        do {
	            System.out.println("\n--- QUẢN LÝ CD ---");
	            System.out.println("1. Thêm CD vào danh sách");
	            System.out.println("2. Tính số lượng CD trong danh sách");
	            System.out.println("3. Tính tổng giá thành của các CD");
	            System.out.println("4. Sắp xếp danh sách giảm dần theo giá thành");
	            System.out.println("5. Sắp xếp danh sách tăng dần theo tựa CD");
	            System.out.println("6. Xuất toàn bộ danh sách");
	            System.out.println("0. Thoát");
	            System.out.print("Nhập lựa chọn của bạn: ");
	            luaChon = scanner.nextInt();
	            scanner.nextLine(); 

	            switch (luaChon) {
	                case 1:
	                    System.out.print("Nhập mã CD: ");
	                    int maCD = scanner.nextInt();
	                    scanner.nextLine(); 

	                    System.out.print("Nhập tựa CD: ");
	                    String tuaCD = scanner.nextLine();

	                    System.out.print("Nhập tên ca sỹ: ");
	                    String caSy = scanner.nextLine();

	                    System.out.print("Nhập số bài hát: ");
	                    int soBaiHat = scanner.nextInt();

	                    System.out.print("Nhập giá thành: ");
	                    double giaThanh = scanner.nextDouble();

	                    CD cd = new CD(maCD, tuaCD, caSy, soBaiHat, giaThanh);

	                    if (danhSachCD.themCD(cd)) {
	                        System.out.println("Thêm CD thành công!");
	                    } else {
	                        System.out.println("Thêm CD không thành công! Mã CD đã tồn tại hoặc danh sách đầy.");
	                    }
	                    break;

	                case 2:
	                    System.out.println("Số lượng CD trong danh sách: " + danhSachCD.tinhSoLuongCD());
	                    break;

	                case 3:
	                    System.out.println("Tổng giá thành của các CD: " + danhSachCD.tinhTongGiaThanh());
	                    break;

	                case 4:
	                    danhSachCD.sapXepGiamDanTheoGiaThanh();
	                    System.out.println("Danh sách đã được sắp xếp giảm dần theo giá thành.");
	                    break;

	                case 5:
	                    danhSachCD.sapXepTangDanTheoTuaCD();
	                    System.out.println("Danh sách đã được sắp xếp tăng dần theo tựa CD.");
	                    break;

	                case 6:
	                    System.out.println("Danh sách CD:");
	                    danhSachCD.xuatDanhSach();
	                    break;

	                case 0:
	                    System.out.println("Thoát chương trình.");
	                    break;

	                default:
	                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
	            }
	        } while (luaChon != 0);

	        scanner.close();
	    }
}
