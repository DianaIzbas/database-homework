package com.siit.database;

import com.siit.database.model.Accommodation;
import com.siit.database.model.AccommodationRoomFareRelation;
import com.siit.database.model.RoomFare;
import com.siit.database.repository.AccommodationRoomFareRelationRepository;
import com.siit.database.repository.RoomFareRepository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.Arrays;
import java.util.List;

@DataJpaTest
@ActiveProfiles("test")
class DatabaseApplicationTests {
    @Autowired
    private RoomFareRepository roomFareRepository;
    @Autowired
    private AccommodationRoomFareRelationRepository accommodationRoomFareRelationRepository;


    @BeforeEach
    void insertData() {
        RoomFare roomFare = new RoomFare(200D, "Winter");
        RoomFare roomFare1 = new RoomFare(250D, "Spring");
        RoomFare roomFare2 = new RoomFare(300D, "Summer");

        Accommodation accommodation = new Accommodation("double", "King", 2, "mountain view");
        Accommodation accommodation1 = new Accommodation("single", "Queen", 1, "small room");
        Accommodation accommodation2 = new Accommodation("triple", "King", 3, "good for a family");

        AccommodationRoomFareRelation accommodationRoomFareRelation = new AccommodationRoomFareRelation(accommodation, roomFare2);
        AccommodationRoomFareRelation accommodationRoomFareRelation1 = new AccommodationRoomFareRelation(accommodation, roomFare1);
        AccommodationRoomFareRelation accommodationRoomFareRelation2 = new AccommodationRoomFareRelation(accommodation2, roomFare);
        AccommodationRoomFareRelation accommodationRoomFareRelation3 = new AccommodationRoomFareRelation(accommodation2, roomFare1);
        AccommodationRoomFareRelation accommodationRoomFareRelation4 = new AccommodationRoomFareRelation(accommodation1, roomFare);


        List<AccommodationRoomFareRelation> accommodationRoomFareRelationList
                = accommodationRoomFareRelationRepository.saveAll(Arrays.asList(
                accommodationRoomFareRelation,
                accommodationRoomFareRelation1,
                accommodationRoomFareRelation2,
                accommodationRoomFareRelation3,
                accommodationRoomFareRelation4));

    }

    @Test
    public void getData() {
        List<AccommodationRoomFareRelation> accommodationPriceList = accommodationRoomFareRelationRepository.findAll();

        for (AccommodationRoomFareRelation accommodationPrice : accommodationPriceList) {
            System.out.println("Accommodation type - " + accommodationPrice.getAccommodation().getType() +
                    ". Season - " + accommodationPrice.getRoomFare().getSeason() +
                    ". Price - " + accommodationPrice.getRoomFare().getPrice());
        }
    }

}
