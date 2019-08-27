package Form;

public class KySu extends CanBo {
	public String nganhdt;
	public KySu() {
		// TODO Auto-generated constructor stub
	}
	public KySu(String nganhdt, String hoten, int namsinh, String gioitinh, String diachi) {
        super(hoten, namsinh, gioitinh, diachi);
        this.nganhdt = nganhdt;
    }
	public String getNganhdt() {
		return nganhdt;
	}
	public void setNganhdt(String nganhdt) {
		this.nganhdt = nganhdt;
	}
	
}
