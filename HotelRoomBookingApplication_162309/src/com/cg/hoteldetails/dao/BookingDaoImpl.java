package com.cg.hoteldetails.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.hoteldetails.dto.Client;


@Repository("bookingdao")
public class BookingDaoImpl implements IBookingDao {
	@PersistenceContext
	EntityManager em;
	@Override
	public List<Client> showAllHotels() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("SELECT c FROM Client c");
		List<Client> hotelDetails = query.getResultList();
		return hotelDetails;
		
	}
	@Override
	public String displayName(Client c) {
		// TODO Auto-generated method stub
		return c.getName();
	}
	

}
