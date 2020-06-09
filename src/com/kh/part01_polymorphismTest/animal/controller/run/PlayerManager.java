package com.kh.part01_polymorphismTest.animal.controller.run;

import com.kh.part01_polymorphismTest.animal.model.vo.Animal;
import com.kh.part01_polymorphismTest.animal.model.vo.Chicken;
import com.kh.part01_polymorphismTest.animal.model.vo.Player;
import com.kh.part01_polymorphismTest.animal.model.vo.Tiger;

public class PlayerManager {

	public void stratPlay(String name) {

		Player p = new Player(name);

		System.out.println("�������� \n" + p.getName() + "���� ���ӿ� �����ϼ̽��ϴ�.");

		// �� ����
		// Chicken c1 = new Chicken(100,100,"�ʺ���");
		Animal c1 = new Chicken(100, 100, "�ʺ���");

		c1.cry();

		// �� ����
		if (c1 instanceof Chicken) { // �ش� Ŭ������ �´��� Ȯ��
			((Chicken) c1).hitChicken(); // �ش� Ŭ������ �޼ҵ� ����
		}

		for (int i = c1.getHp(); i > 0; i -= 10) {
			if (c1 instanceof Chicken) {
				((Chicken) c1).hitChicken();
			}
		}
		p.setExp(p.getExp() + c1.getExp());
		System.out.println(p);

		Animal t1 = new Tiger(1000, 1000, "�ú����� ȣ����");

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
