package model;

public class Electric extends Car implements Sellable{
    private TypeCharger typeCharger;
    private double batteryConsume;
    private double batteryDuration;

    public Electric(boolean alreadyUsed, double basePrice, double sellPrice, String mark, int model, int cilinderCapacity,
                    double kilometers, String placa, int numDoors, boolean polarized, int optCar, int optCharge,
                    double batteryConsume, double batteryDuration) {
        super(alreadyUsed, basePrice, sellPrice, mark, model, cilinderCapacity, kilometers, placa, numDoors, polarized, optCar);
        switch (optCharge){
            case 1:
                typeCharger = TypeCharger.FAST;
                break;
            case 2:
                typeCharger = TypeCharger.NORMAL;
                break;
        }
        this.batteryConsume = batteryConsume;
        this.batteryDuration = batteryDuration;
    }

    public double getBatteryDuration() {
        return batteryDuration;
    }

    public void setBatteryDuration(double batteryDuration) {
        this.batteryDuration = batteryDuration;
    }

    public double getBatteryConsume() {
        return batteryConsume;
    }

    public void setBatteryConsume(double batteryConsume) {
        this.batteryConsume = batteryConsume;
    }

    public TypeCharger getTypeCharger() {
        return typeCharger;
    }

    public void setTypeCharger(TypeCharger typeCharger) {
        this.typeCharger = typeCharger;
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
        String mss= "";
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
