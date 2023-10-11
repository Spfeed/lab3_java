package com.example.lab3;

import com.example.lab3.classes.Boots;
import com.example.lab3.classes.Car;
import com.example.lab3.classes.Tushonka;
import com.example.lab3.classes.Warehouse;
import com.example.lab3.config.Springconfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Lab3Application {

	public static void main(String[] args) {

		//SpringApplication.run(Lab3Application.class, args);
		var context = new AnnotationConfigApplicationContext(Springconfig.class);
		Car car = context.getBean("car",Car.class);
		Boots boots=context.getBean("boots",Boots.class);
		Tushonka tushonka=context.getBean("tushonka",Tushonka.class);
		Warehouse warehouse=context.getBean("warehouse",Warehouse.class);
		car.Store(warehouse);
		boots.Store(warehouse);
		tushonka.Store(warehouse);
		warehouse.getLast();
		warehouse.Bebra();
		warehouse.error();
	}

}
