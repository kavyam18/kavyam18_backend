package com.excel.hotelmanagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "Rooms")

public class Rooms {
	
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     @Column(name = "room_id")
     private int roomId;
     @Column(name = "room_number" , unique=true)
     private int roomNumber;
     @Column(name = "type")
     private String roomType;
     @Column(name = "rate")
     private Double rate;
     @Column(name = "description")
     private String description;
     private boolean isAvailable;
     

	
}
