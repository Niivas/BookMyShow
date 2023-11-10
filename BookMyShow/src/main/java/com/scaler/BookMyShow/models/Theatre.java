package com.scaler.BookMyShow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Theatre extends BaseModel{
    private String name;
    private String address;
    @ManyToOne
    private Region region;
    @OneToMany
    private List<Screen> screens;
}
