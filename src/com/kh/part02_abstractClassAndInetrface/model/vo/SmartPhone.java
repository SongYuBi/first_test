package com.kh.part02_abstractClassAndInetrface.model.vo;

public class SmartPhone extends Product {

	public SmartPhone() {
	}

	public void printSmartPhone() {
		System.out.println("SmartPhone 클래스의 printSmartPhone() 메소드 실행");
	}

	// 상속받은 부모의 추상메소드는 반드시 오버라이딩 해야한다.
	@Override
	public String toString() {
		return "Smart Phone 클래스의 toString 메소드실행";

	}


	@Override
	public void absMethod() {
		// TODO Auto-generated method stub
		
	}

}
