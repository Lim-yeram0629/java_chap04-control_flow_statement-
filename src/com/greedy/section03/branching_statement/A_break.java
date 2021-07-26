package com.greedy.section03.branching_statement;

public class A_break {
	
	/**
	 * <pre>
	 *  break문의 실행 흐름을 파악하기 위한 기능 제공
	 *  </pre>
	 * 
	 */
	public void testSimpleBreakStatement() {
		
		/* 
		 * break문은 해당 반복문 내에서  
		 * 반복문의 조건 상관없이 빠져나올 때사용한다.
		 * 
		 *  switch문은 반복문은 아니지만 예외적으로 사용한다.
		 */	
		int sum = 0;
		
		for(int i=0; ; i++) {
			sum += i;
			if(i == 100) {
				break;
			}
		}
		System.out.println("1부터 100까지의 합 : " + sum);
		
		sum = 0;	
		int i = 1;
		while(true) {
			sum += i;
			if(i == 100) {
				break;
			}
			i++;
		}
		System.out.println("1부터 100까지의 합 : " + sum);
	}

	/**
	 * <pre>
	 *  중첩 반복문 내에서의 분기문 break
	 * </pre>
	 */
	public void testSimpleBreakStatement2() {
		
		/* 
		 * 중첩 반복문에서의 분기문
		 * break는 모든 반복문을 종료하는 것이 아닌, 
		 * 자신에게 가장 인접한 반복문 실행만 멈춘다.  
		 */
		
		for(int dan = 2; dan <= 9; dan++) {
			for(int su = 1; su <= 9; su++) {
				if(su > 5) {
					break;
				}
				System.out.println(dan + " * " + su + " = " + (dan * su));
			}
			System.out.println();
		}
	}
	
	public void testJumpBreak() {
		
		for_label:
		for(;;) {
			for(int i = 0; i < 10; i++) {
				System.out.println(i);
				if(i==3) {
					break for_label;
				}
			}
		}
		
	}
	
	
	
}
