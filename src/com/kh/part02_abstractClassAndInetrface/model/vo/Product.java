package com.kh.part02_abstractClassAndInetrface.model.vo;

// �߻�޼ҵ带 ����� ���� ��� class �տ� �ݵ�� abstract Ű���带 ����ؾ� �Ѵ�.
// �߻�Ŭ������ �̿ϼ� Ŭ������ ���Ѵ�. �߻�Ŭ������ �̿��ؼ� ��ü�� �������� ���Ѵ�.
//��ü �����ϱ� ���ؼ��� ����� ���� ���� Ŭ������ �̿��ؼ� ��ü�� �����ؾ� �Ѵ�.
public abstract class Product {

	// �߻�޼ҵ�(�̿ϼ� �޼ҵ�) : �޼ҵ忡 ��常 �ְ� �ٵ� ���� �޼ҵ�
	// �ļ�Ŭ�������� �ϼ�(�������̵�) ���Ѽ� ����ؾ� �Ѵ�.
	public abstract void absMethod();

	// �߻� Ŭ�������� �����ڸ� �ۼ��� �� �ִ�.
	public Product() {
	}


	public void printProduct() {
		System.out.println("Product Ŭ������ �޼ҵ� ����");
	}

	@Override
	public String toString() {
		return "Product �� toString()�޼ҵ� ����..";
	}
}
