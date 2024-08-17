package com.jsp.airline.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.airline.dto.PassengerDTO;
import com.jsp.airline.entity.Passenger;
import com.jsp.airline.repository.PassengerRepository;


@Service
public class AdminServiceImple implements AdminService {
	@Autowired
	private  PassengerRepository passengerrepository;

	@Override
	public int addPassenger(PassengerDTO dto) {
		Passenger p1=passengerrepository.save(Passenger.builder().PassengerId(dto.getPassengerId()).EmailId(dto.getEmailId())
				.FirstName(dto.getFirstName()).LastName(dto.getLastName()).Gender(dto.getGender()).MobileNumber(dto.getMobileNumber()).checkInId(dto.getCheckInId())
				.BookingId(dto.getBookingId()).build());
		System.out.println(p1);
		return p1.getCheckInId();
		
		
		
	}
}