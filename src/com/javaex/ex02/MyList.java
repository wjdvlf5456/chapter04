package com.javaex.ex02;

public class MyList {

	// 필드
	private Object[] oArray;
	private int crtPos;

	// 생성자
	public MyList() {
		oArray = new Object[100];
		crtPos = 0;
	}

	// 메소드 - gs

	// 메소드 - 일반
	public void add(Object obj) {

		oArray[crtPos] = obj;
		crtPos = crtPos + 1;	// crtPos++
	}

	public int size() {
		return crtPos;

	}

	public Object get(int index) {
		return oArray[index];
	}


}
