package com.greedy.section02.looping_statement;

import java.util.Scanner;

public class A_nestedFor {
	//중첩 for문
	
	/**
	 * <pre>
	 * 	 중첩 for문을 이용한 구구단 2단 부터 9단까지의 출력
	 * </pre>
	 */
	public void printGugudanFromTwoToNine() {
		
		// for문 안에 for문을 이용할 수 있다.
		for(int dan = 2; dan <= 9; dan++) {
			for(int su = 1; su <= 9; su++) {
				System.out.println(dan + " * " + su + " = " + (dan*su) + " ");
			}
			System.out.println();
		}
	}

	public void printUpgradeGugudanFromTwoToNine() {
		// 함수를 이용한 코드 축약
		for(int dan = 2; dan <= 9; dan++) {
			printGugudanOf(dan);
		}
		System.out.println();
	}
	/**
	 * <pre>
	 *  매개변수로 전달받은 단의 구구단 출력
	 *  </pre>
	 *  @param dan
	 */
	public void printGugudanOf(int dan) {

		for(int su = 1; su <= 9; su++) {
			System.out.println(dan + " * " + su + " = " + (dan*su) + " ");
		}
		System.out.println();
	}

	/**
	 * <pre>
	 *  키보드로 입력받은 정수의 수 만큼의 행만큼 별을 출력
	 *  </pre>
	 */
	public void printStarInputRowTimes() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출력할 행 수 를 입력하세요 : ");
		int row = sc.nextInt();
		
		for(int i = 1; i <= row; i++) {
			System.out.print("*");
		}
		sc.close();
	}
	public void printStar(int times) {
		
		for(int i = times; i >= 1; i--) {
			System.out.print("*");
		}
	}
//	*
//	**
//	***
//	****
	public void printTriangleStar() {

		Scanner sc = new Scanner(System.in);

		System.out.print("출력할 행 수 를 입력하세요 : ");
		int row = sc.nextInt();

		for(int i = 1; i <= row; i++) {
			printStar(i);
			System.out.println();
		}
		sc.close();
	}








}
