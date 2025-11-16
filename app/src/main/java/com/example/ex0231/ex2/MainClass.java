package com.example.ex0231.ex2;

public class MainClass {
    public static double sumPollution(Vehicles[] vehicles) {
        double sum = 0;
        for (Vehicles vehicle : vehicles) {
            if (!(vehicle instanceof Bicycle)) {
                sum += vehicle.exhaust();
            }
        }
        return sum;
    }

    public static void noiseMade(Vehicles[] vehicles) {
        int counter = 0;
        for (Vehicles vehicle : vehicles) {
            System.out.println("Vehicle number: "+counter);
            if (vehicle instanceof Regular) {
                ((Regular) vehicle).noise();
            }
            else {
                System.out.println("Unknown noise");
            }
        }
    }

    public static int sumPassengers(Vehicles[] vehicles) {
        int sum = 0;
        for (Vehicles vehicle : vehicles) {
            if (vehicle instanceof Regular) {
                sum += ((Regular) vehicle).getNumPassengers()-1;
            }
            else if (vehicle instanceof Bicycle) {
                sum ++;
            }
        }
        return sum;
    }

    public static String longestCharge(Vehicles[] vehicles) {
        double max = -1;
        String correctCarNumber = "";
        for (Vehicles vehicle : vehicles) {
            if (vehicle instanceof Cart) {
                if (((Cart) vehicle).getLoadingTime()>max) {
                    max = ((Cart) vehicle).getLoadingTime();
                    correctCarNumber = vehicle.getCarNumber();
                }
            }
        }
        return correctCarNumber;
    }
}
