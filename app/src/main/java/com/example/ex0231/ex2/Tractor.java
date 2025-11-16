package com.example.ex0231.ex2;

public class Tractor extends Heavy {
    private String[] trailerTypes;

    public Tractor(String carNumber, double carAge, int numWheels, String steeringShape, double pollutionPerMinute, int numTrailersCarriable, String[] trailerTypes) {
        super(carNumber, carAge, numWheels, steeringShape, pollutionPerMinute, numTrailersCarriable);
        this.trailerTypes = trailerTypes;
    }

    public String[] getTrailerTypes() {
        return trailerTypes;
    }

    public void setTrailerTypes(String[] trailerTypes) {
        this.trailerTypes = trailerTypes;
    }

    @Override
    public String toString() {
        return "Tractor{" +
                "carNumber='" + getCarNumber() + '\'' +
                ", carAge=" + getCarAge() +
                ", numWheels=" + getNumWheels() +
                ", steeringShape='" + getSteeringShape() + '\'' +
                ", pollutionPerMinute=" + getPollutionPerMinute() +
                ", numTrailersCarriable=" + getNumTrailersCarriable() +
                ", trailerTypes=" + java.util.Arrays.toString(trailerTypes) +
                '}';
    }


}
