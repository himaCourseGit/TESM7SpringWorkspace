package com.jsp.airline.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
@Table(name="Passenger_table")
public class Passenger {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String PassengerId;
	private String EmailId;
	private String FirstName;
	private String LastName;
	private String Gender;
	private String MobileNumber;
	private String BookingId;
	private int checkInId;
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="bookingId")
	private BookingInformation bookingInformation;
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="checkInId")
	private CheckIn checkIn;

}
