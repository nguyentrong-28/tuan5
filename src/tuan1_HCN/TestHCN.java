package tuan1_HCN;

import java.util.Scanner;

public class TestHCN {	    
		public static int nhapsonguyen (String thongbao) {
			int a;
			System.out.println(thongbao);
			Scanner scr = new Scanner(System.in);
			a=scr.nextInt();
			return a;
		}
		public static Rectangle nhapthongtin() {
			int cd, cr;
			Rectangle cn;
			cd=nhapsonguyen("Nhap chieu dai: ");
			cr=nhapsonguyen("Nhap chieu rong: ");
			cn=new Rectangle(cd, cr);
			return cn;
		}
		static String tieuDe() {
			return String.format("%-10s %-10s %-12s %-12s", "Chieu Dai", "Chieu Rong", "Dien Tich", "Chu Vi");
		}
		public static void nhap() {
			Rectangle cn1, cn2, cn3;
			cn1 = new Rectangle(10, 3);
			cn2 = new Rectangle(6, 5);
			cn3 = new Rectangle(2, 9);
			System.out.println(cn1);
			System.out.println(cn2);
			System.out.println(cn3);
		}
		public static void main(String[] args) {
			Rectangle cn1, cn2, cn3;
			System.out.println("Chuong trinh xu li HCN");
			System.out.println(tieuDe());
			nhap();
		}
	}
	

