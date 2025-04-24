package com.airline.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.airline.entity.Booking;
import com.airline.service.BookingService;

/**
 * Servlet implementation class BookFlightServlet
 */
@WebServlet("/bookFlight")
public class BookFlightServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookFlightServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession  session = request.getSession();
		session.getAttribute("userId");
		Object id = session.getAttribute("userId");
		int userId = (int)id;
		int flightId = Integer.parseInt(request.getParameter("flightId"));
		//BookingService service = new BookingService();
		boolean isBooked = new BookingService().bookFlight(userId, flightId);
		
		if(isBooked)
		{
			//List<Booking> bookings = service.get
			out.println("<h2 style='color:red'> Flight Booked Successfully </h2>");
		}
		else
		{
			out.println("<h2 style='color:red'> Failed to be book flight </h2>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
