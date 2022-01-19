package com.test.q1;

import java.util.ArrayList;

public class MerchandiseInventory {
	private ArrayList<Merchandise> inventory;

	public MerchandiseInventory(ArrayList<Merchandise> inventory) {
		super();
		this.inventory = inventory;
	}

	public ArrayList<Merchandise> getInventory() {
		return inventory;
	}

	public void setInventory(ArrayList<Merchandise> inventory) {
		this.inventory = inventory;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MerchandiseInventory [inventory=").append(inventory).append("]");
		return builder.toString();
	}
	
}
