package BTVN4;

public class Application {

    public static void main(String[] args) {
        HinhTron hinhTron = new HinhTron();
        hinhTron.setTenHinh("Hinh tron");
        hinhTron.setBanKinh(10);

        HinhVuong hinhVuong = new HinhVuong();
        hinhVuong.setTenHinh("Hinh vuong");
        hinhVuong.setChieuDaiMotCanh(4.0);

        System.out.println("Ten hinh: " + hinhTron.gettenHinh());
        System.out.println("Ten hinh: " + hinhVuong.gettenHinh());

        hinhTron.tinhDienTich();
        hinhVuong.tinhDienTich();
    }
}
