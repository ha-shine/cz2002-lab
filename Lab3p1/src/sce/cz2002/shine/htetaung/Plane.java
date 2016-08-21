package sce.cz2002.shine.htetaung;

import java.util.Arrays;
import java.util.Comparator;

public class Plane {
	
	private PlaneSeat[] seats;
	private int numEmptySeats;
	
	public Plane() {
		seats = new PlaneSeat[12];
		for (int i = 0; i < 12; i++)
			seats[i] = new PlaneSeat(i+1);
		numEmptySeats = 12;
	}
	
	// sort seats give you the whole array sorted, without any filters
	public PlaneSeat[] sortSeats() {
		PlaneSeat[] seatClone = seats.clone();
		Arrays.sort(seatClone, new Comparator<PlaneSeat>() {
			@Override
			public int compare(PlaneSeat p1, PlaneSeat p2) {
				return (p1.getCustomerID() > p2.getCustomerID())? 0 : 1;
			}
		});
		return seatClone;
	}
	
	public void showNumEmptySeats() {
		System.out.println(String.format("There are %d empty seats.\n", numEmptySeats));
	}
	
	public void showEmptySeats() {
		System.out.println("The following seats are empty.");
		for (PlaneSeat ps : this.seats) {
			if(!ps.isOccupied()) {
				System.out.println(String.format("SeatID %d", ps.getSeatID()));
			}
		}
		System.out.println();
	}
	
	public void showAssignedSeats(boolean bySeatID) {
		PlaneSeat[] seatsToShow = (bySeatID)? this.seats : this.sortSeats();
		System.out.println("The seat assignment are as follows:");
		for(PlaneSeat ps : seatsToShow) {
			if (ps.isOccupied()) {
				System.out.println(String.format("SeatID %d assigned to CustomerID %d.", ps.getSeatID(), ps.getCustomerID()));
			}
		}
		System.out.println();
	}
	
	public void assignSeat(int seatID, int customerID) {
		if(!this.seats[seatID-1].isOccupied()) {
			this.seats[seatID-1].assign(customerID);
			numEmptySeats--;
			System.out.println("Seat assigned!");
		} else {
			System.out.println("Seat already assigned!");
		}
	}
	
	public void unAssignSeat(int seatID) {
		if(this.seats[seatID-1].isOccupied()) {
			this.seats[seatID-1].unAssign();
			numEmptySeats++;
		}
		System.out.println("Seat unassigned!");
	}
}
