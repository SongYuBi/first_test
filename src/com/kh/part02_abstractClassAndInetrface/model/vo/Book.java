package com.kh.part02_abstractClassAndInetrface.model.vo;

import java.io.Serializable;

public class Book extends Product implements IProduct, Serializable {

	public Book() {}
	
	public void printBook() {
		System.out.println("Book 클래스의 printBook()메소드 실행");
	}
	@Override
	public String toString() {
		return "Book 클래스의 toString() 메소드 실행...";
	}
	
	@Override
	public void abstImethod() {
	}

	@Override
	public void absMethod() {
	}

}
