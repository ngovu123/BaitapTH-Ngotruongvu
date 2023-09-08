
public class Phone extends Product{
	public Phone(int maSanPham, String tenSanPham, double giaGoc) {
        super(maSanPham, tenSanPham, giaGoc);
    }

    @Override
    public double tinhGiaBan() {
        return super.getGiaGoc() + super.getGiaGoc() * 0.1;
    }
}
