package sce.cz2002.shine.htetaung;

import java.util.Scanner;

public class Lab2p1 {
	
	public static void main(String[] args) {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Perform the following methods:");
			System.out.println("1: miltiplication test");
			System.out.println("2: quotient using division by subtraction");
			System.out.println("3: remainder using division by subtraction");
			System.out.println("4: count the number of digits");
			System.out.println("5: position of a digit");
			System.out.println("6: extract all odd digits");
			System.out.println("7: quit");
			choice = sc.nextInt();

			
			switch (choice) {
			case 1:
				mulTest();
				break;
			case 2:
				divideTest();
				break;
			case 3:
				modulusTest();
				break;
			case 4:
				countDigitsTest();
				break;
			case 5:
				positionTest();
				break;
			case 6:
				extractOddDigitsTest();
				break;
			case 7:
				System.out.println("Program terminating.");
			}
		} while (choice < 7);
	}
	
	public static void mulTest() {
		int correctCount = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			int n1 = (int)Math.ceil((Math.random()*8));
			int n2 = (int)Math.ceil((Math.random()*8));
			System.out.print(String.format("How much is %d times %d ? ", n1, n2));

			int choice = sc.nextInt();
			if (choice == n1 * n2) correctCount++;
		}
		System.out.println(String.format("%d answers out of 5 are correct.", correctCount));
	}
	
	public static void divideTest() {
		int m = 0;
		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter m : ");
		m = sc.nextInt();
		System.out.print("Enter n : ");
		n = sc.nextInt();
		System.out.println(String.format("%d / %d = %d", m, n,divide(m, n)));
	}
	
	public static int divide(int m, int n) {
		int result = -1;
		for(int i = m; i >= 0; i -= n) result++;
		return result;
	}
	
	public static void modulusTest() {
		int m = 0;
		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter m : ");
		m = sc.nextInt();
		System.out.print("Enter n : ");
		n = sc.nextInt();
		System.out.println(String.format("%d %% %d = %d", m, n, modulus(m, n)));
	}
	
	public static int modulus(int m, int n) {
		for(; m >= 0; m -= n) {}
		return m+n;
	}
	
	public static void countDigitsTest() {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		n = sc.nextInt();
		if (n <= 0)
			System.out.println(String.format("%d - Invalid input!", n));
		else
			System.out.println(String.format("%d - Count = %d", n, countDigits(n)));
	}
	
	public static int countDigits(int n) {
		int count  = 0;
		while(n > 0) {
			n = n / 10;
			count++;
		}
		return count;
	}
	
	public static void positionTest() {
		int n;
		int digit;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		n = sc.nextInt();
		System.out.print("Enter digit : ");
		digit = sc.nextInt();
		System.out.println(String.format("position = %d", position(n , digit)));
	}
	
	public static int position(int n, int digit) {
		int result = -1;
		int currentPos = 0;
		while(n > 0) {
			currentPos++;
			if (n % 10 == digit) {
				result = currentPos;
				break;
			}
			n = n / 10;
		}
		return result;
	}
	
	public static void extractOddDigitsTest() {
		long n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		n = sc.nextLong();
		if (n <= 0)
			System.out.println(String.format("%d - Invalid input!", n));
		else
			System.out.println(String.format("oddDigits = %d", extractOddDigits(n)));
	}
	
	public static long extractOddDigits(long n) {
		int result = 0;
		int currentPos = 0;
		while(n > 0) {
			if ( (n % 10) % 2 == 1) {
				result += (n % 10) * Math.pow(10, currentPos);
				currentPos++;
			}
			n = n / 10;
		}
		return (result == 0)? -1 : result;
	}
}
