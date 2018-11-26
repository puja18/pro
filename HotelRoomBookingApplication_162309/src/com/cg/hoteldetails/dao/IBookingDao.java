package com.cg.hoteldetails.dao;

import java.util.List;

import com.cg.hoteldetails.dto.Client;

public interface IBookingDao {
	public List<Client> showAllHotels();

	public String displayName(Client c);

}
