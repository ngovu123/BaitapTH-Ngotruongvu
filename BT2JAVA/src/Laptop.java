
public class Laptop extends Product{
	private int thangBaoHanh;

    public Laptop(int maSanPham, String tenSanPham, double giaGoc, int thangBaoHanh) {
        super(maSanPham, tenSanPham, giaGoc);
        this.thangBaoHanh = thangBaoHanh;
    }

    @Override
    public double tinhGiaBan() {
        return super.getGiaGoc() + thangBaoHanh * 100000;
    }
}
