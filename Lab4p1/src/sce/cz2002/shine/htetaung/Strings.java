package sce.cz2002.shine.htetaung;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		String[] stringList;
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.print ("\nHow many strings do you want to sort? ");
		size = sc.nextInt();
		sc.nextLine();
		stringList = new String[size];
		for(int i = 0; i < size; i++)
		{
			System.out.print("\nEnter your string no. " + (i+1) + " ");
			stringList[i] = sc.nextLine();
		}
		
		Sorting.selectionSortReverse(stringList);
		System.out.println ("\nYour stringss in sorted order...");
		
		for(int i = 0; i < size; i++)
			System.out.println((i+1) + ". " + stringList[i]);
		System.out.println();
	}
}
