package com.kh.part01_polymorphismTest.animal.run;

import java.util.Scanner;

import com.kh.part01_polymorphismTest.animal.controller.run.PlayerManager;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PlayerManager pm = new PlayerManager();
		
		System.out.print("�÷��̾��� ���̵� �Է��ϼ��� : ");
		String name = sc.nextLine();
		
		pm.stratPlay(name);
	}

}