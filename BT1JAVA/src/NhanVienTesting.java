
public class NhanVienTesting extends ThanhVien{
	String loaiKiemThu;

    public NhanVienTesting(int mnv, String hoten, String loaiKiemThu) {
        super(mnv, hoten);
        this.loaiKiemThu = loaiKiemThu;
    }

    public String getLoaiKiemThu() {
        return loaiKiemThu;
    }

    @Override
    public String toString() {
        return super.toString() + "\tLoai kiem thu: " + loaiKiemThu;
    }
}
