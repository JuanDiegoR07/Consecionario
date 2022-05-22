package model;

public class Car extends Vehicle{
    private int numDoors;
    private boolean polarized;
    private TypeCar car;

    public Car(boolean alreadyUsed, double basePrice, double sellPrice, String mark, int model,
               int cilinderCapacity, double kilometers, String placa, int numDoors, boolean polarized, int optCar) {
        super(alreadyUsed, basePrice, sellPrice, mark, model, cilinderCapacity, kilometers, placa);
        this.numDoors = numDoors;
        this.polarized = polarized;
        switch (optCar){
            case 1:
                car = TypeCar.SEDAN;
                break;
            case 2:
                car = TypeCar.PIKCUPTRUCK;
                break;
        }
    }

    public boolean isPolarized() {
        return polarized;
    }

    public void setPolarized(boolean polarized) {
        this.polarized = polarized;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }
}
