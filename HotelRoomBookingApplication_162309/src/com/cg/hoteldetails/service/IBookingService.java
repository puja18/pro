package com.cg.hoteldetails.service;

import java.util.List;

import com.cg.hoteldetails.dto.Client;

public interface IBookingService {
	public List<Client> showAllHotels();
	public String displayName(Client c);

}
