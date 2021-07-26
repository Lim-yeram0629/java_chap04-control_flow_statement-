package com.greedy.section01.conditioal_statement;

import java.util.Scanner;

public class B_if {
	
	/**
	 * <pre>
	 * 	단독 if-else 구문 흐름을 확인하는 메소드
	 *  정수 홀수 짝수 판별용 기능 제공
	 * </pre>
	 */
	public void testSimpleIfElseStatement() {
		/* if - else문
		 * if(조건식1){
		 * 	조건식이 true일 때, 수행될 문장;
		 *	} else{
		 *		조건식이 false일 때 실행될 문장;
		 *  }
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요: ");
		int num = sc.nextInt();
		
		if(num % 2 == 1) {	// == (num % 2 != 0)
			System.out.println("입력하신 정수는 홀수 입니다.");
		}	else {
			System.out.println("입력하신 정수는 짝수 입니다.");
		}	
		sc.close();
		System.out.println("프로그램을 종료합니다.");
	}
	/**
	 * <pre> 
	 * 	중첩 if-else 구문 흐름 실행을 확인하기 위한 용도의 메소드
	 *  정수의 양수, 음수, 0 중 한가지 인지 판별
	 * </pre>
	 */
	public void testNestedIfElseStatement() {
		// 중첩 if-else
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요: ");
		int num = sc.nextInt();
		
		if(num != 0) {	
			
			if(num > 0) {
				System.out.println("입력하신 정수는 양수입니다.");
			} else {
				System.out.println("입력하신 정수는 음수입니다.");
			}
		} else {
			System.out.println("입력하신 정수는 0입니다.");
		}
		sc.close();
		System.out.println("프로그램을 종료합니다.");
	}

}
