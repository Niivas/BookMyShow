package com.scaler.BookMyShow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity //  it will create a table in the database named region
public class Region extends BaseModel{
    private String name;
    @OneToMany
    private List<Theatre> theatre;
}
