package com.secondhomework.cenkcamkiran.DTO;

import java.util.Date;

public class YorumDTO {

    private String yorum;
    private Date yorum_tarihi;
    private Long urun_id;
    private Long kullanici_id;

	public YorumDTO(String yorum, Date yorum_tarihi, Long urun_id, Long kullanici_id) {
		super();
		this.yorum = yorum;
		this.yorum_tarihi = yorum_tarihi;
		this.urun_id = urun_id;
		this.kullanici_id = kullanici_id;
	}
	
	public String getYorum() {
		return yorum;
	}
	
	public void setYorum(String yorum) {
		this.yorum = yorum;
	}
	
	public Date getYorum_tarihi() {
		return yorum_tarihi;
	}
	
	public void setYorum_tarihi(Date yorum_tarihi) {
		this.yorum_tarihi = yorum_tarihi;
	}
	
	public Long getUrun_id() {
		return urun_id;
	}
	
	public void setUrun_id(Long urun_id) {
		this.urun_id = urun_id;
	}
	
	public Long getKullanici_id() {
		return kullanici_id;
	}
	
	public void setKullanici_id(Long kullanici_id) {
		this.kullanici_id = kullanici_id;
	}
    
    


}
