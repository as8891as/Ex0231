package com.example.ex0231.ex2;

public class Cart extends Light {
    private double loadingTime;

    public Cart(String carNumber, double carAge, int numWheels, String steeringShape, double pollutionPerMinute, boolean hasEngine, double loadingTime) {
        super(carNumber, carAge, numWheels, steeringShape, pollutionPerMinute, hasEngine);
        this.loadingTime = loadingTime;
    }

    public double getLoadingTime() {
        return loadingTime;
    }

    public void setLoadingTime(double loadingTime) {
        this.loadingTime = loadingTime;
    }

    @Override
    public double exhaust() {
        if (getPollutionPerMinute()==0)
        {
            return 0;
        }
        else
        {
            return (super.exhaust()/3);
        }
    }

    public int hitchhikers() {
        return 0;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "carNumber='" + getCarNumber() + '\'' +
                ", carAge=" + getCarAge() +
                ", numWheels=" + getNumWheels() +
                ", steeringShape='" + getSteeringShape() + '\'' +
                ", pollutionPerMinute=" + getPollutionPerMinute() +
                ", hasEngine=" + getHasEngine() +
                ", loadingTime=" + loadingTime +
                '}';
    }

}
