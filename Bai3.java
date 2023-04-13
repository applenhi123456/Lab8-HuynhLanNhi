public class SanPham {
    private String tenSp;
    private double donGia;
    private double giamGia;

    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham(String tenSp, double donGia) {
        this(tenSp, donGia, 0);
    }

    public void xuat() {
        System.out.println("Tên sản phẩm: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế thu nhập: " + getThueThuNhap());
    }

    private double getThueThuNhap() {
        return (donGia - giamGia) * 0.1;
    }
}
    class main {
      pubic stastic void main ( String[]args) {
        SanPham sp1 = new SanPham("Sản phẩm 1", 1000000, 200000);
        SanPham sp2 = new SanPham("Sản phẩm 2", 5000000);

        System.out.println("Thông tin sản phẩm 1:");
        sp1.xuat();

        System.out.println("Thông tin sản phẩm 2:");
        sp2.xuat();
      }
    }
