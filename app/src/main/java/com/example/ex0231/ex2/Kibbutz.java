package com.example.ex0231.ex2;

public class Kibbutz {
    private Vehicles[] vehiclesInKibbutz;

    public Kibbutz() {
        vehiclesInKibbutz = new Vehicles[0];
    }

    public void insertVehicle(Vehicles vehicle) {
        Vehicles[] newKibbutz = new Vehicles[vehiclesInKibbutz.length+1];
        for (int i=0;i<vehiclesInKibbutz.length;i++) {
            newKibbutz[i] = vehiclesInKibbutz[i];
        }
        newKibbutz[vehiclesInKibbutz.length] = vehicle;
        vehiclesInKibbutz = newKibbutz;
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
