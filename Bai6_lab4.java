package Lab4_bt;
import java.util.Scanner;

abstract class CongNhan{
	String hoTen,diaChi,loaiCN;
	
	public CongNhan() {
	}
	
	public void nhapThongTin() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ho ten cong nhan: ");
		hoTen = scanner.nextLine();
		System.out.println("Nhap dia chi: ");
		diaChi = scanner.nextLine();
		System.out.println("Nhap loai cong nhan: ");
		loaiCN = scanner.nextLine();
	}
	
	public abstract void tinhLuong();// phuong thuc tinh luong truu tuong
	
	public void inThongTin() {
		System.out.println("Ho ten cong nhan: "+hoTen);
		System.out.println("Dia chi: "+diaChi);
		System.out.println("Loai cong nhan: "+loaiCN);
	}
}

class CNKSP extends CongNhan{
	double luongThang;
	int soSP;
	double donGiaSP;
	double thuong;
	
	public CNKSP() {
		// ham tao ko tham so
	}
	
	public void nhapThongTin() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("<Cong nhan khoan san pham>");
		super.nhapThongTin();
		System.out.println("Nhap so luong san pham: ");
		soSP = scanner.nextInt();
		System.out.println("Nhap don gia san pham: ");
		donGiaSP = scanner.nextDouble();
	}
	
	public void tinhLuong() {
		if(soSP <= 1000) {
			thuong = 0;
		}else if(soSP>1000 && soSP<=1100) {
			thuong = 1000000;
		}else if(soSP>1150) {
			thuong = 1500000;
		}
		luongThang = soSP*donGiaSP+thuong;
		System.out.println("Luong Thang: "+luongThang+" VND");
	}
}

class CNTCN extends CongNhan{
	double luongThang;
	double luongCB;
	int heSoLuong;
	double thuong;
	double soNgayCong;
	
	public CNTCN() {
		//ham tao ko tham so
	}
	
	public void nhapThongTin() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("<Cong nhan tinh cong nhat>");
		super.nhapThongTin();
		System.out.println("Nhap so ngay cong: ");
		soNgayCong = scanner.nextDouble();
		System.out.println("Nhap luong co ban: ");
		luongCB = scanner.nextDouble();
		System.out.println("Nhap he so luong: ");
		heSoLuong = scanner.nextInt();
	}
	
	public void tinhLuong() {
		if(soNgayCong < 20) {
			thuong = 0;
		}else {
			thuong = 1.2*luongCB;
		}
		luongThang = luongCB*heSoLuong+thuong;
		System.out.println("Luong thang = "+luongThang+" VND");
	}
}

public class Bai6_lab4 {

	public static void main(String[] args) {
		CNKSP ksp = new CNKSP();
		CNTCN tcn = new CNTCN();
		
		int luaChon;
		String chon;
		
		do {
			Scanner scanner = new Scanner(System.in);	
			System.out.println("Moi ban chon: ");
			System.out.println("1,Nhap thong tin CN khoan san pham.");
			System.out.println("2,Nhap thong tin CN tinh cong nhat.");
			System.out.println("3,In thong tin CN khoan san pham.");
			System.out.println("4,In thong tin CN tinh cong nhat.");
			luaChon = scanner.nextInt();
			switch(luaChon) {
			case 1:{
				ksp.nhapThongTin();
				break;
			}
			case 2:{
				tcn.nhapThongTin();
				break;
			}
			case 3:{
				ksp.inThongTin();
				ksp.tinhLuong();
				break;
			}
			case 4:{
				tcn.inThongTin();
				tcn.tinhLuong();
				break;
			}
			default:{
				System.out.println("Ban nhap loi!!!  (T.T)");
			}
			}
			System.out.println("Ban co muon chon lai hong?   (yes/no)");
			scanner.nextLine();
			chon = scanner.nextLine();
		}while(chon !="no");
	}

}
