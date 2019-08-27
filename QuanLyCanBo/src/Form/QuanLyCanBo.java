package Form;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.event.TableColumnModelListener;
public class QuanLyCanBo {
	public DSCB danhsach;
	public Scanner reader;
	ArrayList<CanBo> danhsachs = new ArrayList<CanBo>();

	public QuanLyCanBo() {
		danhsach = new DSCB();
		reader = new Scanner(System.in);
	}

	private void themCanBo() {
		System.out.println("Nhap 1 - Thêm cong nhan");
		System.out.println("Nhap 2 - Thêm ky su");
		System.out.println("Nhap 3 - Them nhan vien phuc vu");
		System.out.println("Nhap 0 - Ket thuc them nhan vien");
		int luaChon = 0;
		do {
			System.out.println("Ban chon them loai nhan vien:");
			luaChon = Integer.parseInt(reader.nextLine());
			switch (luaChon) {
			case 1:
				if (danhsach.them(taoCongNhan())) {
					System.out.println("them moi cong nhan thanh cong");
				} else {
					System.out.println("them moi cong nhan that bai");
				}
				break;
			case 2:
				if (danhsach.them(taoKySu())) {
					System.out.println("them moi ky su thanh cong");
				} else {
					System.out.println("them moi ky su that bai");
				}
				break;
			case 3:
				if (danhsach.them(taoNhanVienPV())) {
					System.out.println("them moi nhan vien thanh cong");
				} else {
					System.out.println("them moi nhan vien thanh cong");
				}
				break;
			}
		} while (luaChon != 0);

	}

	private CanBo taoNhanVienPV() {
		NhanVienPV canBo = new NhanVienPV();
		System.out.println("Nhap ho ten:");
		canBo.setHoten(reader.nextLine());
		System.out.println("Nhap gioi tinh:");
		canBo.setGioitinh(reader.nextLine());
		System.out.println("Nhap nam sinh:");
		canBo.setNamsinh(Integer.parseInt(reader.nextLine()));
		System.out.println("Nhap dia chi:");
		canBo.setDiachi(reader.nextLine());
		System.out.println("Nhap cong viec:");
		canBo.setCongviec(reader.nextLine());
		return canBo;
	}

	private CanBo taoCongNhan() {
		CongNhan canBo = new CongNhan();
		System.out.println("Nhap ho ten:");
		canBo.setHoten(reader.nextLine());
		System.out.println("Nhap gioi tinh:");
		canBo.setGioitinh(reader.nextLine());
		System.out.println("Nhap nam sinh:");
		canBo.setNamsinh(Integer.parseInt(reader.nextLine()));
		System.out.println("Nhap dia chi:");
		canBo.setDiachi(reader.nextLine());
		System.out.println("Nhap bac:");
		canBo.setBac(Integer.parseInt(reader.nextLine()));
		return canBo;
	}

	private CanBo taoKySu() {
		KySu canBo = new KySu();
		System.out.println("Nhap ho ten:");
		canBo.setHoten(reader.nextLine());
		System.out.println("Nhap gio tinh:");
		canBo.setGioitinh(reader.nextLine());
		System.out.println("Nhap nam sinh:");
		canBo.setNamsinh(Integer.parseInt(reader.nextLine()));
		System.out.println("Nhap dia chi:");
		canBo.setDiachi(reader.nextLine());
		System.out.println("Nhap nganh dao tao:");
		canBo.setNganhdt(reader.nextLine());
		return canBo;
	}
	private void hienThiThongTinCanBo(CanBo canBo) {
		System.out.println("ten : " + canBo.getHoten());
		System.out.println("gioi tinh :" + canBo.getGioitinh());
		System.out.println("nam sinh: " + canBo.getNamsinh());
		System.out.println("dia chi :" + canBo.getDiachi());
		if (canBo instanceof CongNhan) {
			CongNhan congNhan = (CongNhan) canBo;
			System.out.println("bac: " + congNhan.getBac());
		} else {
			if (canBo instanceof KySu) {
				KySu kySu = (KySu) canBo;
				System.out.println("nganh dao tao :" + kySu.getNganhdt());
			} else {
				NhanVienPV nhanVienPV = (NhanVienPV) canBo;
				System.out.println("cong viec :" + nhanVienPV.getCongviec());
			}
		}
	}

	private void hienThiDanhSachCanBo() {
		for (CanBo canBo : danhsach.layDanhSachCanBo()) {
			hienThiThongTinCanBo(canBo);
		}
	}
	public void mainMenu() {
		System.out.println("Nhap 4 - Them");
		System.out.println("Nhap 5 - Hien thi danh sach");
		System.out.println("Nhap 6 - tim theo ten");
		System.out.println("Nhap 0 - Ket thuc");
		int luaChon = 0;
		do {
			System.out.println("ban chon chuc nang:");
			luaChon = Integer.parseInt(reader.nextLine());
			switch (luaChon) {
			case 4:
				themCanBo();
				break;
			case 5:
				hienThiDanhSachCanBo();
				break;
			case 6:
				CanBo canBo = new CanBo();
				System.out.println("nhan vien can tim");
				canBo.setHoten(reader.nextLine());
			}
		} while (luaChon != 0);
	}
}
