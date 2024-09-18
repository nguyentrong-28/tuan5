package tuan3XeMay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vehicle> vehicles = new ArrayList<>(); // Danh sách để lưu trữ các xe

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Nhập thông tin và tạo các đối tượng xe");
            System.out.println("2. Xuất bảng kê khai tiền thuế trước bạ của các xe");
            System.out.println("3. Thoát");
            System.out.print("Chọn công việc (1-3): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Nhập thông tin cho 3 xe
                    for (int i = 1; i <= 3; i++) {
                        System.out.println("Nhập thông tin cho xe " + i + ":");
                        Vehicle vehicle = createVehicle(scanner);
                        vehicles.add(vehicle); // Thêm xe vào danh sách
                    }
                    break;
                case 2:
                    // In tiêu đề bảng
                    System.out.printf("%-20s %-15s %-10s %-15s %-15s%n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
                    System.out.println("===========================================================================");

                    // Sử dụng vòng lặp for để in thông tin các xe
                    for (Vehicle vehicle : vehicles) {
                        vehicle.displayInfo();
                    }
                    break;
                case 3:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    // Method to create a new Vehicle object
    public static Vehicle createVehicle(Scanner scanner) {
        scanner.nextLine(); // Consume newline
        System.out.print("Nhập tên chủ sở hữu: ");
        String owner = scanner.nextLine();
        System.out.print("Nhập loại xe: ");
        String type = scanner.nextLine();
        System.out.print("Nhập trị giá xe: ");
        double value = scanner.nextDouble();
        System.out.print("Nhập dung tích xy lanh của xe (cc): ");
        int engineCapacity = scanner.nextInt();
        return new Vehicle(owner, type, value, engineCapacity);
    }
}
