package sce.cz2002.shine.htetaung;

import java.util.Scanner;

public class PlaneApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Plane plane = new Plane();
		
		int choice = 0;
		do {
			System.out.println("(1) Show number of empty seats.");
			System.out.println("(2) Show the list of empty seats.");
			System.out.println("(3) Show the list of seat assignments by seat ID");
			System.out.println("(4) Show the list of seat assignments by customer ID");
			System.out.println("(5) Assign a customer to a seat");
			System.out.println("(6) Remove a seat assignment");
			System.out.println("(7) Exit");
			System.out.print("Please enter your choice : ");
			
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				plane.showNumEmptySeats();
				break;
			case 2:
				plane.showEmptySeats();
				break;
			case 3:
				plane.showAssignedSeats(true);
				break;
			case 4:
				plane.showAssignedSeats(false);
				break;
			case 5:
				System.out.println("Assigning seat..");
				System.out.print("Please enter SeatID : ");
				int seatID = sc.nextInt();
				System.out.print("Please enter CustomerID : ");
				int customerID = sc.nextInt();
				plane.assignSeat(seatID, customerID);
				break;
			case 6:
				System.out.print("Enter SeatID to unassign customer from : ");
				int seatID1 = sc.nextInt();
				plane.unAssignSeat(seatID1);
				break;
			case 7:
				break;
			default:
				System.out.println("Invalid input!");
				break;
			}
		} while (choice != 7);
	}

}
