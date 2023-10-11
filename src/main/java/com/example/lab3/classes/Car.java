package com.example.lab3.classes;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@NoArgsConstructor

public class Car implements WateInterface{
    @Value("Renault")
    private String mark;
    @Value("black")
    private String color;

    @Override
    public void Store(Warehouse warehouse) {
        warehouse.Store1(this);
    }

    @Override
    public String toString() {
        return "Car: " +
                "mark='" + mark + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
