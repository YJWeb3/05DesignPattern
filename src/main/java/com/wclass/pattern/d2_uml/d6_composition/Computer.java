package com.wclass.pattern.d2_uml.d6_composition;

public class Computer {
	private Mouse mouse = new Mouse(); // 组合
	private Moniter moniter = new Moniter();// 组合
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	public void setMoniter(Moniter moniter) {
		this.moniter = moniter;
	}
	
}
