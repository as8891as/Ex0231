package com.example.ex0231.ex2;

public class Heavy extends Vehicles {
    private int numTrailersCarriable;

    public Heavy(String carNumber, double carAge, int numWheels, String steeringShape, double pollutionPerMinute, int numTrailersCarriable) {
        super(carNumber, carAge, numWheels, steeringShape, pollutionPerMinute);
        this.numTrailersCarriable = numTrailersCarriable;
    }

    public int getNumTrailersCarriable() {
        return numTrailersCarriable;
    }

    public void setNumTrailersCarriable(int numTrailersCarriable) {
        this.numTrailersCarriable = numTrailersCarriable;
    }

    @Override
    public double exhaust() {
        return (super.exhaust()+500*numTrailersCarriable);
    }

    @Override
    public String toString() {
        return "Heavy{" +
                "carNumber='" + getCarNumber() + '\'' +
                ", carAge=" + getCarAge() +
                ", numWheels=" + getNumWheels() +
                ", steeringShape='" + getSteeringShape() + '\'' +
                ", pollutionPerMinute=" + getPollutionPerMinute() +
                ", numTrailersCarriable=" + numTrailersCarriable +
                '}';
    }
}
