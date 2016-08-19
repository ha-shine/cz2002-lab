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
		
	}
	
	public void showEmptySeats() {
		
	}
	
	public void showAssignedSeats(boolean bySeatID) {
		
	}
	
	public void assignSeat(int seatID, int customerID) {
		
	}
	
	public void unAssignSeat(int seatID) {
		
	}
}
