package Lab4_bt;
import java.util.Scanner;

abstract class GiangVien{
	String hoTen,diaChi,loaiGV;
	
	public void nhapThongTin() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ho ten giang vien :");
		hoTen = scanner.nextLine();
		System.out.println("Nhap dia chi :");
		diaChi = scanner.nextLine();
		System.out.println("Nhap loai giang vien :");
		loaiGV = scanner.nextLine();
	}
	
	public GiangVien() {
		//ham tao ko tham so
	}
	
	public abstract void tinhLuong();
	
	public void inThongTin() {
		System.out.println("Ho ten GV: "+hoTen);
		System.out.println("Dia chi: "+diaChi);
		System.out.println("Loai GV: "+loaiGV);
	}
}

class GVCoHuu extends GiangVien{
	double luongThang;
	double luongCB;
	int heSoLuong;
	double phuCap;
	int thamNienCT;
	
	public GVCoHuu() {
		//ham tao ko tham so 
	}
	
	public void nhapThongTin() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("< Giang Vien Co Huu >");
		super.nhapThongTin();
		System.out.println("Nhap luong co ban: ");
		luongCB = scanner.nextFloat();
		System.out.println("Nhap he so luong: ");
		heSoLuong = scanner.nextInt();
		System.out.println("Nhap thoi gian cong tac: ");
		thamNienCT = scanner.nextInt();
	}
	public void tinhLuong() {
		if(thamNienCT<5) {
			phuCap = 0*luongCB;
		}else  {
		 phuCap = ((((thamNienCT-5)+5))/100)*luongCB;
		}
		luongThang = luongCB*heSoLuong+phuCap;
		System.out.println("Luong: "+luongThang +"VND");
	}
}

class GVThinhGiang extends GiangVien{
	double luongThang;
	int soTietDay;
	double donGia;
	double thuNhap;
	
	public GVThinhGiang() {
		//ham tao ko tham so 
	}
	
	public void nhapThongTin() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("< Giang Vien Thinh Giang >");
		super.nhapThongTin();
		System.out.println("Nhap so tiet day: ");
		soTietDay = scanner.nextInt();
		System.out.println("Nhap don gia: ");
		donGia = scanner.nextDouble();
		
	}
	
	public void tinhLuong() {
		thuNhap = 0.15*(soTietDay*donGia);
		luongThang = soTietDay*donGia-thuNhap;
		System.out.println("Luong Thang: "+luongThang+"VND");
	}
}
public class Bai5_lab4 {

	public static void main(String[] args) {
		GVCoHuu GVCH = new GVCoHuu();
		GVThinhGiang GVTG = new GVThinhGiang();
	int luaChon;
	String chon;
	do {
		System.out.println("Chon lua phuong an sau: ");
		System.out.println("1,Nhap thong tin giang vien thinh giang! ");
		System.out.println("2,Nhap thong tin giang vien co huu! ");
		System.out.println("3,In thong tin giang vien thinh giang! ");
		System.out.println("4,In thong tin giang vien co huu!");
		Scanner scanner = new Scanner(System.in);
		luaChon = scanner.nextInt();
		switch(luaChon) {
		case 1:{
			GVTG.nhapThongTin();
			break;
		}
		case 2:{
			GVCH.nhapThongTin();
			break;
		}
		case 3:{
			GVTG.inThongTin();
			GVTG.tinhLuong();
			break;
		}
		case 4:{
			GVCH.inThongTin();
			GVCH.tinhLuong();
			break;
		}
		default:{
			System.out.println("Ban da nhap sai!!!    (T.T)");
		}
	}
		System.out.println("Ban co muon chon tiep? (yes/no)");
		scanner.nextLine();
		chon = scanner.nextLine();
		}while(chon !="no");
	}

}
