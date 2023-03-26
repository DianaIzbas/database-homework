package com.siit.database.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
@ToString
@Getter
@Entity
@NoArgsConstructor
@Table(name = "accommodation")
public class Accommodation {
    @Id
    @GeneratedValue
    @Column(name = "accommodation_id")
    private Integer accommodationId;
    @Column(name = "type")
    private String type;
    @Column(name = "bed_type")
    private String bedType;
    @Column(name = "max_guests")
    private Integer maxGuests;
    @Column(name = "description")
    private String description;

    public Accommodation(String type, String bedType, Integer maxGuests, String description) {
        this.type = type;
        this.bedType = bedType;
        this.maxGuests = maxGuests;
        this.description = description;
    }
}
