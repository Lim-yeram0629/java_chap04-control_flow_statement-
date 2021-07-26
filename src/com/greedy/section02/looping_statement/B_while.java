package com.greedy.section02.looping_statement;

import java.util.Scanner;

public class B_while {

	/**
	 * <pre>
	 *  단순 while문 실행 흐름 확인 용도
	 *  </pre>
	 */
	public void testSimpleWhileStatement() {
		/* 
		 * while문
		 * 초기식;
		 * while(조건식){
		 * 		조건을 만족하는 경우 수행할 구문(반복 구문);
		 * 		증감식;
		 * }
		 */
		
		// 1부터 10까지 1씩 증가하며 i값 출력
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
	}
	
	/**
	 * <pre>
	 *  문자열을 입력 받고 한 글자씩 출력하기
	 *  </pre>
	 */
	public void testWhileExample1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		/* 
		 * charAt() : 문자열에서 인덱스에 해당하는 문자를 char형으로 반환하는 기능
		 * length() : 문자열의 길이를 int형으로 반환
		 * equals() : 문자열이 같은지 비교
		 * 
		 * index는 0부터 시작하고 마지막 인덱스는 항상 길이(length)보다 한개
		 * 작은 숫자를 가진다. 만약 존재하지 않는 인덱스에 접근하게 되면
		 * StringIndexOfOfBoundsException이 발생한다.
		 */
		int index = 0;
		while(index < str.length()) {
			System.out.println(index + " : " + str.charAt(index));
			index++;
		}
//		for(int i = 0; i < str.length(); i++) {
//			System.out.println(str.charAt(i));
//		}
		sc.close();
	}
	
	/**
	 * <pre>
	 *  1부터 입력받은 정수까지의 합을 출력하기
	 *  </pre>
	 */
	public void testWhileExample2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력해 주세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		int i = 1;
		while(i <= num) {
			sum += i;
			i++;
		}
		System.out.println("1부터 입력 받은 정수까지의 합 = " + sum);
		sc.close();
	}
	
	/**
	 * <pre>
	 *  중첩 while문을 이용한 구구단 출력
	 * </pre>
	 */
	public void testWhileExample3() {
		int dan = 2;
		while(dan <= 9) {
			int su = 1;
			while(su <= 9) {
				System.out.println(dan + " * " + su + " = " + (dan*su));
				su++;
			}
			System.out.println();
			dan++;
		}
	}
	
	
}
