package com.greedy.section03.branching_statement;

public class B_continue {
	
	public void testSimpleContinueStatement() {
		
		/* 
		 * continue 문은 해당 반복문 내에서
		 * 회차를 중간에 멈추고 다시 증감식으로 넘어가게 한다.*/
		// 1부터 100사이의 4의 배수이면서 5의 배수만 출력
		
		for(int i = 1 ; i <= 100; i++) {
			if(i % 4 == 0 && i % 5 == 0) {
				System.out.println(i);
			} else {
				continue;
			} //if-else 끝
		} // for 끝
	}

	public void testSimpleContinueStatement2() {
		//각 단의 수가 짝수인 경우 출력 생략하는 구구단\
		
		for(int dan = 2; dan <= 9; dan++) {
			if(dan % 2 != 0) {
				continue;
			}	// if 끝
			for(int su = 1; su<=9; su++) {
				System.out.println(dan + " * " + su + " = "+ (dan*su));
			}	// 중첩 for끝 
			System.out.println();
		} // for 끝
	}
	
	public void testJumpContinue() {	
		for_label:
		for(int dan = 2; dan <= 9; dan++) {
			if(dan % 2 != 0) {
				continue for_label;
			}	// if 끝
			for(int su = 1; su<=9; su++) {
				System.out.println(dan + " * " + su + " = "+ (dan*su));
			}	// 중첩 for끝 
			System.out.println();
		} // for 끝
	}
	
}
