package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
        Car coche = new Car ("Audi", "A1", "Full");
        coche.isTachometerEqualToZero();
        coche.start();
        coche.start();
        coche.stop();

        coche.start();
        coche.accelerate();
        coche.stop();
        coche.brake();
        coche.start();
        for (int i = 0; i<13 ; i++) {
            coche.accelerate();
        }

        for (int i = 0; i<13 ; i++) {
            coche.brake();
        }

        coche.turnAngleOfWheels(20);
        coche.turnAngleOfWheels(50);

        coche.setReverse(true);
        coche.accelerate();
        coche.setReverse(true);
    }

}