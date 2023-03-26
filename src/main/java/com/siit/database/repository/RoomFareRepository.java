package com.siit.database.repository;

import com.siit.database.model.RoomFare;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomFareRepository extends JpaRepository<RoomFare, Integer> {
}
