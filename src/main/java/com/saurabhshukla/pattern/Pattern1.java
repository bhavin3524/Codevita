package com.saurabhshukla.pattern;

class Pattern {
	public void printPattern1() {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j <= i) {
					System.out.print("* ");
				} else {
					System.out.print(" ");

				}
			}
			System.out.println();
		}

	}

	public void printPattern2() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j <= 5 && j >= 5 - i + 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	public void printPattern3() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j <= 5 && j >= i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public void printPattern4() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j <= 6 - i && j >= 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	public void printPattern5() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j <= i + 4 && j >= 6 - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public void printPattern6() {
		for (int i = 1; i <= 5; i++) {
			boolean k = true;
			for (int j = 1; j <= 9; j++) {
				if (j <= i + 4 && j >= 6 - i && k) {
					System.out.print("*");
					k=false;
				} else {
					System.out.print(" ");
					k=true;
				}
			}
			System.out.println();
		}
	}

}

public class Pattern1 {
	public static void main(String[] args) {
		Pattern p = new Pattern();
//		p.printPattern1();
//		p.printPattern2();
//		p.printPattern3();
//		p.printPattern4();
//		p.printPattern5();
		p.printPattern6();

	}
}