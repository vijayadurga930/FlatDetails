package com.cg.frs.dto;

public class FlatRegistrationDTO {

	int FlatType;
	double Flatarea;
	double rent;
	double deposit;
	public FlatRegistrationDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FlatRegistrationDTO( int flatType, double flatarea, double rent, double deposit) {
		super();
	
		FlatType = flatType;
		Flatarea = flatarea;
		this.rent = rent;
		this.deposit = deposit;
	}
	@Override
	public String toString() {
		return "FlatRegistrationDTO [ FlatType=" + FlatType + ", Flatarea=" + Flatarea
				+ ", rent=" + rent + ", deposit=" + deposit + "]";
	}
	
	public int getFlatType() {
		return FlatType;
	}
	public void setFlatType(int flatType) {
		FlatType = flatType;
	}
	public double getFlatarea() {
		return Flatarea;
	}
	public void setFlatarea(double flatarea) {
		Flatarea = flatarea;
	}
	public double getRent() {
		return rent;
	}
	public void setRent(double rent) {
		this.rent = rent;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
}