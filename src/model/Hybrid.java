package model;

public class Hybrid extends Car implements Sellable{
    private double gasolineCapacity;
    private double gasolineConsume;
    private TypeGasoline typeGasoline;
    private TypeCharger typeCharger;
    private double batteryDuration;
    private double batteryConsume;

    /**
     * Hybrid
     * Create a new hybrid car
     * @param alreadyUsed
     * @param basePrice
     * @param sellPrice
     * @param mark
     * @param model
     * @param cilinderCapacity
     * @param kilometers
     * @param placa
     * @param numDoors
     * @param polarized
     * @param optCar
     * @param gasolineCapacity
     * @param gasolineConsume
     * @param optGasoline
     * @param optCharge
     * @param batteryDuration
     * @param batteryConsume
     */
    public Hybrid(boolean alreadyUsed, double basePrice, double sellPrice, String mark, int model, int cilinderCapacity, double kilometers,
                  String placa, int numDoors, boolean polarized, int optCar, double gasolineCapacity, double gasolineConsume, int optGasoline,
                  int optCharge, double batteryDuration, double batteryConsume) {
        super(alreadyUsed, basePrice, sellPrice, mark, model, cilinderCapacity, kilometers, placa, numDoors, polarized, optCar);
        this.gasolineCapacity = gasolineCapacity;


        this.gasolineConsume = gasolineConsume;
        switch (optCharge){
            case 1:
                typeCharger = TypeCharger.FAST;
                break;
            case 2:
                typeCharger = TypeCharger.NORMAL;
                break;
        }
        switch (optGasoline){
            case 1:
                typeGasoline = TypeGasoline.EXTRA;
                break;
            case 2:
                typeGasoline = TypeGasoline.CORRIENTE;
                break;
            case 3:
                typeGasoline = TypeGasoline.DIESEL;
                break;
        }
        this.batteryDuration = batteryDuration;
        this.batteryConsume = batteryConsume;
    }

    public double getBatteryConsume() {
        return batteryConsume;
    }

    public void setBatteryConsume(double batteryConsume) {
        this.batteryConsume = batteryConsume;
    }

    public double getBatteryDuration() {
        return batteryDuration;
    }

    public void setBatteryDuration(double batteryDuration) {
        this.batteryDuration = batteryDuration;
    }

    public TypeCharger getTypeCharger() {
        return typeCharger;
    }

    public void setTypeCharger(TypeCharger typeCharger) {
        this.typeCharger = typeCharger;
    }

    public TypeGasoline getTypeGasoline() {
        return typeGasoline;
    }

    public void setTypeGasoline(TypeGasoline typeGasoline) {
        this.typeGasoline = typeGasoline;
    }

    public double getGasolineConsume() {
        return gasolineConsume;
    }

    public void setGasolineConsume(double gasolineConsume) {
        this.gasolineConsume = gasolineConsume;
    }

    public double getGasolineCapacity() {
        return gasolineCapacity;
    }

    public void setGasolineCapacity(double gasolineCapacity) {
        this.gasolineCapacity = gasolineCapacity;
    }

    /**
     * CalculatePrice
     * this method calculte the diferentes prices
     * in base on the kind of vehicle
     * @param year
     * @param basePrice
     * @param sellPrice
     * @return String with the total price
     */
    @Override
    public String calculatePrice(int year, double basePrice, double sellPrice) {
        double finalPrice = 0;
        double priceAdd = 0;
        if (year > 2022)
            finalPrice = sellPrice+500.000;
        priceAdd =0;
        finalPrice += priceAdd;
        String message = String.valueOf(finalPrice);
        return message;
    }
}
