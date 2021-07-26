package com.greedy.section01.conditioal_statement;

public class Application {

	public static void main(String[] args) {

		A_if a = new A_if();		//if
		
		a.testSimpleIfStatement(); // 단독 if문
		a.testNestIfStatement();	// 중첩 if
		
		B_if b = new B_if();		//else if
		
		b.testSimpleIfElseStatement();	//단독 if-else
		b.testNestedIfElseStatement();	//중첩 if-else
		
		C_ifElseIf c = new C_ifElseIf();
		
		c.testSimpleIfElseIfStatement();	//단독 if-else-if
		c.testNestedIfElseIfStatement(); 	//중첩 if-else-if
		c.testNestedIfElseIfStatement2();
		
		D_switch d = new D_switch();
		d.testSimpleSwitchStatement();
		d.testSwitchVendingMachine();
		
	}

}
