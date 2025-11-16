package com.example.ex0231.ex2;

public class IceCreamTruck extends Truck {
    private String[] iceCreamFlavors;

    public IceCreamTruck(String carNumber, double carAge, int numWheels, String steeringShape, double pollutionPerMinute, int numTrailersCarriable, double maxLoad, String[] iceCreamFlavors) {
        super(carNumber, carAge, numWheels, steeringShape, pollutionPerMinute, numTrailersCarriable, maxLoad);
        this.iceCreamFlavors = iceCreamFlavors;
    }

    public String[] getIceCreamFlavors() {
        return iceCreamFlavors;
    }

    public void setIceCreamFlavors(String[] iceCreamFlavors) {
        this.iceCreamFlavors = iceCreamFlavors;
    }

    @Override
    public String toString() {
        return "IceCreamTruck{" +
                "carNumber='" + getCarNumber() + '\'' +
                ", carAge=" + getCarAge() +
                ", numWheels=" + getNumWheels() +
                ", steeringShape='" + getSteeringShape() + '\'' +
                ", pollutionPerMinute=" + getPollutionPerMinute() +
                ", numTrailersCarriable=" + getNumTrailersCarriable() +
                ", maxLoad=" + getMaxLoad() +
                ", iceCreamFlavors=" + java.util.Arrays.toString(iceCreamFlavors) +
                '}';
    }

}
