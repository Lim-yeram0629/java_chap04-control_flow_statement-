package com.greedy.section02.looping_statement;

import java.util.Scanner;

public class A_for {

	/**
	 * <pre>
	 * 	단순 for문을 실행 흐름을 확인하기 위한 용도의 기능을 제공
	 *  반복문 기본 흐름에 대해 테스트해보기
	 * </pre>
	 */
	public void testSimpleForStatement() {
		//1부터 10까지 1씩 증가시키면서 i값을 출력
		for(int i = 1; i <= 10; i++ ) {
			System.out.println(i);
		}
	}

	/**
	 * <pre>
	 * 
	 * </pre>
	 */
	public void testForExample1() {
		//10명의 학생이름을 입력 받아 이름을 출력해보자.

		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.print("1 번째 학생의 이름을 입력해 주세요: "); String student1 = sc.nextLine();
		 * System.out.println("1 번째 학생의 이름은 " + student1 + "입니다.");
		 * 
		 * System.out.print("2 번째 학생의 이름을 입력해 주세요: "); String student2 = sc.nextLine();
		 * System.out.println("2 번째 학생의 이름은 " + student2 + "입니다.");
		 * 
		 * System.out.print("3 번째 학생의 이름을 입력해 주세요: "); String student3 = sc.nextLine();
		 * System.out.println("3 번째 학생의 이름은 " + student3 + "입니다.");
		 * 
		 * System.out.print("4 번째 학생의 이름을 입력해 주세요: "); String student4 = sc.nextLine();
		 * System.out.println("4 번째 학생의 이름은 " + student4 + "입니다.");
		 * 
		 * System.out.print("5 번째 학생의 이름을 입력해 주세요: "); String student5 = sc.nextLine();
		 * System.out.println("5 번째 학생의 이름은 " + student5 + "입니다.");
		 * 
		 * System.out.print("6 번째 학생의 이름을 입력해 주세요: "); String student6 = sc.nextLine();
		 * System.out.println("6 번째 학생의 이름은 " + student6 + "입니다.");
		 * 
		 * System.out.print("7 번째 학생의 이름을 입력해 주세요: "); String student7 = sc.nextLine();
		 * System.out.println("7 번째 학생의 이름은 " + student7 + "입니다.");
		 * 
		 * System.out.print("8 번째 학생의 이름을 입력해 주세요: "); String student8 = sc.nextLine();
		 * System.out.println("8 번째 학생의 이름은 " + student8 + "입니다.");
		 * 
		 * System.out.print("9 번째 학생의 이름을 입력해 주세요: "); String student9 = sc.nextLine();
		 * System.out.println("9 번째 학생의 이름은 " + student9 + "입니다.");
		 * 
		 * System.out.print("10 번째 학생의 이름을 입력해 주세요: "); String student10 =
		 * sc.nextLine(); System.out.println("10 번째 학생의 이름은 " + student10 + "입니다.");
		 */

		for(int i = 1; i <= 10; i++) {
			System.out.print(i +" 번째 학생의 이름을 입력해 주세요: ");
			String student = sc.nextLine();
			System.out.println(i + " 번째 학생의 이름은 " + student + "입니다.");
		}

		System.out.println("10명의 학생 이름을 받고 출력하는 기능을 완료했습니다.");

		sc.close();
	}

	public void testForExample2() {

		//		int num1 = 1;
		//		int num2 = 2;
		//		int num3 = 3;
		//		int num4 = 4;
		//		int num5 = 5;
		//		int num6 = 6;
		//		int num7 = 7;
		//		int num8 = 8;
		//		int num9 = 9;
		//		int num10 = 10;

		int sum = 0;	// 결과를 누적시켜 담아줄 변수 선언

		//		sum += num1;
		//		sum += num2;
		//		sum += num3;
		//		sum += num4;
		//		sum += num5;
		//		sum += num6;
		//		sum += num7;
		//		sum += num8;
		//		sum += num9;
		//		sum += num10;

		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("sum : " + sum);
	}

	public void testForExample3() {
		/* 5 ~ 10 사이의 난수를 발생시켜서
		 * 1부터 발생한 난수까지의 합계를 구해보자.
		 */
		int random = (int)(Math.random() * 6) +5;
		int sum = 0;
		for(int i = 1; i <= random; i ++ ) {
			sum += i;
		}
		System.out.println("1부터 " + random + "까지의 합은 : " + sum + "이다.");
	}


	/**
	 * <pre>
	 *  반볻문 예제2
	 *  </pre>
	 * 
	 */
	public void testForExample4() {

		/* 숫자 두 개를 입력 받아 작은 수에서 큰 수 까지의 합계를 구하세요
		 * 단, 두 숫자는 같은 숫자를 입력하지 않는다는 가정
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력하세요: ");
		int firstNum = sc.nextInt();

		System.out.print("두 번째 정수를 입력하세요: ");
		int secondNum = sc.nextInt();

		int sum = 0;
		// 첫 번째 정수가 더 큰 경우
		//		if(firstNum >= secondNum) {
		//			for(int i = secondNum; i <= firstNum; i++) {
		//				sum += i;
		//			}
		//		} else {
		//			for(int i = firstNum; i <= secondNum; i++) {
		//				sum += i;
		//			}
		//		}

		int min = 0;
		int max = 0;

		if(firstNum >= secondNum) {
			min = secondNum;
			max = firstNum;
		} else{
			min = firstNum;
			max = secondNum;
		}
		for(int i = min; i <= max; i++) {
			sum += i;
		}

		System.out.println("sum: " + sum);		
		sc.close();
	}


	public void printSimpleGugudan() {
		/* 키보드로 2~9사이의 구구단을 입력받아 
		 * 2~9까지의 사이인 경우 쿠쿠단 출력, 
		 * 2~9까지가 아닌경우 경고문 출력 
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("출력할 구구단 숫자를 입력하세요(2~9) : ");
		int num = sc.nextInt();

		if(num >= 2 && num <= 9) {
			for(int i = 1; i <= 9; i++) {
				System.out.println(num + " * " + i + " = " + (num*i));
			}
		} else {
			System.out.println("반드시 2~9 까지의 양수만 입력해야 합니다.");
		}
		
		sc.close();
	}
}


