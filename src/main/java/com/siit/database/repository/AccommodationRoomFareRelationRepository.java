package com.siit.database.repository;

import com.siit.database.model.AccommodationRoomFareRelation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccommodationRoomFareRelationRepository extends JpaRepository<AccommodationRoomFareRelation, Integer> {
}
