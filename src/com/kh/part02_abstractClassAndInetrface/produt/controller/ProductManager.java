package com.kh.part02_abstractClassAndInetrface.produt.controller;

import com.kh.part02_abstractClassAndInetrface.model.vo.Book;
import com.kh.part02_abstractClassAndInetrface.model.vo.Galaxy;
import com.kh.part02_abstractClassAndInetrface.model.vo.Product;
import com.kh.part02_abstractClassAndInetrface.model.vo.SmartPhone;

public class ProductManager {

	public void testPolymorphism() {
		// 다형성
		// 상속관계에 있는 클래스의 경우 부모클래스형 레퍼런스 변수가 자식 클래스로 생성된
		// 객체의 주소를 보관할 수 있다.

		// Product p = new Product();
		// 추상 클래스이기때문에 객체를 생성하지 못한다.

		// 추상클래스를 상속받은 하위 클래스로 객체를 생성해야 한다.
		// 이떄 추상클래스는 레퍼런스 변수의 자료형으로 사용될 수 있다.
		Product p1 = new SmartPhone();
		Product p2 = new Galaxy();
		Product p3 = new Book();

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

		Object obj1 = p1;
		Object obj2 = p2;

		// 후손 클래스 타입으로는 부모 객체의 주소를 받을 수 없다.
		// Galaxy g = new SmartPhone();
		// Galaxy g = (Galaxy) new SmartPhone();

		SmartPhone s1 = new Galaxy();
		s1.printProduct();
		s1.printSmartPhone();

		// 자식클래스가 가지는 메소드를 호출하기 위해서는 부모타입으로 형변환 해야한다.(down casting)
		((Galaxy) s1).printGalaxy();

		print(new Galaxy());

	}

	public void print(Object obj) {
		// 부모 레퍼런스가 후손 객체의 주소를 받는 과정에서 자동으로 클래스 형변환이 발생함(up casting)
		// System.out.println(obj);

		System.out.println("=====================================");
		
		// if(obj instanceof Galaxy) {
		// ((Galaxy) obj).printGalaxy();
		// }
		//
		// if(obj instanceof Book) {
		// ((Book) obj).printBook();
		// }
		//
		// if(obj instanceof SmartPhone) {
		// ((SmartPhone) obj).printSmartPhone();
		// }
		//
		// if(obj instanceof Product) {
		// ((Product)obj).printProduct();
		// }

		if (obj instanceof Galaxy) {
			((Galaxy) obj).printGalaxy();
		} else if (obj instanceof Book) {
			((Book) obj).printBook();
		} else if (obj instanceof SmartPhone) {
			((SmartPhone) obj).printSmartPhone();
		} else if (obj instanceof Product) {
			((Product) obj).printProduct();
		}

	}

	public void objectArrayTest() {
		// 객체 배열에서도 다형성 적용 가능하다.
		Object[] arr = new Object[10];

		arr[0] = new String("문자열 객체");
		arr[1] = new java.util.Date();
		// arr[2] = new Product(); 추상클래스는 객체 생성불가
		arr[2] = new Book();
		arr[3] = new Galaxy();
		arr[4] = new SmartPhone();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] instanceof Galaxy) {
				((Galaxy) arr[i]).printGalaxy();
			} else if (arr[i] instanceof Book) {
				((Book) arr[i]).printBook();

			} else if (arr[i] instanceof SmartPhone) {
				((SmartPhone) arr[i]).printSmartPhone();
			} else {
				System.out.println(arr[i]);
			}
		}
	}

}
