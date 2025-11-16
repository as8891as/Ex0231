package com.example.ex0231.ex2;

public class Truck extends Heavy {
    private double maxLoad;

    public Truck(String carNumber, double carAge, int numWheels, String steeringShape, double pollutionPerMinute, int numTrailersCarriable, double maxLoad) {
        super(carNumber, carAge, numWheels, steeringShape, pollutionPerMinute, numTrailersCarriable);
        this.maxLoad = maxLoad;
    }

    public double getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    @Override
    public double exhaust() {
        return (super.exhaust()*1.5);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "carNumber='" + getCarNumber() + '\'' +
                ", carAge=" + getCarAge() +
                ", numWheels=" + getNumWheels() +
                ", steeringShape='" + getSteeringShape() + '\'' +
                ", pollutionPerMinute=" + getPollutionPerMinute() +
                ", numTrailersCarriable=" + getNumTrailersCarriable() +
                ", maxLoad=" + maxLoad +
                '}';
    }



}
