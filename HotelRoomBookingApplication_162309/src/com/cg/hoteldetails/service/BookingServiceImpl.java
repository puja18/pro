package com.cg.hoteldetails.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hoteldetails.dao.IBookingDao;
import com.cg.hoteldetails.dto.Client;

@Service("bookingservice")
@Transactional
public class BookingServiceImpl implements IBookingService{
	@Autowired
	private IBookingDao bookingDao;

	@Override
	public List<Client> showAllHotels() {
		// TODO Auto-generated method stub
		return bookingDao.showAllHotels();
	}

	@Override
	public String displayName(Client c) {
		// TODO Auto-generated method stub
		return bookingDao.displayName(c);
	}

	

}
