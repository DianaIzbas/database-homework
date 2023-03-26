package com.siit.database.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
@ToString
@Getter
@Entity
@NoArgsConstructor
@Table(name = "accommodation_room_fare_relation")
public class AccommodationRoomFareRelation {
    @Id
    @GeneratedValue
    private Integer id;
    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "accommodation_id")
    private Accommodation accommodation;
    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "room_fare_id")
    private RoomFare roomFare;

    public AccommodationRoomFareRelation(Accommodation accommodation, RoomFare roomFare) {
        this.accommodation = accommodation;
        this.roomFare = roomFare;
    }

}
