package model;

public class Soat extends Document {
    private String numberSoat;

    public Soat(double price, int date, int[][] image, String numberSoat) {
        super(price, date, image);
        this.numberSoat = numberSoat;
    }

    public String getNumberSoat() {
        return numberSoat;
    }

    public void setNumberSoat(String numberSoat) {
        this.numberSoat = numberSoat;
    }
}
