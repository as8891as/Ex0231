package com.example.ex0231.ex2;

public class Bicycle extends Light {
    private boolean hasBasket;

    public Bicycle(String carNumber, double carAge, int numWheels, String steeringShape, double pollutionPerMinute, boolean hasEngine, boolean hasBasket) {
        super(carNumber, carAge, numWheels, steeringShape, pollutionPerMinute, hasEngine);
        this.hasBasket = hasBasket;
    }

    public boolean isHasBasket() {
        return hasBasket;
    }

    public void setHasBasket(boolean hasBasket) {
        this.hasBasket = hasBasket;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "carNumber='" + getCarNumber() + '\'' +
                ", carAge=" + getCarAge() +
                ", numWheels=" + getNumWheels() +
                ", steeringShape='" + getSteeringShape() + '\'' +
                ", pollutionPerMinute=" + getPollutionPerMinute() +
                ", hasEngine=" + isHasEngine() +
                ", hasBasket=" + hasBasket +
                '}';
    }


}
