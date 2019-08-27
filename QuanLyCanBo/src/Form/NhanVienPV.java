package Form;

public class NhanVienPV extends CanBo{
	public String congviec;
	public NhanVienPV() {
		// TODO Auto-generated constructor stub
	}
    public NhanVienPV(String congviec, String hoten, int namsinh, String gioitinh, String diachi) {
        super(hoten, namsinh, gioitinh, diachi);
        this.congviec = congviec;
    }
	public String getCongviec() {
		return congviec;
	}
	public void setCongviec(String congviec) {
		this.congviec = congviec;
	}
    
}
