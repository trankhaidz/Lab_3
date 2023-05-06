package Lab4_bt;
import java.util.Scanner;


class Nguoi{
	String ten,gioiTinh;
	int tuoi;
	
	public Nguoi() {
		//ham toa ko tham so
	}
	public  Nguoi(String ten, String gioiTinh ,int tuoi) {
		this.ten=ten;
		this.gioiTinh=gioiTinh;
		this.tuoi=tuoi;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	
	public String toString() {
		return "Ten: "+ten+"\n"
				+"Gioi Tinh: "+gioiTinh+"\n"
				+"Tuoi: "+tuoi;
	}
}

class BenhNhan extends Nguoi{
	String tienSu;
	String chuanDoan;
	BenhVien benhVien;
	
	public BenhNhan(String ten,String gioiTinh,int tuoi,String tienSu, String chuanDoan,BenhVien benhVien) {
		super(ten,gioiTinh,tuoi);
		this.tienSu=tienSu;
		this.chuanDoan=chuanDoan;
		this.benhVien=benhVien;
	}

	public String getTienSu() {
		return tienSu;
	}

	public void setTienSu(String tienSu) {
		this.tienSu = tienSu;
	}

	public String getChuanDoan() {
		return chuanDoan;
	}

	public void setChuanDoan(String chuanDoan) {
		this.chuanDoan = chuanDoan;
	}

	public BenhVien getBenhVien() {
		return benhVien;
	}

	public void setBenhVien(BenhVien benhVien) {
		this.benhVien = benhVien;
	}
	
	public String toString() {
		return super.toString()+"\n"
				+"Tien su: "+tienSu+"\n"
				+"Chuan doan: "+chuanDoan+"\n"
				+benhVien;
	}
}

 class BenhVien{
	String ten;
	String diaChi;
	String giamDoc;
	
	public BenhVien(String ten,String diaChi,String giamDoc) {
		this.ten=ten;
		this.diaChi=diaChi;
		this.giamDoc=giamDoc;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getGiamDoc() {
		return giamDoc;
	}

	public void setGiamDoc(String giamDoc) {
		this.giamDoc = giamDoc;
	}
	
	public String toString() {
		return "Ten benh vien: "+ten+"\n"
				+"Dia chi BV: "+diaChi+"\n"
				+"Giam doc: "+giamDoc;
	}
}
public class Bai1_test{
	public static void main(String args) {
		BenhVien BV = new BenhVien("benh vien phuong dong","56b pho vien","nguyen quang minh");
		BenhNhan BN = new BenhNhan("le hoai nam","nam",20,"binh thuong","binh thuong",BV);
		System.out.println(BV);
		System.out.println(BN.toString());
	}
}