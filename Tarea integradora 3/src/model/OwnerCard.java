package model;

public class OwnerCard extends Document{
    private String numberOwnercard;

    public OwnerCard(double price, int date, int[][] image, String numberOwnercard) {
        super(price, date, image);
        this.numberOwnercard = numberOwnercard;
    }

    public String getNumberOwnercard() {
        return numberOwnercard;
    }

    public void setNumberOwnercard(String numberOwnercard) {
        this.numberOwnercard = numberOwnercard;
    }
}

