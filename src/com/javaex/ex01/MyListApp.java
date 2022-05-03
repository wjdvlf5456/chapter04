package com.javaex.ex01;

public class MyListApp {

	public static void main(String[] args) {

		/*
		Point[] pArray = new Point[100]; //갯수를 정해야 된다
		Point p00 = new Point(2, 3);
		Point p01 = new Point(12, 13);
		Point p02 = new Point(22, 23);
		
		pArray[0] = p00;
		pArray[1] = p01;
		pArray[2] = p02;
		
		for(int i=0; i<pArray.length; i++) {
			System.out.println(pArray[i].toString());
		}
		*/

		///////////////////////////////////////
		// Point 관리
		PointList pList = new PointList();

		Point p01 = new Point(2, 3);
		Point p02 = new Point(12, 13);

		pList.add(p01);
		pList.add(p02);

		// Point 갯수
		System.out.println(pList.size());

		// [1]방의 y값
		Point p = pList.get(1);
		System.out.println(p.getY());

		// 전체 출력toString();
		for (int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}

		System.out.println("----------------------------");
		///////////////////////////////////////
		// Circle 관리
		CircleList cList = new CircleList();

		Circle c01 = new Circle(5);
		Circle c02 = new Circle(9);

		cList.add(c01);
		cList.add(c02);
		// cList.add(p01);

		// Circle 갯수
		System.out.println(cList.size());

		// [1]방의 반지름
		Circle c = cList.get(1);
		System.out.println(c.getRadius());

		// 전체출력toString();
		for (int i = 0; i < cList.size(); i++) {
			System.out.println(cList.get(i).toString());
		}

	}

}