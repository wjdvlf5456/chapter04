package com.javaex.ex05;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {

		Set<Integer> iset = new HashSet<Integer>();

		// int i = 12;
		Integer i01 = 4;
		Integer i02 = 5;
		Integer i03 = 6;

		// 위에 있는 값들을 추가
		iset.add(i01);
		iset.add(i02);
		iset.add(i03);

		// 배열크기
		System.out.println(iset.size());

		// 배열의 각 값들을 출력
		System.out.println(iset.toString());

		System.out.println("----------------");

		// 배열의 값들을 순서대로 출력
		for (Integer num : iset) {
			System.out.println(num.toString());
		}
		System.out.println("----------------");

		// 중복체크
		Integer i04 = 5;
		iset.add(i04);

		System.out.println("----------------");
		for (Integer num : iset) {
			System.out.println(num.toString());
		}
		System.out.println("----------------");

	}

}