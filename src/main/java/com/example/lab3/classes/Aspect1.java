package com.example.lab3.classes;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class Aspect1 {
    @Before("execution(* com.example.lab3.classes.Warehouse.*(..))")
    public void Before_store() {
        System.out.println("Before method");
    }

    @AfterReturning(pointcut = "execution(public com.example.lab3.classes.WateInterface com.example.lab3.classes.Warehouse.getLast())", returning = "last")
    public void After_store(WateInterface last){System.out.println("After returning method, the last thing is: "+last.toString());}

    @AfterThrowing(pointcut = "execution (public com.example.lab3.classes.WateInterface com.example.lab3.classes.Warehouse.error())", throwing = "exc")
    public void After_throwing(Throwable exc){
        System.out.println("System throws: " + exc);
    }

    @After("execution(* com.example.lab3.classes.Warehouse.*(..))")
    public void After_all(){System.out.println("All methods runned successful");}

    @Around("execution(* com.example.lab3.classes.Warehouse.Bebra())")
    public Object Around_met(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Around before");
        Object bebra = proceedingJoinPoint.proceed();
        System.out.println("Around after");
        return bebra;
    }

}
