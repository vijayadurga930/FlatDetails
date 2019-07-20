package com.cg.frs.dto;

public class FlatOwner {
	int OwnerId;
	String Ownername;
	String Mobilenum;
	public FlatOwner(int ownerId, String ownername, String mobilenum) {
		super();
		OwnerId = ownerId;
		Ownername = ownername;
		Mobilenum = mobilenum;
	}
	public FlatOwner() {
		super();
	
	}
	public int getOwnerId() {
		return OwnerId;
	}
	public void setOwnerId(int ownerId) {
		OwnerId = ownerId;
	}
	public String getOwnername() {
		return Ownername;
	}
	public void setOwnername(String ownername) {
		Ownername = ownername;
	}
	public String getMobilenum() {
		return Mobilenum;
	}
	public void setMobilenum(String mobilenum) {
		Mobilenum = mobilenum;
	}
	@Override
	public String toString() {
		return "FlatOwner [OwnerId=" + OwnerId + ", Ownername=" + Ownername + ", Mobilenum=" + Mobilenum + "]";
	}

}
