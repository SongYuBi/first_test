package com.kh.part02_abstractClassAndInetrface.model.vo;

import java.io.Serializable;

public class Book extends Product implements IProduct, Serializable {

	public Book() {}
	
	public void printBook() {
		System.out.println("Book Ŭ������ printBook()�޼ҵ� ����");
	}
	@Override
	public String toString() {
		return "Book Ŭ������ toString() �޼ҵ� ����...";
	}
	
	@Override
	public void abstImethod() {
	}

	@Override
	public void absMethod() {
	}

}
