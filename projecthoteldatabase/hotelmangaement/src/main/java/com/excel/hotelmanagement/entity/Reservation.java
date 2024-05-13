package com.excel.hotelmanagement.entity;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Reservation")
public class Reservation {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
     
     @Column(name = "check_in_date")
	private Date check_in_date;
     
     @Column(name = "check_out_date")
	private Date Check_out_date;
     
     @Column(name = "total_amount")
	private Double total_amount;
     
     @OneToOne(cascade = CascadeType.ALL)
     private Guests Guests;
     
     @OneToOne(cascade = CascadeType.ALL)
     private Rooms Rooms;
     
	private boolean is_cancelled;
}
