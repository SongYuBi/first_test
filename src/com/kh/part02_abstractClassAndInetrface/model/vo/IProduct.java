package com.kh.part02_abstractClassAndInetrface.model.vo;

import java.io.Serializable;
import java.util.Iterator;

//�߻�޼ҵ�� ��� �ʵ常 ����� ���� �� �ִ�.
//�������̽����� �����  extends�� ����ϸ� ���� ����� �����Ѵ�.
//�������̽����� ����� implements �� ����� ��  ����.
public interface IProduct extends Serializable{ // �������̽����� ����� extends
	// ��� �ʵ常 ����� ���� �� �ִ�.
	// ����ʵ�� �ݵ�� ����� ���ÿ� �ʱ�ȭ�� �Ǿ� �־���Ѵ�.
	// public static final�� �����ص� ���������� public static final�� �ǹ̸� ������.
	public static final String PRODUCT_NAME = " ��Ǫ�� ";

	// �������̽� �ȿ� ����� �޼ҵ�� ��� �߻�޼ҵ��̱� ������
	// ����� public abstract�� ������ �� �ִ�.
	// ���������� public abstract�� �ǹ̸� ������.
	// void abstImethod();
	//���������� public �̱� ������ �������̵� �� public ���������ڷθ� �������̵��� �����ϴ�.
	public void abstImethod();

}
