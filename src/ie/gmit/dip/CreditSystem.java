package ie.gmit.dip;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CreditSystem {
	
	private Collection<Customer> col = new ArrayList<Customer>();
	
	public void addCustomer(Customer c){
		col.add(c); //O(1)
	}
	
	public void deleteCustomer(Customer c){
		col.remove(c); //O(n)
	}
	
	public Customer findCustomerById(String id){
		for(Customer c : col){ //O(n)
			if(c.getCustomerID().equals(id))return c;
		}
		return null;
	}
	
	public Customer findCustomerByFirstName(String name){
		for(Customer c : col){ //O(n)
			if(c.getFirstName().equals(name)) return c;
		}
		return null;
	}
	
	public float getBalance(Customer c){
		return c.getBalance(); //O(1)
	}
	
	public float getTotalAllBalances(){
		float total = 0.00f;
		for(Customer c: col){ //O(n)
			total += c.getBalance();
		}
		return total;
	}
	
	public Collection<Customer> getSortedList(){
		List<Customer> temp = new ArrayList<Customer>();
		temp.addAll(temp); //O(n)
		Collections.sort(temp); //O(n log(n))
		return temp; //O(2n log n) <=> O(n log(n))
		
	}
	
	

}
