package com.primelides.desfribilador.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "desfribiladors")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nome")
    private String name;
    @Column(name = "cidade")
    private String city;
    @Column(name = "bairro")
    private String neighborhood;
    @Column(name = "rua")
    private String street;
    @Column(name = "numero")
    private String addressNumber;
    @Column(name = "longitude")
    private String longitude;
    @Column(name = "latitude")
    private String latitude;
    @Column(name = "status")
    private String workingStatus;
}
