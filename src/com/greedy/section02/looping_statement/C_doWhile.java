package com.greedy.section02.looping_statement;

import java.util.Scanner;

public class C_doWhile {
	
	/**
	 * <pre>
	 *  단순 do - while문 실행흐름을 확인하기 위한 기능
	 * </pre>
	 */
	public void testSimpleDoWhileStatement() {
		/*  
		 * do-while
		 * 초기식;
		 * do{
		 * 		1회차에는 무조건 실행하고, 이후에는 조건식을 확인하여
		 * 		조건식을 만족하는 경우 수행할 구문(반복 구문);
		 * 		증감식;
		 * } while(조건식);
		 */
		
		do {
			System.out.println("최초 한번 동작!");
		} while(false);
		
		System.out.println("반복문 종료");	
	}
	
	/**
	 * <pre>
	 *  입력한 문자열을 반복척으로 출력한다.
	 *  단, exit가 입력 되면 반복문을 멈춘다.
	 * </pre>
	 * 
	 */
	public void testDoWhileExample1() {
		
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		
		do {
			System.out.print("출력할 문자열을 입력하세요(종료: exit) : ");
			str = sc.nextLine();
			System.out.println(str);
			
		} while(!str.equals("exit"));
		sc.close();
	}
	
	

}
