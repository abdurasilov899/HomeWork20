package com.company;

public class Car implements AutoCloseable {
    public void drive(){
        System.out.println("Mashina jurup jatat...!!!");
    }
    @Override
    public void close() throws RuntimeException {
        System.out.println("Mashina jabylyp jatat");
    }
}
