import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			Product[] danhSachSanPham = new Product[100];
			int soLuongSanPham = 0;

			do {
			    System.out.println("MENU:");
			    System.out.println("1. Them moi 1 Phone");
			    System.out.println("2. Them moi 1 Laptop");
			    System.out.println("3. In ra man hinh nhung Laptop co gia ban cao nhat");
			    System.out.println("0. Thoat chuong trinh");
			    System.out.print("Chon thao tac: ");
			    int luaChon = sc.nextInt();
			    sc.nextLine(); 
			    switch (luaChon) {
			        case 1:
			            System.out.print("Nhap ma san pham: ");
			            int maPhone = sc.nextInt();
			            sc.nextLine(); 
			            System.out.print("Nhap ten san pham: ");
			            String tenPhone = sc.nextLine();
			            System.out.print("Nhap gia goc: ");
			            double giaGocPhone = sc.nextDouble();
			            danhSachSanPham[soLuongSanPham++] = new Phone(maPhone, tenPhone, giaGocPhone);
			            break;
			        case 2:
			            System.out.print("Nhap ma san pham: ");
			            int maLaptop = sc.nextInt();
			            sc.nextLine(); 
			            System.out.print("Nhap ten san pham: ");
			            String tenLaptop = sc.nextLine();
			            System.out.print("Nhap gia goc: ");
			            double giaGocLaptop = sc.nextDouble();
			            System.out.print("Nhap so thang bao hanh: ");
			            int thangBaoHanh = sc.nextInt();
			            danhSachSanPham[soLuongSanPham++] = new Laptop(maLaptop, tenLaptop, giaGocLaptop, thangBaoHanh);
			            break;
			        case 3:
			            double giaBanCaoNhat = 0;
			            for (int i = 0; i < soLuongSanPham; i++) {
			                if (danhSachSanPham[i] instanceof Laptop) {
			                    double giaBan = danhSachSanPham[i].tinhGiaBan();
			                    if (giaBan > giaBanCaoNhat) {
			                        giaBanCaoNhat = giaBan;
			                    }
			                }
			            }

			            if (giaBanCaoNhat == 0) {
			                System.out.println("Khong ca Laptop nao trong danh sach.");
			            } else {
			                System.out.println("Danh sach Laptop co gia ban cao nhat:");
			                for (int i = 0; i < soLuongSanPham; i++) {
			                    if (danhSachSanPham[i] instanceof Laptop) {
			                        double giaBan = danhSachSanPham[i].tinhGiaBan();
			                        if (giaBan == giaBanCaoNhat) {
			                            System.out.println("Ma san pham: " + danhSachSanPham[i].getMaSanPham()
			                                    + ", Ten san pham: " + danhSachSanPham[i].getTenSanPham()
			                                    + ", Gia ban: " + giaBan);
			                        }
			                    }
			                }
			            }
			            break;
			        case 0:
			            System.out.println("Chuong trinh ket thuc.");
			            break;
			        default:
			            System.out.println("Lua chon khong hop le. Vui long chon lai.");
			            break;
			    }
			} while (true);
		}
    }
}
