package com.kh.part01_polymorphismTest.animal.model.vo;

public class Tiger extends Animal {

	public Tiger(int hp, int exp, String kinds) {
		super(hp, exp, kinds);
	}

	@Override
	public void cry() {
		System.out.println("ȣ������ ���ԼҸ��� �ϴ��� �︳�ϴ�.");
	}

	public void punch() {
		System.out.println("ȣ���̰� �ɳ���ġ�� �����ϴ�. ȿ���� ����մϴ�.");

	}

	public void hitTiger() {
		System.out.println("ȣ���̰� ��û�� ������� �Ծ����ϴ�. \n hp 50����.");
		super.setHp(super.getHp() - 50);
	
		if(super.getHp() <= 0) {
			System.out.println("ȣ���̰� ���������ϴ�. " + super.getExp() + "��ŭ�� ����ġ�� ����մϴ�.");
		}
	}
	
}
