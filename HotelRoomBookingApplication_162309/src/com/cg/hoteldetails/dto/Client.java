package com.cg.hoteldetails.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Hotel_Details")
public class Client {
	@Id
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String rating;
	@Column
	private int rateNumber;
	@Column
	private int availableRooms;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public int getRateNumber() {
		return rateNumber;
	}
	public void setRateNumber(int rateNumber) {
		this.rateNumber = rateNumber;
	}
	public int getAvailableRooms() {
		return availableRooms;
	}
	public void setAvailableRooms(int availableRooms) {
		this.availableRooms = availableRooms;
	}
	@Override
	public String toString() {
		return "Client [ name=" + name + "]";
	}
	

}
