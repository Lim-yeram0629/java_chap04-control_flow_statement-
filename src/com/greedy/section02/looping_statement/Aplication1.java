package com.greedy.section02.looping_statement;

public class Aplication1 {

	public static void main(String[] args) {

		A_for af = new A_for();
		af.testSimpleForStatement();
		af.testForExample1();
		af.testForExample2();
		af.testForExample3();
		af.testForExample4();
		af.printSimpleGugudan();
		
		A_nestedFor an = new A_nestedFor();
		
		an.printGugudanFromTwoToNine();
		an.printUpgradeGugudanFromTwoToNine();
		
		an.printStarInputRowTimes();
		an.printTriangleStar();
		
		B_while bw = new B_while();
		bw.testSimpleWhileStatement();
		bw.testWhileExample1();
		bw.testWhileExample2();
		bw.testWhileExample3();
		
		C_doWhile cd = new C_doWhile();
		cd.testSimpleDoWhileStatement();
		cd.testDoWhileExample1();
		
		
	}

}
