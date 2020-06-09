package com.kh.part01_polymorphismTest.animal.controller.run;

import com.kh.part01_polymorphismTest.animal.model.vo.Animal;
import com.kh.part01_polymorphismTest.animal.model.vo.Chicken;
import com.kh.part01_polymorphismTest.animal.model.vo.Player;
import com.kh.part01_polymorphismTest.animal.model.vo.Tiger;

public class PlayerManager {

	public void stratPlay(String name) {

		Player p = new Player(name);

		System.out.println("ㄷㄷㄷㅈ \n" + p.getName() + "님이 게임에 입장하셨습니다.");

		// 닭 등장
		// Chicken c1 = new Chicken(100,100,"초보닭");
		Animal c1 = new Chicken(100, 100, "초보닭");

		c1.cry();

		// 닭 공격
		if (c1 instanceof Chicken) { // 해당 클래스가 맞는지 확인
			((Chicken) c1).hitChicken(); // 해당 클래스의 메소드 실행
		}

		for (int i = c1.getHp(); i > 0; i -= 10) {
			if (c1 instanceof Chicken) {
				((Chicken) c1).hitChicken();
			}
		}
		p.setExp(p.getExp() + c1.getExp());
		System.out.println(p);

		Animal t1 = new Tiger(1000, 1000, "시베리안 호랑이");

		t1.cry();

		for (int i = t1.getHp(); i > 0; i -= 50) {
			if (t1 instanceof Tiger) {
				((Tiger) t1).hitTiger();
				
			}
		}
		p.setExp(p.getExp() + t1.getExp());
		System.out.println(p);
	}

}
