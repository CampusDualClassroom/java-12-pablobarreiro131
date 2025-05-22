package com.campusdual.classroom;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    public Car (String brand, String model, String fuel){
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;

    }

    public Car (){}

    public void start(){
        if(this.tachometer == 0){
            this.tachometer=1000;
            System.out.println("Vehículo encendido");
        }
        System.out.println("O vehículo xa esta encendido");

    }

    public void stop(){
        if(this.speedometer == 0){
            this.tachometer=0;
            System.out.println("Vehículo apagado");
        }
        System.out.println("Non se pode apagar o vehículo, primero ten que estar detenido");

    }

    public void accelerate(){
        if(this.speedometer+10<=MAX_SPEED) {
            this.speedometer+=10;
            System.out.println("Velocidad: " + this.speedometer);
        } else {
            System.out.println("No se puede circular mas rapido");
        }
    }

    public void brake(){
        if(this.speedometer > 0) {
            this.speedometer-=10;
            System.out.println("Velocidad: " + this.speedometer);
        } else {
            System.out.println("Ya estás parado.");
        }
    }

    public void turnAngleOfWheels(int angle){
        int angleAhora= this.wheelsAngle + angle;
        if (angleAhora>45){
            this.wheelsAngle = 45;
            System.out.println("No se puede girar más");
        }
        else if (angleAhora<-45){
            this.wheelsAngle = -45;
            System.out.println("No se puede girar más");
        }
        else{
            this.wheelsAngle = angleAhora;
        }
    }

    public String showSteeringWheelDetails(){
        return null;
    }

    public boolean isReverse() {
        return this.reverse;
    }

    public void setReverse(boolean reverse){
        if (this.speedometer==0 && reverse){
            this.reverse = reverse;
            this.gear = "R";
        } else {
            if (!reverse){
                this.reverse = false;
                this.gear = "N";
            }
        }
    }

    public void showDetails(){}


    public boolean isTachometerGreaterThanZero() {
        if(this.tachometer>0){
            return true;
        } else return false;
    }

    public boolean isTachometerEqualToZero() {
        if(this.tachometer== 0){
            return true;
        } else return false;
    }
}
