package com.pingchi.reservations.ping.data.entity;

import javax.persistence.*;

@Entity
@Table(name = "ROOM")
public class Room {
    @Id
    @Column(name = "ROOM_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "ROOM_NUMBER")
    private String number;
    @Column(name = "BED_INFO")
    private String bedInfo;

    public long getId(){
        return id;
    }
}
