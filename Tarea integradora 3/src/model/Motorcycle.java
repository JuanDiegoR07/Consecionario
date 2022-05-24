package model;

public class Motorcycle extends Vehicle implements Sellable{
    private String motorcycletype;
    private double gasolineCapacity;
    private double gasolineConsume;
    private MotorcycleType motorcycleType;

    public Motorcycle(boolean alreadyUsed, double basePrice, double sellPrice, String mark, int model, int cilinderCapacity, double kilometers,
                      String placa, String motorcycletype, double gasolineCapacity, double gasolineConsume, int optMT) {
        super(alreadyUsed, basePrice, sellPrice, mark, model, cilinderCapacity, kilometers, placa);
        this.motorcycletype = motorcycletype;
        this.gasolineCapacity = gasolineCapacity;
        this.gasolineConsume = gasolineConsume;
        switch (optMT){
            case 1:
                motorcycleType = MotorcycleType.STANDAR;
                break;
            case 2:
                motorcycleType = MotorcycleType.SPORT;
                break;
            case 3:
                motorcycleType = MotorcycleType.SCOOTER;
                break;
            case 4:
                motorcycleType = MotorcycleType.CROOS;
        }
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
        priceAdd = (0.04 * basePrice);
        finalPrice += priceAdd;
        String message = String.valueOf(finalPrice);
        return message;
    }
    public MotorcycleType getMotorcycleType() {
        return motorcycleType;
    }

    public void setMotorcycleType(MotorcycleType motorcycleType) {
        this.motorcycleType = motorcycleType;
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

    public String getMotorcycletype() {
        return motorcycletype;
    }

    public void setMotorcycletype(String motorcycletype) {
        this.motorcycletype = motorcycletype;
    }

}
