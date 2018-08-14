package com.tutorialspoint;

public class PrintCustomers {
	private Customer customer;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public PrintCustomers(Customer customer) {
		this.customer = customer;
	}

	public void Print() {
		System.out.println("Customer Details - Id :" + customer.getId() + ", Name :" + customer.getName());
		System.out.print("Products Brought :");
		for (String strProduct : customer.getSelectedProductList()) {
			System.out.print(strProduct + ",");
		}
		System.out.print("");
	}
}
