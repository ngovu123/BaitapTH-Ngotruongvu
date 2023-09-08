
public class ThanhVien {
	int mnv;
    String hoten;

    public ThanhVien(int mnv, String hoten) {
        this.mnv = mnv;
        this.hoten = hoten;
    }

    public int getMnv() {
        return mnv;
    }

    public String getHoten() {
        return hoten;
    }

    @Override
    public String toString() {
        return mnv + "\t" + hoten;
    }
}
