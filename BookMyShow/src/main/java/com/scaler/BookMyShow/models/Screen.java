package com.scaler.BookMyShow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
@Entity
public class Screen extends BaseModel{
    private String name;
    @OneToMany
    private List<Seat> Seats;
    @Enumerated(EnumType.ORDINAL)
    @ElementCollection // mapping table for screen to feature
    private List<Feature>features;
}
