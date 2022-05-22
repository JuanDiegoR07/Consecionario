package model;

public class Gasoline extends Car implements Sellable{
    private double gasolineCapacity;
    private double gasolineConsume;
    private TypeGasoline typeGasoline;

    /**
     * Gasoline
     * Create a new gasoline car
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
     */
    public Gasoline(boolean alreadyUsed, double basePrice, double sellPrice, String mark, int model, int cilinderCapacity,
                    double kilometers, String placa, int numDoors, boolean polarized, int optCar, double gasolineCapacity,
                    double gasolineConsume, int optGasoline) {
        super(alreadyUsed, basePrice, sellPrice, mark, model, cilinderCapacity, kilometers, placa, numDoors, polarized, optCar);

        this.gasolineCapacity = gasolineCapacity;
        this.gasolineConsume = gasolineConsume;
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
    public String calculatePrice(int year, double basePrice, double sellPrice){
        String mss = "";
        double finalPrice = 0;
        double priceAdd = 0;
        if (year > 2022)
            finalPrice = sellPrice+500.000;
        priceAdd = (0.20 * basePrice);
        finalPrice += priceAdd;
        mss = String.valueOf(finalPrice);
        return mss;
    }
}
