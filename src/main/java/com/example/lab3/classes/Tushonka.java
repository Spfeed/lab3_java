package com.example.lab3.classes;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Tushonka implements WateInterface{
    @Value("beef")
    private String meat;
    @Value("1966")
    private int year;
    @Override
    public void Store(Warehouse warehouse) {
        warehouse.Store1(this);
    }
    @Override
    public String toString() {
        return "Tushonka: " +
                "meat='" + meat + '\'' +
                ", year=" + year +
                '}';
    }
}
