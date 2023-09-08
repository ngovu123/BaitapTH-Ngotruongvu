import java.util.ArrayList;
import java.util.Scanner;
public class CtChinh {
	public static void main(String[] args) {
        ArrayList<ThanhVien> doiNhom = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int luaChon;

        do {
            System.out.println("MENU:");
            System.out.println("1. Them thanh vien doi");
            System.out.println("2. In danh ssch thanh vien doi");
            System.out.println("3. Tim thanh vien theo ma nhan vien");
            System.out.println("4. Thoat");
            System.out.print("Chon: ");
            luaChon = scanner.nextInt();
            scanner.nextLine(); 

            switch (luaChon) {
                case 1:
                    ThemThanhVien(doiNhom, scanner);
                    break;
                case 2:
                    InDanhSachThanhVien(doiNhom);
                    break;
                case 3:
                    TimVaInThanhVien(doiNhom, scanner);
                    break;
                case 4:
                    System.out.println("Chuong trinh ket thuc.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
                    break;
            }
        } while (luaChon != 4);
    }

    private static void ThemThanhVien(ArrayList<ThanhVien> doiNhom, Scanner scanner) {
        System.out.println("Chon loai thanh vien:");
        System.out.println("1. Lap trinh vien");
        System.out.println("2. Quan ly truong");
        System.out.println("3. Nhan vien testing");
        int loaiThanhVien = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Nhap ma nhan vien: ");
        int maNhanVien = scanner.nextInt();
        scanner.nextLine(); // 
        System.out.print("Nhap ho ten: ");
        String hoTen = scanner.nextLine();

        switch (loaiThanhVien) {
            case 1:
                System.out.print("Nhap so nam kinh nghiem: ");
                int namKinhNghiem = scanner.nextInt();
                doiNhom.add(new LapTrinhVien(maNhanVien, hoTen, namKinhNghiem));
                break;
            case 2:
                System.out.print("Nhap cap bac quan ly (1-5): ");
                int capBacQuanLy = scanner.nextInt();
                doiNhom.add(new QuanLyTruong(maNhanVien, hoTen, capBacQuanLy));
                break;
            case 3:
                System.out.print("Nhap loai kiem thu: ");
                String loaiKiemThu = scanner.nextLine();
                doiNhom.add(new NhanVienTesting(maNhanVien, hoTen, loaiKiemThu));
                break;
            default:
                System.out.println("Lua chon khong hop le.");
                break;
        }

        System.out.println("Them thanh vien thanh cong.");
    }

    private static void InDanhSachThanhVien(ArrayList<ThanhVien> doiNhom) {
        if (doiNhom.isEmpty()) {
            System.out.println("Danh sach thanh vien doi rong.");
        } else {
            System.out.println("Danh sach thanh vien doi:");
            for (ThanhVien thanhVien : doiNhom) {
                System.out.println(thanhVien);
            }
        }
    }

    private static void TimVaInThanhVien(ArrayList<ThanhVien> doiNhom, Scanner scanner) {
        System.out.print("Nhap ma nhan vien can tim: ");
        int maNhanVien = scanner.nextInt();

        boolean timThay = false;
        for (ThanhVien thanhVien : doiNhom) {
            if (thanhVien.getMnv() == maNhanVien) {
                System.out.println("Thong tin thanh vien:");
                System.out.println(thanhVien);
                timThay = true;
                break;
            }
        }

        if (!timThay) {
            System.out.println("Khong tim thay thanh vien voi ma so " + maNhanVien);
        }
    }
}
