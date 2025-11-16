package com.example.ex0231.ex2;

public class Vehicles {
    private String carNumber;
    private double carAge;
    private int numWheels;
    private String steeringShape;
    private double pollutionPerMinute;

    public Vehicles(String carNumber, double carAge, int numWheels, String steeringShape, double pollutionPerMinute)
    {
        this.carNumber = carNumber;
        this.carAge = carAge;
        this.numWheels = numWheels;
        this.steeringShape = steeringShape;
        this.pollutionPerMinute = pollutionPerMinute;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public double getCarAge() {
        return carAge;
    }

    public void setCarAge(double carAge) {
        this.carAge = carAge;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public String getSteeringShape() {
        return steeringShape;
    }

    public void setSteeringShape(String steeringShape) {
        this.steeringShape = steeringShape;
    }

    public double getPollutionPerMinute() {
        return pollutionPerMinute;
    }

    public void setPollutionPerMinute(double pollutionPerMinute) {
        this.pollutionPerMinute = pollutionPerMinute;
    }

    public double exhaust() {
        return 60*pollutionPerMinute;
    }

    public String toString() {
        return "Vehicles{" +
                "carNumber='" + carNumber + '\'' +
                ", carAge=" + carAge +
                ", numWheels=" + numWheels +
                ", steeringShape='" + steeringShape + '\'' +
                ", pollutionPerMinute=" + pollutionPerMinute +
                '}';
    }
}
