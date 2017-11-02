package com.pingchi.reservations.ping.data.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.pingchi.reservations.ping.data.entity.Guest;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends PagingAndSortingRepository<Guest, Long> {

}