package ie.gmit.dip;

import java.util.Comparator;

public class Customer implements Comparable<Customer>{
	
	private String customerID;
	private String firstName;
	private String surname;
	private String city;
	private CreditCard cc = new CreditCard();
	
	
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public float getBalance() {
		// TODO Auto-generated method stub
		return cc.getBalance();
	}
	
	public int compareTo(Customer other) {
		return this.customerID.compareTo(other.getCustomerID());
	}
	
	

}
