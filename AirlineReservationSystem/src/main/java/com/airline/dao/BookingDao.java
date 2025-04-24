package com.airline.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.airline.entity.Booking;
import com.airline.util.JdbcUtils;

public class BookingDao {

	private String query;
	
	public boolean save(int userId, int flightId) {
		boolean status = false;
		query = "insert into booking(user_id, flight_id) values(?,?)";
		try(
				Connection con = JdbcUtils.getDbconnection();
				PreparedStatement pstm = con.prepareStatement(query);
				)
		{
			pstm.setInt(1,userId);
			pstm.setInt(2, flightId);
			int count = pstm.executeUpdate();
			if(count>0)
			{
				System.out.println(count+" Row Inserted!!");
				status=true;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return status;
		
	}
	/*
public List<Booking> findAllById(int userId)
{
	query = "select * from booking where user_id = ? ";
	try(
			Connection con = JdbcUtils.getDbconnection();
			PreparedStatement pstm = con.prepareStatement(query);
			)
	{
		pstm.setInt(1, userId);
		ResultSet rs =  
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}*/
}
