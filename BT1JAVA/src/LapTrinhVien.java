
public class LapTrinhVien extends ThanhVien{
	 int namKinhNghiem;

	    public LapTrinhVien(int mnv, String hoten, int namKinhNghiem) {
	        super(mnv, hoten);
	        this.namKinhNghiem = namKinhNghiem;
	    }

	    public int getNamKinhNghiem() {
	        return namKinhNghiem;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\t" + namKinhNghiem + " nam kinh nghiem";
	    }
}
