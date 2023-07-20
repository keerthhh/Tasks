package com.riverstone.Task2;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Fruits {
	public Fruits() {}

	public int getnum() {
		return num;
	}
	public void setnum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Id
	int num;
	String name;
	double price;
	public Fruits(int num, String name, double price) {
		super();
		this.num = num;
		this.name = name;
		this.price = price;
	}
}
