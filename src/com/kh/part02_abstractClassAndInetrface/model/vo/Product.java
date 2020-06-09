package com.kh.part02_abstractClassAndInetrface.model.vo;

// 추상메소드를 멤버로 가진 경우 class 앞에 반드시 abstract 키워드를 사용해야 한다.
// 추상클래스는 미완성 클래스를 말한다. 추상클래스를 이용해서 객체를 생성하지 못한다.
//객체 생성하기 위해서는 상속을 받은 하위 클래스를 이용해서 객체를 생성해야 한다.
public abstract class Product {

	// 추상메소드(미완성 메소드) : 메소드에 헤드만 있고 바디가 없는 메소드
	// 후손클래스에서 완성(오버라이딩) 시켜서 사용해야 한다.
	public abstract void absMethod();

	// 추상 클래스에도 생성자를 작성할 수 있다.
	public Product() {
	}


	public void printProduct() {
		System.out.println("Product 클래스의 메소드 실행");
	}

	@Override
	public String toString() {
		return "Product 의 toString()메소드 실행..";
	}
}
