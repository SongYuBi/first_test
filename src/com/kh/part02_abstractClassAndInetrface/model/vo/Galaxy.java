package com.kh.part02_abstractClassAndInetrface.model.vo;

public class Galaxy extends SmartPhone {

	public Galaxy() {
	}

	public void printGalaxy() {
		System.out.println("Galaxy Ŭ������ printGalaxy() �޼ҵ� ����...");
	}

	@Override
	public String toString() {
		return "Galaxy Ŭ������ toString �޼ҵ� ����";
	}
}
