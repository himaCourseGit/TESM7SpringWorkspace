package com.jsp.airline.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


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
	@Builder
	@ToString
	@Entity
	@Table(name="BookingInformation_table")
public class BookingInformation {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int BookingId;
		private int BookingDay;
		private String Destination;
		private double Fare;
		private String FlightDate;
		private int FlightNumber;
		private String Status;
		private Double Flighttime;
		private  String Currentcity;
		
		}
