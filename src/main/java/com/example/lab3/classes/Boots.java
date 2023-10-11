package com.example.lab3.classes;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Boots implements WateInterface{
    @Value("kirzachi")
    private String type;
    @Value("black")
    private String color;

    @Override
    public void Store(Warehouse warehouse) {
        warehouse.Store1(this);
    }

    @Override
    public String toString() {
        return "Boots: " +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
