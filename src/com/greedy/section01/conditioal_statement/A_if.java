package com.greedy.section01.conditioal_statement;

import java.util.Scanner;

public class A_if {
	
	/**
	 * <pre> 
	 *  단독 if문 실행흐름을 확인하기 위한 용도의 기능을 제공
	 *  정수 짝수 여부 판단 확인용
	 *  </pre>
	 * 
	 */
	public void testSimpleIfStatement() {
		/* if문
		 * if(조건식1){
		 * 	조건식이 true일 때, 수행될 문장;
		 *	}
		 * 조건식 : true or false가 나오는 연산식
		 * 
		 * 조건식의 결과가 true면 {}안의 코드 실행
		 * false면 {}안의 코드 무시
		*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 한개를 입력하세요: ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("짝수입니다. ");
		}

		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}

	/**
	 * 
	 * <pre> 
	 *  중첩 if문 실행 흐름을 확인하기 위한 용도의 기능을 제공
	 *  정수 짝수 여부 판단 확인용
	 *  </pre>
	 */
	public void testNestIfStatement() {
		// 중첩 if문
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 한개를 입력하세요: ");
		int num = sc.nextInt();
		
		if(num > 0) {
			if(num % 2 == 0) {
				System.out.println("입력하신 숫자는 양수이면서 짝수입니다. ");
			}
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}
	
}
