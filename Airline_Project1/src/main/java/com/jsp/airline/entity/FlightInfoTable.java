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
	@Table(name="FlightInfoTable_table")
public class FlightInfoTable {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int FlightInfoId;
private int FlightNumber;
private String FlightType;
private double FlightTime;
private int AirlineId;
}
