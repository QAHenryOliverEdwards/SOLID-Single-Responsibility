package com.qa.main;

public class Driver {

    private int mileage;

    public void drive(Car car) {
        car.setMileage(car.getMileage() + this.mileage);
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
