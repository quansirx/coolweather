package com.coolweather.app.model;

public class Province {
	private int id;
	private String provinceName;
	private String provinceCode;
	public void setId(int id){
		this.id=id;
	}
public void setProvinceName(String provinceName){
		this.provinceName=provinceName;
	}
	public void setProvinceCode(String provinceCode){
		this.provinceCode=provinceCode;
	}
	public int getId(){
		return id;
	}
	public String getProvinceName(){
		return provinceName;
	}
	public String getProvinceCode(){
		return provinceCode;
	}
}
