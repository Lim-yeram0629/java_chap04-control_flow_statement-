package com.greedy.section03.branching_statement;

public class Application {

	public static void main(String[] args) {
		
		A_break ab = new A_break();
		ab.testSimpleBreakStatement();
		ab.testSimpleBreakStatement2();
		ab.testJumpBreak();
		
		B_continue bc = new B_continue();
		bc.testSimpleContinueStatement();
		bc.testSimpleContinueStatement2();
	}

}
