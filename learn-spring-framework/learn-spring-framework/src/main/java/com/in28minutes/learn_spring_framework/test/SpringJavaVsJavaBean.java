package com.in28minutes.learn_spring_framework.test;

import java.io.Serializable;

class Pojo{
	private String text;
	private int number;
	
	@Override
	public String toString() {
		return text + ":" + number;
	}
}

class JavaBeans implements Serializable{
	private String text;
	private int number;
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
}



public class SpringJavaVsJavaBean {

	public static void main(String[] args) {
		
Pojo pojo = new Pojo();
System.out.println(pojo.toString());
	}

}
