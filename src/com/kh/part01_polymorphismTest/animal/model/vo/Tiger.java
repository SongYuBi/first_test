package com.kh.part01_polymorphismTest.animal.model.vo;

public class Tiger extends Animal {

	public Tiger(int hp, int exp, String kinds) {
		super(hp, exp, kinds);
	}

	@Override
	public void cry() {
		System.out.println("호랑이의 고함소리가 하늘을 울립니다.");
	}

	public void punch() {
		System.out.println("호랑이가 냥냥펀치를 날립니다. 효과가 대단합니다.");

	}

	public void hitTiger() {
		System.out.println("호랑이가 엄청난 대미지를 입었습니다. \n hp 50감소.");
		super.setHp(super.getHp() - 50);
	
		if(super.getHp() <= 0) {
			System.out.println("호랑이가 쓰러졌습니다. " + super.getExp() + "만큼의 경험치가 상승합니다.");
		}
	}
	
}
