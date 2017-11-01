package com.pingchi.reservations.ping.data.repository;

import com.pingchi.reservations.ping.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
    Room findByNumber(String number);
}