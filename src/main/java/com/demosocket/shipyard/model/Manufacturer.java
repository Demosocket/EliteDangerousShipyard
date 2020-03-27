package com.demosocket.shipyard.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Getter
@Setter
@Entity
@Table(name = "manufacturer")
public class Manufacturer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "manufacturer_id")
    private int manufacturer_id;

//    @OneToMany(mappedBy = "manufacturer", fetch = FetchType.LAZY)
    @Column(name = "manufacturer")
    private String manufacturer;
}