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
	@Table(name="Flight_table")
public class Flight {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int FlightId;
private String Destination;
private String FlightDate;
private  int FlightNumber;
private Double FlightTime;
private String CurrentLocation;
private int FareId;
private int FlightInfoID;
private int InventoryId;



}
