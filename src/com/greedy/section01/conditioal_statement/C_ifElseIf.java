package com.greedy.section01.conditioal_statement;

import java.util.Scanner;

public class C_ifElseIf {

	/**
	 * <pre>
	 *  단독 if-else-if문 실행흐름을 확인하기 위한 용도의 기능을 제공
	 *  금도끼, 은도끼 동화 시나리오를 이용한 if-else-if의 흐름을 이해할 수 있도록 기능 제공
	 * </pre>
	 */
	public void testSimpleIfElseIfStatement() {
		/* if - else - if 문
		 * if(조건식1){
		 * 	조건식이 true일 때, 수행될 문장;
		 *	} else if{
		 *		조건식1이 false이고, 조건식2기 true일 때 실행될 문장;
		 *  } else{
		 *  	위의 두 조건 모두 거짓일 때 실행될 문장;
		 *  }
		 */
		
		System.out.println("산속에서 나무를 하던 나무꾼이 연못에 도끼를 빠트리고 말았다.");
		System.out.println("연못에서 산신령이 나타나 금도끼, 은도끼, 쇠도끼를 들고 나타났다.");
		System.out.println("나무꾼에게 셋 중 어떤 도끼가 나무꾼의 도끼인지 묻는다.");
		
		System.out.print("어느 도끼가 너의 것이냐 (1. 금도끼, 2. 은도끼, 3.쇠도끼) : ");
		Scanner sc = new Scanner(System.in);
		int answer = sc.nextInt();
		
		if(answer == 1) {
			System.out.println("거짓말쟁이인 너에게는 아무 도끼도 줄 수 없다.");
		} else if(answer == 2) {
			System.out.println("욕심이 과하진 않지만 거짓이므로 그 도끼를 줄 수 없다.");
		} else {
			System.out.println("정직하구나, 너에게 모든 도끼를 다 주마.");
		}
		sc.close();
		System.out.println("산신령은 다시 연못 속으로 사려졌다....");
	}
	
	/**
	 * <pre>
	 *  중첩 if - else - if 구문 흐름 확인 메소드
	 *  </pre>
	 */
	public void testNestedIfElseIfStatement() {
		/* if - else - if 문
		 * 90점 이상이면 A, 80점 이상이면 b, 70점 이상이면 C, 60점 이상이면 D
		 * 60점 미만이면  F
		 * 추가로 각 등급으로 중간 점수 95, 85, 75인 경우 '+'붙여 체계화
		 */
		System.out.print("학생의 이름을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		System.out.print("학생의 점수를 입력하세요 : ");
		int point = sc.nextInt();
		
		String grade = "";
		
		if(point >= 90 ) {
			grade = "A";
			if(point >= 95) {
				grade += "+"; // == grade = "A+";
			}
		} else if(point >= 80) {
			grade = "B";
			if(point >= 85) {
				grade += "+"; // == grade = "A+";
			}
		} else if(point >= 70) {
			grade = "C";
			if(point >= 75) {
				grade += "+"; // == grade = "A+";
			}
		} else if(point >= 60) {
			grade = "D";
			if(point >= 65) {
				grade += "+"; // == grade = "A+";
			}
		} else {
			grade = "F";
		}
		System.out.println(name + " 학생의 점수는 " + point + "이고, 등급은 '" + 
							grade + "'입니다. ");
		sc.close();
	}
	
	public void testNestedIfElseIfStatement2() {
		/* if - else - if 문
		 * 90점 이상이면 A, 80점 이상이면 b, 70점 이상이면 C, 60점 이상이면 D
		 * 60점 미만이면  F
		 * 추가로 각 등급으로 중간 점수 95, 85, 75인 경우 '+'붙여 체계화
		 */
		System.out.print("학생의 이름을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		System.out.print("학생의 점수를 입력하세요 : ");
		int point = sc.nextInt();
		
		String grade = "";
		
		if(point >= 90 ) {
			grade = "A";
			
		} else if(point >= 80) {
			grade = "B";
			
		} else if(point >= 70) {
			grade = "C";
		} else if(point >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		if(point % 10 >= 5 && point >= 60 || point == 100) {
			grade += "+";
		}
		System.out.println(name + " 학생의 점수는 " + point + "이고, 등급은 '" + 
							grade + "'입니다. ");
		sc.close();
	}
	
	
	
	
}