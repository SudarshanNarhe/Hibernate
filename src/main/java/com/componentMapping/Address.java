package com.componentMapping;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private int roomNo;
	private String pincode;
	private String cityname;
	
	public Address() {
		
	}

	public Address(int roomNo, String pincode, String cityname) {
		super();
		this.roomNo = roomNo;
		this.pincode = pincode;
		this.cityname = cityname;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	@Override
	public String toString() {
		return "Address [roomNo=" + roomNo + ", pincode=" + pincode + ", cityname=" + cityname + "]";
	}

	
	
	
	
}
