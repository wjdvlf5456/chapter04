package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {

		Set<Integer> iSet = new HashSet<Integer>();

		while (true) {

			if (iSet.size() < 6) {
				break;
			}

			// 번호를 생성한다.
			int num = (int) (Math.random() * 45) + 1;

			// set에 add한다
			iSet.add(num);

		}

		System.out.println("======================");
		for (Integer num : iSet) {
			System.out.println(num + "\t");
		}

	}

}
