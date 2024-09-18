package tuan5DoiTuongCD;

import java.util.Arrays;

public class DanhSachCD {
	private CD[] danhSach;
    private int soLuong;

    public DanhSachCD(int kichThuoc) {
        danhSach = new CD[kichThuoc];
        soLuong = 0;
    }
    
    public boolean themCD(CD cd) {
        if (soLuong < danhSach.length) {
            for (int i = 0; i < soLuong; i++) {
                if (danhSach[i].getMaCD() == cd.getMaCD()) {
                    return false; 
                }
            }
            danhSach[soLuong] = cd;
            soLuong++;
            return true;
        } else {
            return false; 
        }
    }

    public int tinhSoLuongCD() {
        return soLuong;
    }

    public double tinhTongGiaThanh() {
        double tongGiaThanh = 0;
        for (int i = 0; i < soLuong; i++) {
            tongGiaThanh += danhSach[i].getGiaThanh();
        }
        return tongGiaThanh;
    }

    // Sắp xếp danh sách giảm dần theo giá thành
    public void sapXepGiamDanTheoGiaThanh() {
        Arrays.sort(danhSach, 0, soLuong, (cd1, cd2) -> Double.compare(cd2.getGiaThanh(), cd1.getGiaThanh()));
    }

    // Sắp xếp danh sách tăng dần theo tựa CD
    public void sapXepTangDanTheoTuaCD() {
        Arrays.sort(danhSach, 0, soLuong, (cd1, cd2) -> cd1.getTuaCD().compareToIgnoreCase(cd2.getTuaCD()));
    }

    // Phương thức xuất toàn bộ danh sách
    public void xuatDanhSach() {
        for (int i = 0; i < soLuong; i++) {
            System.out.println(danhSach[i]);
        }
    }
}