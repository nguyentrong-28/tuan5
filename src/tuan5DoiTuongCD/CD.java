package tuan5DoiTuongCD;

public class CD {
	private int maCD;
    private String tuaCD;
    private String caSy;
    private int soBaiHat;
    private double giaThanh;

    public CD() {
    }

    public CD(int maCD, String tuaCD, String caSy, int soBaiHat, double giaThanh) {
        this.maCD = maCD;
        this.tuaCD = tuaCD;
        this.caSy = caSy;
        setSoBaiHat(soBaiHat);
        setGiaThanh(giaThanh);
    }

    public int getMaCD() {
        return maCD;
    }

    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }

    public String getTuaCD() {
        return tuaCD;
    }

    public void setTuaCD(String tuaCD) {
        this.tuaCD = tuaCD;
    }

    public String getCaSy() {
        return caSy;
    }

    public void setCaSy(String caSy) {
        this.caSy = caSy;
    }

    public int getSoBaiHat() {
        return soBaiHat;
    }

    public void setSoBaiHat(int soBaiHat) {
        if (soBaiHat > 0) {
            this.soBaiHat = soBaiHat;
        } else {
            throw new IllegalArgumentException("Số bài hát phải lớn hơn 0");
        }
    }

    public double getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(double giaThanh) {
        if (giaThanh > 0) {
            this.giaThanh = giaThanh;
        } else {
            throw new IllegalArgumentException("Giá thành phải lớn hơn 0");
        }
    }

    // Override phương thức toString
    @Override
    public String toString() {
        return "Mã CD: " + getMaCD() + ", Tựa CD: " + getTuaCD() + ", Ca sỹ: " + getCaSy() + ", Số bài hát: " + getSoBaiHat() + ", Giá thành: " + getGiaThanh();
    }
}
