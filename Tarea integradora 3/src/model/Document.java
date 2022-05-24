package model;

public class Document {
    private double price;
    private int date;
    private int[][] image;

    public Document(double price, int date, int[][] image) {
        this.price = price;
        this.date = date;
        this.image = image;
    }

    @Override
    public String toString() {
        return "Document{" +
                "price=" + price +
                ", date=" + date +
                ", image='" + image + '\'' +
                '}';
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int[][] getImage() {
        return image;
    }

    public void setImage(int[][] image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
