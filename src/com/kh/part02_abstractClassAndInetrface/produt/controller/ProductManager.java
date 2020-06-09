package com.kh.part02_abstractClassAndInetrface.produt.controller;

import com.kh.part02_abstractClassAndInetrface.model.vo.Book;
import com.kh.part02_abstractClassAndInetrface.model.vo.Galaxy;
import com.kh.part02_abstractClassAndInetrface.model.vo.Product;
import com.kh.part02_abstractClassAndInetrface.model.vo.SmartPhone;

public class ProductManager {

	public void testPolymorphism() {
		// ������
		// ��Ӱ��迡 �ִ� Ŭ������ ��� �θ�Ŭ������ ���۷��� ������ �ڽ� Ŭ������ ������
		// ��ü�� �ּҸ� ������ �� �ִ�.

		// Product p = new Product();
		// �߻� Ŭ�����̱⶧���� ��ü�� �������� ���Ѵ�.

		// �߻�Ŭ������ ��ӹ��� ���� Ŭ������ ��ü�� �����ؾ� �Ѵ�.
		// �̋� �߻�Ŭ������ ���۷��� ������ �ڷ������� ���� �� �ִ�.
		Product p1 = new SmartPhone();
		Product p2 = new Galaxy();
		Product p3 = new Book();

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

		Object obj1 = p1;
		Object obj2 = p2;

		// �ļ� Ŭ���� Ÿ�����δ� �θ� ��ü�� �ּҸ� ���� �� ����.
		// Galaxy g = new SmartPhone();
		// Galaxy g = (Galaxy) new SmartPhone();

		SmartPhone s1 = new Galaxy();
		s1.printProduct();
		s1.printSmartPhone();

		// �ڽ�Ŭ������ ������ �޼ҵ带 ȣ���ϱ� ���ؼ��� �θ�Ÿ������ ����ȯ �ؾ��Ѵ�.(down casting)
		((Galaxy) s1).printGalaxy();

		print(new Galaxy());

	}

	public void print(Object obj) {
		// �θ� ���۷����� �ļ� ��ü�� �ּҸ� �޴� �������� �ڵ����� Ŭ���� ����ȯ�� �߻���(up casting)
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
		// ��ü �迭������ ������ ���� �����ϴ�.
		Object[] arr = new Object[10];

		arr[0] = new String("���ڿ� ��ü");
		arr[1] = new java.util.Date();
		// arr[2] = new Product(); �߻�Ŭ������ ��ü �����Ұ�
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
