package com.tutorialspoint;

import java.util.ArrayList;

public class Customer {
	private ArrayList<String> SelectedProductList;
	private int Id;
	private String Name;

		public Customer(int id)
		{
			this.Id = id;
		}

		public ArrayList<String> getSelectedProductList() {
			return SelectedProductList;
		}
		public void setSelectedProductList(ArrayList<String> selectedProductList) {
			SelectedProductList = selectedProductList;
		}
		public int getId() {
			return Id;
		}
		public void setId(int id) {
			Id = id;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}

}
