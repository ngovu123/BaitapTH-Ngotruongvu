
public class QuanLyTruong extends ThanhVien{
	int capBacQuanLy;

    public QuanLyTruong(int mnv, String hoten, int capBacQuanLy) {
        super(mnv, hoten);
        this.capBacQuanLy = capBacQuanLy;
    }

    public int getCapBacQuanLy() {
        return capBacQuanLy;
    }

    @Override
    public String toString() {
        return super.toString() + "\tCap bac quan ly: " + capBacQuanLy;
    }
}
