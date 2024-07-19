package com.spring;

public class Address {
private int shopno;
private String areaName;
private String city;
public int getShopno() {
	return shopno;
}
public void setShopno(int shopno) {
	this.shopno = shopno;
}
public String getAreaName() {
	return areaName;
}
public void setAreaName(String areaName) {
	this.areaName = areaName;
}
public String getCity() {
	System.out.print(city);
	
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public Address(int shopno, String areaName, String city) {
	super();
	this.shopno = shopno;
	this.areaName = areaName;
	this.city = city;
}
@Override
public String toString() {
	return "Address [shopno=" + shopno + ", areaName=" + areaName + ", city=" + city + "]";
}

}
