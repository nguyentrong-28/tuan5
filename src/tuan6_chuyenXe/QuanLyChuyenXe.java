package tuan6_chuyenXe;

import java.util.ArrayList;

public class QuanLyChuyenXe {
	private ArrayList<ChuyenXe> danhSachChuyenXe = new ArrayList<>();

    public void themChuyenXe(ChuyenXe chuyenXe) {
        danhSachChuyenXe.add(chuyenXe);
    }

    public void xuatDanhSach() {
        for (ChuyenXe chuyenXe : danhSachChuyenXe) {
            System.out.println(chuyenXe.toString());
            System.out.println("-------------------");
        }
    }

    public double tinhTongDoanhThuNoiThanh() {
        double tongDoanhThu = 0;
        for (ChuyenXe chuyenXe : danhSachChuyenXe) {
            if (chuyenXe instanceof ChuyenXeNoiThanh) {
                tongDoanhThu += chuyenXe.getDoanhThu();
            }
        }
        return tongDoanhThu;
    }

    public double tinhTongDoanhThuNgoaiThanh() {
        double tongDoanhThu = 0;
        for (ChuyenXe chuyenXe : danhSachChuyenXe) {
            if (chuyenXe instanceof ChuyenXeNgoaiThanh) {
                tongDoanhThu += chuyenXe.getDoanhThu();
            }
        }
        return tongDoanhThu;
    }
}
