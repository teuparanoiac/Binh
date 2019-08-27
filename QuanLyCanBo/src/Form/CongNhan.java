package Form;

public class CongNhan extends CanBo {
	public int bac;
	public CongNhan() {
	}
	 public CongNhan(int bac, String hoten, int namsinh, String gioitinh, String diachi) {
	        super(hoten, namsinh, gioitinh, diachi);
	        this.bac = bac;
	    }
	public int getBac() {
		return bac;
	}
	public void setBac(int bac) {
		this.bac = bac;
	}	 
}
