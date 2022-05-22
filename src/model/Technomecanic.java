package model;

public class Technomecanic extends Document{
    private String numberTechnomecanic;

    public Technomecanic(double price, int date, int[][] image, String numberTechnomecanic) {
        super(price, date, image);
        this.numberTechnomecanic = numberTechnomecanic;
    }

    public String getNumberTechnomecanic() {
        return numberTechnomecanic;
    }

    public void setNumberTechnomecanic(String numberTechnomecanic) {
        this.numberTechnomecanic = numberTechnomecanic;
    }

}
