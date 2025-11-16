package com.example.ex0231.ex2;

public class Coupe extends Regular {
    private String roofType;

    public Coupe(String carNumber, double carAge, int numWheels, String steeringShape, double pollutionPerMinute, int numPassengers, String roofType) {
        super(carNumber, carAge, numWheels, steeringShape, pollutionPerMinute, numPassengers);
        this.roofType = roofType;
    }

    public String getRoofType() {
        return roofType;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

    @Override
    public String toString() {
        return "Coupe{" +
                "carNumber='" + getCarNumber() + '\'' +
                ", carAge=" + getCarAge() +
                ", numWheels=" + getNumWheels() +
                ", steeringShape='" + getSteeringShape() + '\'' +
                ", pollutionPerMinute=" + getPollutionPerMinute() +
                ", numPassengers=" + getNumPassengers() +
                ", roofType='" + roofType + '\'' +
                '}';
    }

}
