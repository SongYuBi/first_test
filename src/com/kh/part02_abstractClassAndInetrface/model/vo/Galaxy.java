package com.kh.part02_abstractClassAndInetrface.model.vo;

public class Galaxy extends SmartPhone {

	public Galaxy() {
	}

	public void printGalaxy() {
		System.out.println("Galaxy 클래스의 printGalaxy() 메소드 실행...");
	}

	@Override
	public String toString() {
		return "Galaxy 클래스의 toString 메소드 실행";
	}
}
