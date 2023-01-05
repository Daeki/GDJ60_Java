package com.iu.s4.objects6;

public class Robot {
	
	private ArmLeft armLeft;
	private ArmRight armRight;
	
	public Robot() {
		this.armRight = new ArmRight();
	}
	
	
	public ArmLeft getArmLeft() {
		return armLeft;
	}
	public void setArmLeft(ArmLeft armLeft) {
		this.armLeft = armLeft;
	}
	public ArmRight getArmRight() {
		return armRight;
	}
//	public void setArmRight(ArmRight armRight) {
//		this.armRight = armRight;
//	}
	
	

}
