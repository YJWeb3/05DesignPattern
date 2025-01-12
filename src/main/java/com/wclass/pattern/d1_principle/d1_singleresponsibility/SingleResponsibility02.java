package com.wclass.pattern.d1_principle.d1_singleresponsibility;

public class SingleResponsibility02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoadVehicle roadVehicle = new RoadVehicle();
		roadVehicle.run("摩托车");
		roadVehicle.run("汽车");

		AirVehicle airVehicle = new AirVehicle();

		airVehicle.run("飞机");
	}
}

// 方案2的分析
// 1. 遵守单一职责原则,但是改动大,即将类分解，同时还要修改客户端
// 2. 如果类中方法数量足够少，分解成不同类，改动很大，同时还要改动客户端，效率极低,采用方案三!

class RoadVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + "公路运行");
	}
}

class AirVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + "天空运行");
	}
}

class WaterVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + "水中运行");
	}
}