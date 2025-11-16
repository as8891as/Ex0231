package com.example.ex0231.ex2;

public class Regular extends Vehicles {
    private int numPassengers;

    public Regular(String carNumber, double carAge, int numWheels, String steeringShape, double pollutionPerMinute, int numPassengers) {
        super(carNumber, carAge, numWheels, steeringShape, pollutionPerMinute);
        this.numPassengers = numPassengers;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }

    @Override
    public double exhaust() {
        return (super.exhaust()/2);
    }

    public void noise() {
        System.out.println(numPassengers+" are making noise");
    }

    public int hitchhikers() {
        return numPassengers/2;
    }

    @Override
    public String toString() {
        return "Regular{" +
                "carNumber='" + getCarNumber() + '\'' +
                ", carAge=" + getCarAge() +
                ", numWheels=" + getNumWheels() +
                ", steeringShape='" + getSteeringShape() + '\'' +
                ", pollutionPerMinute=" + getPollutionPerMinute() +
                ", numPassengers=" + numPassengers +
                '}';
    }

}
