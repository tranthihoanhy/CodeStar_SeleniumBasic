package BTVN4;

public class HinhVuong extends HinhHoc {
	public int ChieuDaiMotCanh = 10;

	public void setChieuDaiMotCanh(double ChieuDaiMotCanh) {
	}

	@Override
	public void tinhDienTich() {
		System.out.println("S hinh vuong: " + ChieuDaiMotCanh * 4);

	}

}
