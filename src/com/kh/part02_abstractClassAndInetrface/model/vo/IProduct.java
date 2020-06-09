package com.kh.part02_abstractClassAndInetrface.model.vo;

import java.io.Serializable;
import java.util.Iterator;

//추상메소드와 상수 필드만 멤버로 가질 수 있다.
//인터페이스간의 상속은  extends를 사용하며 다중 상속을 지원한다.
//인터페이스간의 상속은 implements 를 사용할 수  없다.
public interface IProduct extends Serializable{ // 인터페이스간의 상속은 extends
	// 상수 필드만 멤버로 가질 수 있다.
	// 상수필드는 반드시 선언과 동시에 초기화가 되어 있어야한다.
	// public static final을 생략해도 묵시적으로 public static final의 의미를 가진다.
	public static final String PRODUCT_NAME = " 상푸명 ";

	// 인터페이스 안에 선언된 메소드는 모두 추상메소드이기 때문에
	// 선언시 public abstract를 생략할 수 있다.
	// 묵시적으로 public abstract의 의미를 가진다.
	// void abstImethod();
	//묵시적으로 public 이기 때문에 오버라이딩 시 public 접근제한자로만 오버라이딩이 가능하다.
	public void abstImethod();

}
