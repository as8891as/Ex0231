package com.example.ex0231.ex2;

public class Kibbutz {
    private Vehicles[] vehiclesInKibbutz;
    private int count;

    public Kibbutz() {
        vehiclesInKibbutz = new Vehicles[500];
        count = 0;
    }

    public void insertVehicle(Vehicles vehicle) {
        vehiclesInKibbutz[count] = vehicle;
        if (count!=500) {
            count++;
        }
    }

    private Vehicles[] getOldVehicles() {
        int counter = 0;
        for (Vehicles vehicle : vehiclesInKibbutz) {
            if (vehicle.getCarAge()>15 && vehicle.getSteeringShape().equals("steering wheel")) {
                counter++;
            }
        }
        Vehicles[] oldVehicles = new Vehicles[counter];
        counter = 0;
        for (Vehicles vehicle : vehiclesInKibbutz) {
            if (vehicle.getCarAge()>15 && vehicle.getSteeringShape().equals("steering wheel")) {
                oldVehicles[counter] = vehicle;
                counter++;
            }
        }
        return oldVehicles;
    }

    private int getNumLightSteeringVehicles() {
        int counter = 0;
        for (Vehicles vehicle : vehiclesInKibbutz) {
            if ((vehicle instanceof Light || vehicle instanceof Regular) && (vehicle.getSteeringShape().equals("steering wheel"))) {
                counter ++;
            }
        }
        return counter;
    }
}
