package model;
import java.util.ArrayList;

public class Company {
    private String name;
    private ArrayList<Vehicle> vehicles;
    private ArrayList<Vehicle>parkingVehicles;
    private Vehicle[][] parking;


    /**
     * RegisterElectricCar
     * This methos take the params that the main send, and this methos create a new objet in the
     * arraylist in the vehicles arraylist.
     *
     * @param alreadyUsed
     * @param basePrice
     * @param sellPrice
     * @param mark
     * @param model
     * @param cilinderCapacity
     * @param km
     * @param id
     * @param numDoors
     * @param polarized
     * @param typeCar
     * @param typeCharge
     * @param batteryDurationE
     * @param batteryConsumeE
     * @return String, is a message that say if this add a new electric car
     */
    public String registerElectricCar(boolean alreadyUsed, double basePrice, double sellPrice, String mark, int model,
                                      int cilinderCapacity, double km, String id, int numDoors, boolean polarized, int typeCar,
                                      int typeCharge, double batteryDurationE, double batteryConsumeE, double price, int year, int[][] matriz) {
        boolean flag = existeVehicle(id);
        String message = "Couldn't add a Vehicle";

        if (flag == false) {
            vehicles.add(new Electric(alreadyUsed, basePrice, sellPrice, mark, model, cilinderCapacity, km, id,
                    numDoors, polarized, typeCar, typeCharge, batteryDurationE, batteryConsumeE));
            message = "Congrats!, this vehicle is added!";
            message += "| The SOAT IS:" + addSoat(id, price, year, matriz);
            message += "| The tecnhomecanic is: " + addTechnomecanic(id, price, year, matriz);
            if (model< 2015){
                parkingVehicles.add(new Electric(alreadyUsed, basePrice, sellPrice, mark, model, cilinderCapacity, km, id,
                        numDoors, polarized, typeCar, typeCharge, batteryDurationE, batteryConsumeE));
            }
            if (alreadyUsed == true)
                message += "| The number own card is: " + numberOwnerCard(id, price, year, matriz);
            flag = false;
        }
        return message;
    }

    /**
     * RegisterHybirdCar
     * This method take the params that the main sended, and crate a new
     * objet in the vehicles arraylist
     *
     * @param alreadyUsed
     * @param basePrice
     * @param sellPrice
     * @param mark
     * @param model
     * @param cilinderCapacity
     * @param km
     * @param id
     * @param numDoors
     * @param polarized
     * @param typeCar
     * @param gasolineCapacityH
     * @param gasolineConsumeH
     * @param typeGasolineH
     * @param typeChargeH
     * @param batteryDurationH
     * @param batteryConsumeH
     * @return String, a message inf this vehicle can added or not
     */
    public String registerHybridCar(boolean alreadyUsed, double basePrice, double sellPrice, String mark, int model, int cilinderCapacity,
                                    double km, String id, int numDoors, boolean polarized, int typeCar, double gasolineCapacityH, double gasolineConsumeH,
                                    int typeGasolineH, int typeChargeH, double batteryDurationH, double batteryConsumeH, double price, int year, int[][] matriz) {
        boolean flag = existeVehicle(id);
        String message = "Couldn't add a Vehicle";
        if (flag == true) {
            vehicles.add(new Hybrid(alreadyUsed, basePrice, sellPrice, mark, model, cilinderCapacity, km, id,
                    numDoors, polarized, typeCar, gasolineCapacityH, gasolineConsumeH, typeGasolineH, typeChargeH, batteryDurationH, batteryConsumeH));
            message = "Congrats!, this vehicle is added!";
            message += addSoat(id, price, year, matriz);
            message += addTechnomecanic(id, price, year, matriz);
            if (model< 2015) {
                parkingVehicles.add(new Hybrid(alreadyUsed, basePrice, sellPrice, mark, model, cilinderCapacity, km, id,
                        numDoors, polarized, typeCar, gasolineCapacityH, gasolineConsumeH, typeGasolineH, typeChargeH, batteryDurationH, batteryConsumeH));
            }
            if (alreadyUsed == false) {
                message += numberOwnerCard(id, price, year, matriz);
            }
            flag = false;
        }
        return message;
    }

    /**
     * RegisterGasoline
     * This methos take the saline cars and take the pramas to do a new
     * object in the vehicles arraylist.
     *
     * @param alreadyUsed
     * @param basePrice
     * @param sellPrice
     * @param mark
     * @param model
     * @param cilinderCapacity
     * @param km
     * @param id
     * @param numDoors
     * @param polarized
     * @param typeCar
     * @param gasolineCapacity
     * @param gasolineConsume
     * @param typeGasoline
     * @return String, message if the vehicle can added or not
     */
    public String registerGasolineCar(boolean alreadyUsed, double basePrice, double sellPrice, String mark, int model, int cilinderCapacity,
                                      double km, String id, int numDoors, boolean polarized, int typeCar, double gasolineCapacity, double gasolineConsume,
                                      int typeGasoline, double price, int year, int[][] matriz) {
        boolean flag = existeVehicle(id);
        String message = "Couldn't add a Vehicle";

        if (flag == true) {
            vehicles.add(new Gasoline(alreadyUsed, basePrice, sellPrice, mark, model, cilinderCapacity, km, id,
                    numDoors, polarized, typeCar, gasolineCapacity, gasolineConsume, typeGasoline));
            message = "Congrats!, this vehicle is added!";
            message += addSoat(id, price, year, matriz);
            message += addTechnomecanic(id, price, year, matriz);
            if (model< 2015) {
                parkingVehicles.add(new Gasoline(alreadyUsed, basePrice, sellPrice, mark, model, cilinderCapacity, km, id,
                        numDoors, polarized, typeCar, gasolineCapacity, gasolineConsume, typeGasoline));
            }
            if (alreadyUsed == true)
                message += numberOwnerCard(id, price, year, matriz);

            flag = false;
        }
        return message;
    }

    /**
     * RegisterMotorcycle
     * This method take the paramas by the main
     * and create an ew objerct in Motorcycle class
     *
     * @param alreadyUsed
     * @param basePrice
     * @param sellPrice
     * @param mark
     * @param model
     * @param cilinderCapacity
     * @param km
     * @param id
     * @param motorcycleType
     * @param gasolineC
     * @param gasolineConsume
     * @param type
     * @return String with a message
     * that say if the vehicle can added or not
     */
    public String registerMotorcycle(boolean alreadyUsed, double basePrice, double sellPrice, String mark, int model, int cilinderCapacity,
                                     double km, String id, String motorcycleType, double gasolineC, double gasolineConsume, int type, double price, int year, int[][] matriz) {
        boolean flag = existeVehicle(id);
        String message = "Couldn't add a Vehicle";

        if (flag == true) {
            vehicles.add(new Motorcycle(alreadyUsed, basePrice, sellPrice, mark, model, cilinderCapacity, km, id,
                    motorcycleType, gasolineC, gasolineConsume, type));
            message = "Congrats!, this vehicle is added!";
            message += addSoat(id, price, year, matriz);
            message += addTechnomecanic(id, price, year, matriz);
            if (model< 2015) {
                parkingVehicles.add(new Motorcycle(alreadyUsed, basePrice, sellPrice, mark, model, cilinderCapacity, km, id,
                        motorcycleType, gasolineC, gasolineConsume, type));
            }
            if (alreadyUsed == true)
                message += numberOwnerCard(id, price, year, matriz);
            flag = false;
        }
        return message;
    }

    /**
     * addTechnomecantic
     * this method can run the array, and put all the numbers there
     *
     * @param id
     * @param price
     * @param year
     * @param matriz
     * @return String number of the technomecanic
     */
    private String addTechnomecanic(String id, double price, int year, int[][] matriz) {
        String message = "";
        for (int i = 0; i < matriz.length; i++) {
            message += matriz[0][i];
        }
        for (int x = 1; x < matriz.length; x++) {
            for (int y = 0; y < matriz.length; y++) {
                if (y + x == matriz.length - 1) {
                    message += matriz[x][y];
                }
            }
        }
        for (int a = 1; a < matriz.length; a++) {
            message += matriz[matriz.length - 1][a];
        }
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getPlaca().equals(id)) {
                vehicles.get(i).addTechno(price, year, matriz, message);
            }
        }
        return message;
    }

    /**
     * AddSoat
     * This method take the params to create a new document in the document arraylist
     * in car class
     *
     * @param id
     * @param price
     * @param year
     * @param image
     * @return
     */
    public String addSoat(String id, double price, int year, int[][] image) {
        String message = "";
        for (int i = 0; i < image.length; i++) {
            message += image[i][0];
        }
        for (int j = 1; j < image.length; j++) {
            message += image[image.length - 1][j];
        }
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getPlaca().equals(id)) {
                vehicles.get(i).addSoat(price, year, image, message);
            }
        }
        return message;
    }

    /**
     * NumberOwnerCar
     * this method create a new number owner card
     * @param id
     * @param price
     * @param year
     * @param image
     * @return String with the number
     */
    public String numberOwnerCard(String id, double price, int year, int[][]image){
        String message="";
        for (int i=image.length-1;i>=0;i--){
            for (int j=image.length-1;j>=0;j--){
                if((i+j)%2==0){
                    message+=image[i][j];
                }
            }
        }
        return message;
    }

    public String calculatePrice(String id, int opt, int opt2, int year) {
        String mss = "";
        switch (opt){
            case 1:
            switch (opt2){
                case 1:
                    for (int i = 0; i < vehicles.size(); i++) {
                        if (vehicles.get(i).getPlaca().equals(id)){
                            if(vehicles.get(i)instanceof Electric) {
                                Electric obj = (Electric) vehicles.get(i);
                                mss = obj.calculatePrice(year,obj.getBasePrice(), obj.getSellPrice());
                            }
                        }
                    }
                case 2:
                    for (int i = 0; i < vehicles.size(); i++) {
                        if (vehicles.get(i).getPlaca().equals(id)){
                            if(vehicles.get(i)instanceof Hybrid) {
                                Hybrid obj = (Hybrid) vehicles.get(i);
                                mss = obj.calculatePrice(year,obj.getBasePrice(), obj.getSellPrice());
                            }
                        }
                    }
                case 3:
                    for (int i = 0; i < vehicles.size(); i++) {
                        if (vehicles.get(i).getPlaca().equals(id)){
                            if(vehicles.get(i)instanceof Gasoline) {
                                Gasoline obj = (Gasoline) vehicles.get(i);
                                mss = obj.calculatePrice(year,obj.getBasePrice(), obj.getSellPrice());
                            }
                        }
                    }
                    break;
            }
            case 2:
                for (int i = 0; i < vehicles.size(); i++) {
                    if (vehicles.get(i).getPlaca().equals(id)){
                        if(vehicles.get(i)instanceof Motorcycle) {
                            Motorcycle obj = (Motorcycle) vehicles.get(i);
                            mss = obj.calculatePrice(year,obj.getBasePrice(), obj.getSellPrice());
                        }
                    }
                }
        }
    return mss;
    }

    /**
     * Company contructor
     * @param name
     */
    public Company(String name) {
        this.name = name;
        vehicles = new ArrayList<Vehicle>();
        parkingVehicles = new ArrayList<Vehicle>();
        this.parking = new Vehicle[10][5];
    }

    /**
     * VehicleInfo
     * this method search the information in the vehicles list
     * and take this information to return to string in the main
     * @param opt
     * @return String with the information
     */
    public String vehicleInfo(int opt){
        String mss="";
        switch (opt) {
            case 1:
                String h="no vehicles";
                String e="no vehicles";
                String g="no vehicles";
                String m="no vehicles";
            for (int i = 0; i < vehicles.size(); i++) {
                if (vehicles.get(i) instanceof Hybrid) {
                    Hybrid obj = (Hybrid) vehicles.get(i);
                    h ='\n'+h+obj.toString();
                }
                if (vehicles.get(i) instanceof Electric) {
                    Electric obj = (Electric) vehicles.get(i);
                    e ='\n'+e+obj.toString();
                }
                if (vehicles.get(i) instanceof Gasoline) {
                    Gasoline obj = (Gasoline) vehicles.get(i);
                   g ='\n'+g+obj.toString();
                }
                if (vehicles.get(i) instanceof Motorcycle) {
                    Motorcycle obj = (Motorcycle) vehicles.get(i);
                    m ='\n'+m+obj.toString();
                }
                mss= "Hybrid: "+h+"| Electric: "+e+"| Gasoline: "+g+"| Motorcycle: "+m;
            }
            case 2:
                String h2="no vehicles";
                String e2="no vehicles";
                String g2="no vehicles";
                for (int i = 0; i < vehicles.size(); i++) {
                    if (vehicles.get(i) instanceof Hybrid) {
                        Hybrid obj = (Hybrid) vehicles.get(i);
                        h2 ='\n'+h2+obj.toString();
                    }
                    if (vehicles.get(i) instanceof Electric) {
                        Electric obj = (Electric) vehicles.get(i);
                        e2 ='\n'+e2+obj.toString();
                    }
                    if (vehicles.get(i) instanceof Gasoline) {
                        Gasoline obj = (Gasoline) vehicles.get(i);
                        g2 ='\n'+g2+obj.toString();
                    }
                    mss= "Hybrid: "+h2+"| Electric: "+e2+"| Gasoline: "+g2;
                }
            case 3:
                String vehicle = "";
                for (int i = 0; i < vehicles.size(); i++) {
                    if (vehicles.get(i).isAlreadyUsed()){
                        vehicle = vehicles.get(i).toString();
                        mss = vehicle;
                    }
                }
        }
        return mss;
    }

    /**
     * vehicleInfoId
     * this method search the info of the documents in the id vehicle
     * if the vehicle doesnt found it dont print info
     * @param id
     * @return
     */
    public String vehicleInfoId(String id) {
        String mss="Not found";
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getPlaca().equalsIgnoreCase(id)){
                mss =vehicles.get(i).printDocs(id);
            }
        }
        return mss;
    }


    /**
     *Calculate Map
     * This method search the columns free and
     * put a vehicle depending on the year that
     * the user put
     * @param model
     * @return an int with the position
     */
    public int calculateMap(int model) {
        boolean flag = true;
        int colum = 0;
        for (int i = 0; i < parkingVehicles.size() && flag == true; i++) {
            Vehicle obj = parkingVehicles.get(i);
            if (obj.getModel() < 2015 && obj.isAlreadyUsed() == true) {
                if (obj.getModel() == 2014) {
                    colum = 0;
                } else if (obj.getModel() == 2013) {
                        colum = 1;

                } else if (obj.getModel() == 2012) {
                        colum = 2;

                } else if (obj.getModel() == 2011) {
                        colum = 3;

                } else if (obj.getModel() < 2011) {
                        colum = 4;
                }
            }
        }
        return colum;
    }

    /**
     * MapMatriz
     * This method take the matrix and return the
     * blank spaces and the new.
     * @return a message that show the matrix
     */
    public String mapM(){
        for (int j=0;j<vehicles.size();j++){
            Vehicle obj=vehicles.get(j);
            for(int k=0;k<parking[0].length&&!parkingVehicles.contains(obj);k++){
                int columna=calculateMap(obj.getModel());
                System.out.println(columna+"Col");
                if(parking[k][columna]==null ){
                    parkingVehicles.add(obj);
                    parking[k][columna]=obj;
                }
            }
        }
        String message=printMatriz();
        return message;
    }

    /**
     * Print matriz
     * this methos take the other methods and
     * print the matrix with the poscitions
     * @return String a map
     */
    public String printMatriz(){
        String message="";
        for(int i=0; i<parking.length; i++){
            for(int j=0; j<parking[0].length; j++){
                if(j+1<parking[0].length){
                    if(parking[i][j]!=null){
                        message+="|  Occupied |";
                    }else{ message+="|   Empty   |";}
                }
                else{
                    if(parking[i][j]!=null){
                        message+="|  Occupied |"+" \n";
                    }else{ message+="|   Empty   |"+" \n";}
                }
            }
        }
        return message;
    }

    /**
     * About vehicle year
     * Search the vehicle by a year that
     * the user type
     * @param year
     * @return String the vehicles about the year searched
     */
    public String aboutVehicleYear(int year) {
        String mss = "";
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getModel() == year){
                mss = vehicles.toString();
            }
        }
        return mss;
    }

    /**
     * older Newer
     * The method search the vehicle into the most and newer vehicle
     * @param model
     * @return String message with the vehicle
     */
    public String olderNewer(int model){
        int cont = 0;
        String vehicle = "";
        for (int i = 0; i < vehicles.size(); i++){
            if (vehicles.get(i).getModel() > cont)
                cont = vehicles.get(i).getModel();
            vehicle = vehicles.get(i).toString();
        }
        return vehicle;
    }

    /**
     * Calculate percent
     * this method calculate the parking percent in the parking
     * and show how many percent is cover
     * @return string with the percent
     */
    public String calculatePercent(){
        String mss = "";
        int cont = 0;
        for (int i = 0; i < parkingVehicles.size() ; i++) {
            cont ++;
        }
        double total = (cont * 100)/50;
        mss = total+"%";
        return mss;
    }

    /**
     * Exist vehicle
     * search in the array list vehicle if the vehicle exist
     * @param id
     * @return boolean if the vvehicle exist.
     */
    private boolean existeVehicle(String id) {
        boolean flag = false;
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).equals(id))
                flag = true;
        }
        return flag;
    }

    public ArrayList<Vehicle> getParkingVehicles() {
        return parkingVehicles;
    }

    public void setParkingVehicles(ArrayList<Vehicle> parkingVehicles) {
        this.parkingVehicles = parkingVehicles;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
