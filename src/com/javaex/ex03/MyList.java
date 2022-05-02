package com.javaex.ex03;

public class MyList<T> {

	// 필드
	private T[] oArray;
	private int crtPos;

	// 생성자
	public MyList() {
		oArray = (T[]) new Object[3];
		crtPos = 0;
	}

	// 메소드 - gs

	// 메소드 - 일반
	public void add(T obj) {

		oArray[crtPos] = obj;
		crtPos++;	// crtPos++
	}

	public int size() {
		return crtPos;

	}

	public Object get(int index) {
		return oArray[index];
	}

}
