import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập thông tin sản phẩm 1:");
        System.out.print("Tên sản phẩm: ");
        String tenSp1 = scanner.nextLine();
        System.out.print("Đơn giá: ");
        double donGia1 = scanner.nextDouble();
        System.out.print("Giảm giá: ");
        double giamGia1 = scanner.nextDouble();

        System.out.println("Nhập thông tin sản phẩm 2:");
        scanner.nextLine(); // đọc bỏ dòng trống
        System.out.print("Tên sản phẩm: ");
        String tenSp2 = scanner.nextLine();
        System.out.print("Đơn giá: ");
        double donGia2 = scanner.nextDouble();
        System.out.print("Giảm giá: ");
        double giamGia2 = scanner.nextDouble();

        SanPham sp1 = new SanPham(tenSp1, donGia1, giamGia1);
        SanPham sp2 = new SanPham(tenSp2, donGia2, giamGia2);

        System.out.println("Thông tin sản phẩm 1:");
        sp1.xuat();

        System.out.println("Thông tin sản phẩm 2:");
        sp2.xuat();
    }
}
