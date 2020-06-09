package com.kh.part01_polymorphismTest.animal.model.vo;

public class Chicken extends Animal {

	public Chicken(int hp, int exp,String kinds) {
		super(hp,exp,kinds);
		
	}
	@Override
	public void cry() {
		System.out.println("닭이 꼬끼오! 하고 울었다.");
	}
	
	public void peck() {
		System.out.println("닭의 몸통 박치기");
	}
	
	public void hitChicken() {
		System.out.println("상대의 위력은 대단했다. 닭의 hp가 10감소합니다.");
		super.setHp(super.getHp() - 10);
		if(super.getHp() <=0) {
			System.out.println("닭이 쓰러집니다. 경험치가 증가합니다.  +" + super.getExp());
		}
	}
}
