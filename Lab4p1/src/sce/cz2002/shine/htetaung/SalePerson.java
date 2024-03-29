package sce.cz2002.shine.htetaung;

public class SalePerson implements Comparable {
	
	private String firstName;
	private String lastName;
	private int totalSales;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getTotalSales() {
		return totalSales;
	}
	public void setTotalSales(int totalSales) {
		this.totalSales = totalSales;
	}
	public SalePerson(String firstName, String lastName, int totalSales) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.totalSales = totalSales;
	}
	public String toString() {
		return this.lastName + ", " + this.firstName + " : " + this.totalSales;
	}
	public boolean equals(Object o) {
		if(o.getClass() == this.getClass()) {
			SalePerson s = (SalePerson)o;
			return (this.firstName == s.getFirstName() && this.lastName == s.getLastName());
		}
		return false;
	}
	public int compareTo(Object o) {
		if(o.getClass() == this.getClass()) {
			SalePerson s = (SalePerson)o;
			if(this.totalSales == s.getTotalSales())
				return this.lastName.compareTo(s.getLastName());
			else
				return (this.totalSales > s.getTotalSales())? 1 : -1;
		}
		return 2;
	}
}
