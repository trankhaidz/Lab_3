package Lab4_bt;
import java.util.Scanner;

abstract class HocVien{
	String hoTen,diaChi,loaiCT;
	int loaiUT;
	
	public void nhapThongTin() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ho ten hoc vien :");
		hoTen = scanner.nextLine();
		System.out.println("Nhap dia chi :");
		diaChi = scanner.nextLine();
		System.out.println("Nhap loai chuong trinh dang ky :");
		loaiCT = scanner.nextLine();
		do {
		System.out.println("Nhap loai uu tien :");
		loaiUT = scanner.nextInt();
		}while(loaiUT<1 || loaiUT >2);
	}
	public HocVien(){ 
		//ham tao ko tham so
	}
	
	public abstract void HocPhi();//phuong thuc truu tuong hocphi
	
	public void inThongTin() {
	System.out.println("Ho ten :"+hoTen);
	System.out.println("Dia chi :"+diaChi);
	System.out.println("Chuong trinh dang ky :"+loaiCT);
	System.out.println("Loai uu tien :"+loaiUT);
	}
}

class HocvienDH extends HocVien{
	int soBuoi;
	float donGiaDH;
	float hocPhi;
	
	public HocvienDH() {
		//ham tao ko tham so
	}
	
	
	public void nhapThongTin() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("<Do Hoa>");
		super.nhapThongTin();
		System.out.println("Nhap so buoi :");
		soBuoi = scanner.nextInt();
		System.out.println("Nhap don gia :");
		donGiaDH = scanner.nextFloat();
	}
	
	public void HocPhi() {
		if(loaiUT == 1) {
			hocPhi = soBuoi*donGiaDH-1000000;
		}else if(loaiUT == 2) {
			hocPhi = soBuoi*donGiaDH-500000;
		}else {
			hocPhi = soBuoi*donGiaDH;
		}
		System.out.println("Hoc Phi = "+hocPhi+" VND");
	}

}

class HocvienLT extends HocVien{
	int soBuoi;
	float donGiaLT;
	float hocPhi;
	
	public HocvienLT() {
		//ham tao ko tham so
	}
	
	public void nhapThongTin() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("<Lap Trinh>");
		super.nhapThongTin();
		System.out.println("Nhap so buoi :");
		soBuoi = scanner.nextInt();
		System.out.println("Nhap don gia :");
		donGiaLT = scanner.nextFloat();
	}
	
	public void HocPhi() {
		if(loaiUT == 1) {
			hocPhi = soBuoi*donGiaLT-1000000;
		}else if(loaiUT == 2) {
			hocPhi = soBuoi*donGiaLT-800000;
		}else {
			hocPhi=soBuoi*donGiaLT;
		}
		System.out.println("Hoc Phi = "+hocPhi+" VND");
	}
}

public class Bai4_lab4 {

	public static void main(String[] args) {
		HocvienDH DH = new HocvienDH();
		HocvienLT LT = new HocvienLT();
		
		int luaChon;
		String chon;
		
		do {
			System.out.println("Yeu cau lua chon :");
			System.out.println("1,Nhap thong tin hoc vien do hoa ");
			System.out.println("2,Nhap thong tin hoc vien lap trinh ");
			System.out.println("3,In thong tin hoc vien do hoa ");
			System.out.println("4,In thong tin hoc vien lap trinh");
			Scanner scanner = new Scanner(System.in);
			luaChon = scanner.nextInt(); 
			switch(luaChon) {
			case 1:
				DH.nhapThongTin();
				break;
			case 2:
				LT.nhapThongTin();
				break;
			case 3:
				DH.inThongTin();
				DH.HocPhi();
				break;
			case 4:
				LT.inThongTin();
				LT.HocPhi();
				break;
			default:
				System.out.println("Loi roi!!! (T.T)");	
			};
			System.out.println("Ban muon lua chon them? (yes/no)");
			  scanner.nextLine();
			chon = scanner.nextLine();
		}while(chon != "yes");
	
	}

}
