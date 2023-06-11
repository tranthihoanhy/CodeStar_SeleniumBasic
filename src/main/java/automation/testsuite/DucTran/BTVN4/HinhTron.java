package BTVN4;

public class HinhTron extends HinhHoc {
	public int BanKinh = 10;

	public double getBanKinh() {
		return BanKinh;
	}
	

	public void setBanKinh(double getBanKinh) {
		this.BanKinh = BanKinh;

	}
	@Override
	public void tinhDienTich() {  
		System.out.println("S hinh tron:"  + 2* 3.14 * BanKinh);

	}

}
