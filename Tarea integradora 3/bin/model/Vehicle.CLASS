package model;
import java.util.ArrayList;

public class Vehicle{
    private boolean alreadyUsed;
    private double basePrice;
    private double sellPrice;
    private String mark;
    private int model;
    private int cilinderCapacity;
    private double kilometers;
    private String placa;
    private ArrayList<Document>documents;

    public String toString() {
        return "Vehicle{" +
                "alreadyUsed=" + alreadyUsed +
                ", basePrice=" + basePrice +
                ", sellPrice=" + sellPrice +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", cilinderCapacity='" + cilinderCapacity + '\'' +
                ", kilometers=" + kilometers +
                ", placa='" + placa + '\'' +
                '}';
    }

    /**
     * Vehicle
     * create a new vehicle
     * @param alreadyUsed
     * @param basePrice
     * @param sellPrice
     * @param mark
     * @param model
     * @param cilinderCapacity
     * @param kilometers
     * @param placa
     */
    public Vehicle(boolean alreadyUsed, double basePrice, double sellPrice, String mark,
                   int model, int cilinderCapacity, double kilometers, String placa) {
        this.alreadyUsed = alreadyUsed;
        this.basePrice = basePrice;
        this.sellPrice = sellPrice;
        this.mark = mark;
        this.model = model;
        this.cilinderCapacity = cilinderCapacity;
        this.kilometers = kilometers;
        this.placa = placa;
        documents=new ArrayList<Document>();
    }

    /**
     * addSoat
     * Take the params and create a new object in the Arraylist
     * @param price
     * @param year
     * @param image
     * @param numberSoat
     * @return
     */
    public String addSoat(double price, int year,int[][] image, String numberSoat){
        documents.add(new Soat(price,year,image,numberSoat));
        return numberSoat;
    }

    /**
     * addTechno
     * this method take the paramks to create a new object in the arrayList
     * the object createad and assigned
     * @param price
     * @param year
     * @param image
     * @param numberTechno
     * @return String, the number of thecnomecanic
     */
    public String addTechno(double price, int year, int[][] image, String numberTechno){
        documents.add(new Technomecanic(price,year,image,numberTechno));
        return numberTechno;
    }

    /**
     * printDocs
     * take the docs and id information
     * @param id
     * @return
     */
    public String printDocs(String id){
        String mss="Vehicle{" +id+
                "documents=" + documents +
                '}';
        return mss;
    }

    public int getCilinderCapacity() {
        return cilinderCapacity;
    }

    public void setCilinderCapacity(int cilinderCapacity) {
        this.cilinderCapacity = cilinderCapacity;
    }

    public String getPlaca() {
        return placa;
    }

    public ArrayList<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(ArrayList<Document> documents) {
        this.documents = documents;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getKilometers() {
        return kilometers;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public void setKilometers(double kilometers) {
        this.kilometers = kilometers;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public boolean isAlreadyUsed() {
        return alreadyUsed;
    }

    public void setAlreadyUsed(boolean alreadyUsed) {
        this.alreadyUsed = alreadyUsed;
    }


}
