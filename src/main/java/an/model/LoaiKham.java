package an.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="gia_kham")
public class LoaiKham {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	private String ten_hinh_thuc;
	private double gia_tien;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTen_hinh_thuc() {
		return ten_hinh_thuc;
	}
	public void setTen_hinh_thuc(String ten_hinh_thuc) {
		this.ten_hinh_thuc = ten_hinh_thuc;
	}
	public double getGia_tien() {
		return gia_tien;
	}
	public void setGia_tien(double gia_tien) {
		this.gia_tien = gia_tien;
	}
	@Override
	public String toString() {
		return "LoaiKham [id=" + id + ", ten_hinh_thuc=" + ten_hinh_thuc + ", gia_tien=" + gia_tien + "]";
	}
	
	
}