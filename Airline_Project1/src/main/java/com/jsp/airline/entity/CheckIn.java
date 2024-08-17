package com.jsp.airline.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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
	@Table(name="CheckIn_table")
public class CheckIn {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int CheckInId;
		private int SeatNo;
		private int GateNo;
		@OneToOne(mappedBy = "checkIn")
		private Passenger passenger;
		

}
