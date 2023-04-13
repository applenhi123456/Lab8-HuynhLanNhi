public class SanPham {
    private String tenSp;
    private double donGia;
    private double giamGia;
    
    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    
    public double getThueNhapKhau() {
        return donGia * 0.1; // tính thuế nhập khẩu là 10% giá sản phẩm
    }
    
    public void xuat() {
        System.out.println("Tên sản phẩm: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
    }
    
    public void nhap() {
    }
}
