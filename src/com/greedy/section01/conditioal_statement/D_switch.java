package com.greedy.section01.conditioal_statement;

import java.util.Scanner;

public class D_switch {
	
	/**
	 * <pre>
	 * switch문 실행 흐름 확인 기능 제공
	 * switch문을 이용한 간단한 계산기 만들기
	 * </pre>
	 */
	public void testSimpleSwitchStatement() {
		/* switch문 표현식
		 * switch(비교할 변수) {
		 * 	 case 비교값1 : 비교값1과 일치하는 경우 실행 하는 구문; break;
		 * 	 case 비교값2 : 비교값2과 일치하는 경우 실행 하는 구문; break;
		 * 	 default : case에 모두 일치하는 않는 경우 실행 하는 구문; break;
		 * }
		 * 
		 * switch문에서 비교 가능한 자료형 -> 정수, 문자, 문자열(jdk 1.7이상만 가능)
		 * 			  비교 불가한 자료형 -> 실수, 논리
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력 : ");
		int first = sc.nextInt();
		
		System.out.print("두 번째 정수 입력 : ");
		int second = sc.nextInt();
		
		System.out.print("연산 기호 입력 : ");
		char op = sc.next().charAt(0);
		
		int result = 0;
		
		switch(op) {
		case '+' :
			result = first + second;
			break;
		case '-' :
			result = first - second;
			break;
		case '*' :
			result = first * second;
			break;
		case '/' :
			result = first / second;
			break;
		case '%' :
			result = first % second;
			break;
		}
		
		System.out.println(first + " " + op + " " + second + " = " + result);
		sc.close();
	}

	/**
	 * <pre>
	 *   switch문으로 문자열 값 비교 테스트 및 break 테스트
	 *   switch문을 이용한 간단한 자판기
	 *  </pre>
	 */
	public void testSwitchVendingMachine() {
		
		System.out.println("=== greedy vending machine ===");
		System.out.println(" 사이다  콜라  환타  박카스  핫식스");
		System.out.println("==========개선된 자판기===========");
		
		System.out.print("음료를 선택해 주세요 : ");
		
		Scanner sc = new Scanner(System.in);
		String selectedDrink = sc.nextLine();
		
		int price = 0;
		
//		switch(selectedDrink) {
//			case "사이다" :
//				System.out.println("사이다를 선택하셨습니다. ");
//				price = 500;
//				//break;
//			case "콜라" :
//				System.out.println("콜라를 선택하셨습니다. ");
//				price = 600;
//				//break;
//			case "환타" :
//				System.out.println("환타를 선택하셨습니다.");
//				price = 700;
//				//break;
//			case "박카스" :
//				System.out.println("박카스를 선택하셨습니다.");
//				price = 2000;
//				//break;
//			case "핫식스" :
//				System.out.println("핫식스를 선택하셨습니다.");
//				price = 10000;
//				//break;
//		}
//		
//		System.out.println(price + "원을 투입해주세요!");
		
		String order = "";
		
		switch(selectedDrink) {
		case "사이다" :
			order = "사이다";
			price = 500;
			break;
		case "콜라" :
			order = "콜라";
			price = 600;
			break;
		case "환타" :
			order = "환타";
			price = 700;
			break;
		case "박카스" :
			order = "박카스";
			price = 2000;
			break;
		case "핫식스" :
			order = "학식스";
			price = 10000;
			break;
	}
		System.out.println(order + "를 선택하셨습니다.");
		System.out.println(price + "원을 투입해주세요!");
		sc.close();
	}
}
