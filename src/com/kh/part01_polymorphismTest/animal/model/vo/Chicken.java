package com.kh.part01_polymorphismTest.animal.model.vo;

public class Chicken extends Animal {

	public Chicken(int hp, int exp,String kinds) {
		super(hp,exp,kinds);
		
	}
	@Override
	public void cry() {
		System.out.println("���� ������! �ϰ� �����.");
	}
	
	public void peck() {
		System.out.println("���� ���� ��ġ��");
	}
	
	public void hitChicken() {
		System.out.println("����� ������ ����ߴ�. ���� hp�� 10�����մϴ�.");
		super.setHp(super.getHp() - 10);
		if(super.getHp() <=0) {
			System.out.println("���� �������ϴ�. ����ġ�� �����մϴ�.  +" + super.getExp());
		}
	}
}
