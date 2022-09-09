package com.cg.cropdeal.cropitem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="crops")
public class cropItem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "crop_name", nullable = false)
	private String cropname;
	
	@Column(name = "crop_type")
	private String croptype;
	
	@Column(name = "crop_qnt")
	private String cropqnt;
	
	@Column(name = "crop_price")
	private String cropprice;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCropname() {
		return cropname;
	}

	public void setCropname(String cropname) {
		this.cropname = cropname;
	}

	public String getCroptype() {
		return croptype;
	}

	public void setCroptype(String croptype) {
		this.croptype = croptype;
	}

	public String getCropqnt() {
		return cropqnt;
	}

	public void setCropqnt(String cropqnt) {
		this.cropqnt = cropqnt;
	}

	public String getCropprice() {
		return cropprice;
	}

	public void setCropprice(String cropprice) {
		this.cropprice = cropprice;
	}

	public cropItem(long id, String cropname, String croptype, String cropqnt, String cropprice) {
		super();
		this.id = id;
		this.cropname = cropname;
		this.croptype = croptype;
		this.cropqnt = cropqnt;
		this.cropprice = cropprice;
	}
	
	public cropItem() {
		
	}

	
	
}
