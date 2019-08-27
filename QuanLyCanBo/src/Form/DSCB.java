package Form;
import java.util.ArrayList;
public class DSCB {
	ArrayList<CanBo> danhsachs = new ArrayList<CanBo>();
	public boolean them(CanBo cb) {
		return danhsachs.add(cb);	
	}
	public ArrayList<CanBo> layDanhSachCanBo(){
		return danhsachs;
	}
	public CanBo timNhanVien(){
		String ten=null;
	        for(CanBo cb: danhsachs){
	            if(cb.getHoten().equalsIgnoreCase(ten)){
	                return cb;
	            }
	        }
	        return null;
	    }
}
