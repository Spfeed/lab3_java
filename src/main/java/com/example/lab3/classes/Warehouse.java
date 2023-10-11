package com.example.lab3.classes;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
@Setter
@Getter
@NoArgsConstructor
@PropertySource("application.yml")
public class Warehouse {
    List<WateInterface> Warelist = new ArrayList<>();
    public void Store1(WateInterface wateInterface){
        Warelist.add(wateInterface);
    }

    public WateInterface getLast(){
        return Warelist.get(2);
    }

    public WateInterface error(){
        return Warelist.get(-1000);
    }

    public void Bebra(){
        System.out.println("Нюхай бебру!");
    }
}
