package com.scaler.BookMyShow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Show extends BaseModel{
    @ManyToOne
    private Movie movie;
    @ManyToOne
    private Screen screen;
    private Date startTime;
    private Date endTime;
    @OneToMany
    private List<ShowSeat> showSeats;
    @Enumerated(EnumType.ORDINAL)
    @ElementCollection // mapping table for screen to feature
    private List<Feature> features;
}
