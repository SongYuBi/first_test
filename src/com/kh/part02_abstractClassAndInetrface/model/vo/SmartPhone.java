package com.kh.part02_abstractClassAndInetrface.model.vo;

public class SmartPhone extends Product {

	public SmartPhone() {
	}

	public void printSmartPhone() {
		System.out.println("SmartPhone Ŭ������ printSmartPhone() �޼ҵ� ����");
	}

	// ��ӹ��� �θ��� �߻�޼ҵ�� �ݵ�� �������̵� �ؾ��Ѵ�.
	@Override
	public String toString() {
		return "Smart Phone Ŭ������ toString �޼ҵ����";

	}


	@Override
	public void absMethod() {
		// TODO Auto-generated method stub
		
	}

}
