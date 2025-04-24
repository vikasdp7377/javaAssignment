package com.airline.service;

import java.util.List;

import com.airline.dao.BookingDao;
import com.airline.entity.Booking;

public class BookingService {

	private BookingDao bookingDao;
	
	public BookingService()
	{
		bookingDao = new BookingDao();
	}
	public boolean bookFlight(int user_id, int flightId)
	{
		return bookingDao.save(user_id, flightId);
	}
	
/*	public List<Booking> fetBookingByUserId(int userId)
	{
		
	}*/
}
