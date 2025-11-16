package com.example.ex0231.ex2;

public class Light extends Vehicles{
    private boolean hasEngine;

    public boolean getHasEngine() {
        return hasEngine;
    }

    public void setHasEngine(boolean hasEngine) {
        this.hasEngine = hasEngine;
    }

    public Light(String carNumber, double carAge, int numWheels, String steeringShape, double pollutionPerMinute, boolean hasEngine) {
        super(carNumber, carAge, numWheels, steeringShape, pollutionPerMinute);
        this.hasEngine = hasEngine;
    }

    @Override
    public String toString() {
        return "Light{" +
                "carNumber='" + getCarNumber() + '\'' +
                ", carAge=" + getCarAge() +
                ", numWheels=" + getNumWheels() +
                ", steeringShape='" + getSteeringShape() + '\'' +
                ", pollutionPerMinute=" + getPollutionPerMinute() +
                ", hasEngine=" + hasEngine +
                '}';
    }

}
