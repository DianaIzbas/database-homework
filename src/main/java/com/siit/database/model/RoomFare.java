package com.siit.database.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
@ToString
@Getter
@Entity
@NoArgsConstructor
@Table(name = "room_fare")
public class RoomFare {
    @Id
    @GeneratedValue
    @Column(name = "room_fare_id")
    private Integer roomFareId;
    @Column(name = "price")
    private Double price;
    @Column(name = "season")
    private String season;

    public RoomFare(Double price, String season) {
        this.price = price;
        this.season = season;
    }

}
