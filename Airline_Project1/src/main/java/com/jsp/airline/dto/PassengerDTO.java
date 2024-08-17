package com.jsp.airline.dto;



import com.jsp.airline.entity.BookingInformation;
import com.jsp.airline.entity.CheckIn;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class PassengerDTO {
	private String passengerId;
	private String EmailId;
	private String FirstName;
	private String LastName;
	private String Gender;
	private String MobileNumber;
	private String BookingId;
	private int checkInId;
}
