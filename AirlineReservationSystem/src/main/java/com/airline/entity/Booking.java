package com.airline.entity;

import java.time.LocalDate;

public class Booking {

	private int id;
	private int userId;
	private int flightId;
	private LocalDate date;
	public Booking() {
		// TODO Auto-generated constructor stub
	}
	public Booking(int id, int userId, int flightId, LocalDate date) {
		super();
		this.id = id;
		this.userId = userId;
		this.flightId = flightId;
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Booking [id=" + id + ", userId=" + userId + ", flightId=" + flightId + ", date=" + date + "]";
	}

}
