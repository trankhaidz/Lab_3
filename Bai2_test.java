package Lab4_bt;

class Nguoi2{
	String ten,gioiTinh;
	int tuoi;
	
	public Nguoi2() {
	}
	
	public Nguoi2(String ten,String gioiTinh, int tuoi) {
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
		return "Ten:"+ten+ "\n"
				+"Gioi Tinh:"+gioiTinh +"\n"
				+"Tuoi:"+tuoi;
	}
}

class SinhVien extends Nguoi2{
	String lop,nganh;
	Truong truong;
	
	public SinhVien(String ten,String gioiTinh, int tuoi,String lop,String nganh, Truong truong) {
		super(ten,gioiTinh,tuoi);
		this.lop=lop;
		this.nganh=nganh;
		this.truong=truong;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public String getNganh() {
		return nganh;
	}

	public void setNganh(String nganh) {
		this.nganh = nganh;
	}

	public Truong getTruong() {
		return truong;
	}

	public void setTruong(Truong truong) {
		this.truong = truong;
	}
	
	public String toString() {
		return super.toString()+"\n"
				+"Lop :"+lop+ "\n"
				+"Nganh: "+nganh+"\n"
				+truong;
	}
}

class Truong{
	String ten,diaChi,hieuTruong;
	
	public Truong(String ten, String diaChi, String hieuTruong) {
		this.ten=ten;
		this.diaChi=diaChi;
		this.hieuTruong=hieuTruong;
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

	public String getHieuTruong() {
		return hieuTruong;
	}

	public void setHieuTruong(String hieuTruong) {
		this.hieuTruong = hieuTruong;
	}
	
	public String toString() {
		return"Truong:"+ten+"\n"+"dia Chi:"+diaChi+"\n"+"Hieu Truong: "+hieuTruong;
	}
}

public class Bai2_test {

	public static void main(String[] args) {
		Truong truong = new Truong("Truong DH Mo-Dia Chat"," 18 Pho Vien","**********");
		SinhVien sv1 = new SinhVien("Tran Quang Khai","Nam",20,"DCCTCT66E2","Cong Nghe Thong Tin",truong);
		System.out.println(sv1.toString());
	}

}
