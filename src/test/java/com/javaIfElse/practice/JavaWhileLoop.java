package com.javaIfElse.practice;

public class JavaWhileLoop {

	public static void main(String[] args) {
		// 10>> find out those number which one is divided by 3
		// if the number divided by 3 >>print FIZZ
		// if number divided by 5 >>print BUZZ
		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {// divided by 3
				System.out.println("Fizz & number = "+i);
			}
			if (i % 5 == 0) {// divided by 3
				System.out.println("BUZZ & number = "+i);
			}
		}

	}

}
