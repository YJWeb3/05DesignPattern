package com.wclass.pattern.d1_principle.d1_singleresponsibility;

public class SingleResponsibility01 {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.run("摩托车");
		vehicle.run("汽车");
		vehicle.run("飞机");
	}

}

// 交通工具类
// 方案1
// 1. 在 方案1 的run方法中，违反了单一职责原则
// 2. 解决的方案非常简单，根据交通工具运行方法不同，分解成不同类即可
class Vehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + " 在公路上运行....");
	}
}
