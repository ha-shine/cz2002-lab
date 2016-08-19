package sce.cz2002.shine.htetaung;

public class PlaneSeat {
	
	private int seatID;
	private boolean assigned;
	private int customerID;
	
	public PlaneSeat(int seatID) {
		this.seatID = seatID;
		this.assigned = false;
		this.customerID = -1;
	}
	
	public int getSeatID() {
		return seatID;
	}
	
	public int getCustomerID() {
		return customerID;
	}
	
	public boolean isOccupied() {
		return assigned;
	}
	
	public void assign(int customerID) {
		this.customerID = customerID;
		this.assigned = true;
	}
	
	public void unAssign() {
		this.customerID = -1;
		this.assigned = false;
	}
	
}
