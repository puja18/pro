package com.cg.hoteldetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.hoteldetails.dto.Client;
import com.cg.hoteldetails.service.IBookingService;

@Controller
public class BookingController {
	@Autowired
	IBookingService bookingservice;
	
	@RequestMapping(value="all",method=RequestMethod.GET)
	public String getAll(){
		return "home";
		
	}
	 @RequestMapping(value="hoteldetails")
	 public ModelAndView showAllCourses(){
			List<Client> myAllData=bookingservice.showAllHotels();
			return new ModelAndView("hoteldetails","temp", myAllData);
			}
	 
	 
	 
	 
	 @RequestMapping(value="sucess")
	 public ModelAndView displaySucess(Client c) {
		  String name =null;
	      name = bookingservice.displayName(c);
		 return new ModelAndView("sucess","edata",name);
	 }

}
