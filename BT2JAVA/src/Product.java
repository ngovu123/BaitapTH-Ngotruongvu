
public class Product {
	 private int maSanPham;
	    private String tenSanPham;
	    private double giaGoc;

	    public Product(int maSanPham, String tenSanPham, double giaGoc) {
	        this.maSanPham = maSanPham;
	        this.tenSanPham = tenSanPham;
	        this.giaGoc = giaGoc;
	    }

	    public int getMaSanPham() {
	        return maSanPham;
	    }

	    public String getTenSanPham() {
	        return tenSanPham;
	    }

	    public double getGiaGoc() {
	        return giaGoc;
	    }

	    public double tinhGiaBan() {
	        return giaGoc;
	    }
}
