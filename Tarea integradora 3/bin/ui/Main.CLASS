package ui;
import jdk.swing.interop.SwingInterOpUtils;
import model.*;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static Scanner lt = new Scanner(System.in);
    public static Company ct = new Company("Cali");

    /**
     * main
     * this method do the main, here the method call all the main methods
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("""
                WELCOME TO VEHICLE COMPANY
                """);
        System.out.println("Type the company name: ");
        String nameCompany = lt.nextLine();
        menu();

    }

    /**
     * menu
     * the menu give the option to the user to register and search the requieres
     */
    public static void menu() {
        System.out.print("""
                Please choose one option:
                [1]Register vehicle
                [2]Vehicle price
                [3]Vehicles info
                [4]Info about the vehicle with the ID
                [5]Parking info
                [6]Info about vehicles
                """);
        int opt = lt.nextInt();
        lt.nextLine();
        switch (opt) {
            case 1:
                registerVehicle();
                menu();
                break;
            case 2:
                vehiclePrice();
                menu();
                break;
            case 3:
                infoVehicle();
                menu();
                break;
            case 4:
                infoVehicleId();
                menu();
                break;
            case 5:
                infoParking();
                menu();
                break;
            case 6:
                aboutVehicles();
                menu();
        }
    }

    /**
     * registerVehicle
     * this method take the vehicle features for the user selections
     */
    public static void registerVehicle() {
        String message = "";
        String id = "No assigned ID";
        System.out.println("REGISTER VEHICLE");
        System.out.print("""
                Is the vehicle already used?
                [-]True
                [-]False
                """);
        boolean alreadyUsed = lt.nextBoolean();
        System.out.println("Type the base price: ");
        double basePrice = lt.nextDouble();
        System.out.println("Type the sell price: ");
        double sellPrice = lt.nextDouble();
        System.out.println("Type the mark: ");
        String mark = lt.next();
        System.out.println("Type the model: ");
        int model = lt.nextInt();
        System.out.println("Type the cilinder capacity: ");
        int cilinderCapacity = lt.nextInt();
        System.out.println("Type the miles tours: ");
        double km = lt.nextDouble();
            System.out.println("Type the car id: ");
             id = lt.next();
        System.out.print("""
                Select the type of vehicle that you want:
                [1]Car
                [2]Motorcycle
                """);
        int opt = lt.nextInt();
        if (opt==1) {
            registerCar(alreadyUsed, basePrice, sellPrice, mark, model, cilinderCapacity, km, id);
            menu();
        }
        if (opt==2) {
            registerMotorcycle(alreadyUsed, basePrice, sellPrice, mark, model, cilinderCapacity, km, id);
            menu();
        }
        menu();
    }

    /**
     * RegisterCar
     * This method take the vehicle params and add information to
     * pass this to company for create a new vehicle
     * @param alreadyUsed
     * @param basePrice
     * @param sellPrice
     * @param mark
     * @param model
     * @param cilinderCapacity
     * @param km
     * @param id
     */
    public static void registerCar(boolean alreadyUsed, double basePrice, double sellPrice, String mark,
    int model,int cilinderCapacity, double km, String id) {
        int[][] document=new int[4][4];
        Random rand=new Random();
        int maxNum=99;
        for(int i=0;i<document.length;i++){
            for(int j=0;j<document[0].length;j++){
                document[i][j]=rand.nextInt(maxNum);
            }
        }
        String message = "";
        System.out.println("Type the number of doors: ");
        int numDoors = lt.nextInt();
        System.out.print("""
                Type if the car is polarized
                [-]True
                [-]False
                """);
        boolean polarized = lt.nextBoolean();
        System.out.print("""
                Enter the model car
                [1]Sedan
                [2]Picktruck
                """);
        int typeCar = lt.nextInt();
        System.out.print("""
                Enter the type car
                [1]Electric
                [2]Hybrid
                [3]Gasoline
                """);
        int optCar = lt.nextInt();
        lt.nextLine();
        switch (optCar) {
            case 1:
                System.out.print("""
                        Select de type of charge
                        [1]Fast
                        [2]Normal
                        """);
                int typeCharge = lt.nextInt();
                System.out.println("Type the battery duration: ");
                double batteryDurationE = lt.nextDouble();
                System.out.println("Type the battery consume: ");
                double batteryConsumeE = lt.nextDouble();
                System.out.println("Type the document price: ");
                double docuemntPrice = lt.nextDouble();
                lt.nextLine();
                System.out.println("Type the document year: ");
                int year = lt.nextInt();
                lt.nextLine();
                System.out.println("The image succesfully added");
                lt.nextLine();
                message = ct.registerElectricCar(alreadyUsed,basePrice,sellPrice,mark,model,cilinderCapacity,km,id,
                        numDoors,polarized,typeCar,typeCharge,batteryDurationE,batteryConsumeE,docuemntPrice,year,document);
                System.out.println(message);
                lt.nextLine();
                ct.calculateMap(model);
                break;
            case 2:
                System.out.println("Type the gasoline capacity: ");
                double gasolineCapacityH = lt.nextDouble();
                System.out.println("Type the gasoline consume: ");
                double gasolineConsumeH = lt.nextDouble();
                System.out.println("""
                        Select the gasoline type
                        [1]Extra
                        [2]Corriente
                        [3]Diesel
                        """);
                int typeGasolineH = lt.nextInt();
                System.out.println("""
                        Select the charger type
                        [1]Fast
                        [2]Normal
                        """);
                int typeChargeH = lt.nextInt();
                System.out.println("Type the battery duration: ");
                double batteryDurationH = lt.nextDouble();
                System.out.println("Type the battery consume: ");
                double batteryConsumeH = lt.nextDouble();
                System.out.println("Type the document price: ");
                double docuemntPriceH = lt.nextDouble();
                System.out.println("Type the document year: ");
                int yearH = lt.nextInt();
                System.out.println("The image succesfully added");
                message = ct.registerHybridCar(alreadyUsed, basePrice, sellPrice, mark, model, cilinderCapacity, km, id, numDoors, polarized,typeCar,
                        gasolineCapacityH, gasolineConsumeH, typeGasolineH, typeChargeH, batteryDurationH, batteryConsumeH,docuemntPriceH,yearH,document);
                System.out.println(message);
                ct.calculateMap(model);
                break;

            case 3:
                System.out.println("Type the gasoline capacity: ");
                double gasolineCapacity = lt.nextDouble();
                System.out.println("Type the gasoline consume: ");
                double gasolineConsume = lt.nextDouble();
                System.out.println("""
                        Select the gasoline type
                        [1]Extra
                        [2]Corriente
                        [3]Diesel
                        """);
                int typeGasoline = lt.nextInt();
                System.out.println("Type the document price: ");
                double docuemntPriceG = lt.nextDouble();
                System.out.println("Type the document year: ");
                int yearG = lt.nextInt();
                System.out.println("The image succesfully added");
                message = ct.registerGasolineCar(alreadyUsed, basePrice, sellPrice, mark, model, cilinderCapacity, km, id, numDoors,
                        polarized,typeCar,gasolineCapacity,gasolineConsume,typeGasoline,docuemntPriceG,yearG,document);
                System.out.println(message);
                lt.nextLine();
                ct.calculateMap(model);
                break;
        }
    }

    /**
     * RegisterMotorCycle
     * This method take the vehicle params and get new
     * to send this information to the company class
     * and create a new object
     * @param alreadyUsed
     * @param basePrice
     * @param sellPrice
     * @param mark
     * @param model
     * @param cilinderCapacity
     * @param km
     * @param id
     */
    public static void registerMotorcycle(boolean alreadyUsed, double basePrice, double sellPrice, String mark,
     int model,int cilinderCapacity, double km, String id){
        int[][] document=new int[4][4];
        Random rand=new Random();
        int maxNum=99;
        for(int i=0;i<document.length;i++){
            for(int j=0;j<document[0].length;j++){
                document[i][j]=rand.nextInt(maxNum);
            }
        }
        String message = "";
        System.out.println("Type the motorcycle type: ");
        String motorcycleType = lt.nextLine();
        System.out.println("Type the gasoline capacity: ");
        double gasolineC = lt.nextDouble();
        System.out.println("Type the gasoline consume: ");
        double gasolineConsume = lt.nextDouble();
        System.out.println("""
                Enter the motorcycle type:
                [1]Standar
                [2]Sport
                [3]Scooter
                [4]Cross
                """);
        int type = lt.nextInt();
        System.out.println("Type the document price: ");
        double docuemntPrice = lt.nextDouble();
        System.out.println("Type the document year: ");
        int year = lt.nextInt();
        System.out.println("The image succesfully added");
        message = ct.registerMotorcycle(alreadyUsed,basePrice,sellPrice,mark,model,cilinderCapacity,km,id,
                motorcycleType,gasolineC,gasolineConsume,type,docuemntPrice,year,document);
        lt.nextLine();
        ct.calculateMap(model);
        System.out.println(message);
    }

    /**
     * VehiclePrice
     *
     */
    public static void vehiclePrice(){
        String mss="";
        int opt2 = 0;
        System.out.println("Enter the vehicle id: ");
        String id = lt.nextLine();
        System.out.println("Enter the documents year: ");
        int year = lt.nextInt();
        System.out.print("""
                Enter the vehicle type
                [1]Car
                [2]MotorCycle
                """);
        int opt = lt.nextInt();
        if (opt==1){
            System.out.print("""
                    Select the type car
                    [1] Electric
                    [2]Hybrid
                    [3]Gasoline
                    """);
            opt2 = lt.nextInt();
        }
        mss=ct.calculatePrice(id,opt,opt2,year);
        System.out.println(mss);
    }

    /**
     *InfoVehicle
     * This method show the information about what king of information
     * want the user, to show in the screen
     */
    public static void infoVehicle(){
        String mss="";
        System.out.println("""
                Select the information that you want to search
                [1]Vehicle type
                [2]Gas type
                [3]Vehicle used/new
                """);
        int opt = lt.nextInt();
        mss = ct.vehicleInfo(opt);
        System.out.println(mss);
    }

    /**
     * Info vehicle id
     * The method take the user inf id and
     * send this to the controller for find the require information
     */
    private static void infoVehicleId(){
        String mss="";
        System.out.println("Type the vehicle id: ");
        String id = lt.nextLine();
        mss=ct.vehicleInfoId(id);
        System.out.println(mss);
    }

    /**
     * infoParking
     * Show the parking information with the year
     */
    private static void infoParking() {
        String mss= "";
        System.out.println("Type the vehicle model to find blank spaces in the parking: ");
        int model = lt.nextInt();
        ct.calculateMap(model);
        mss = ct.printMatriz();
        System.out.println(mss);
    }

    /**
     * about vehicles
     * this method search the information that the
     * user want
     */
    private static void aboutVehicles() {
        String mss = "";
        int opt2 = 0;
        System.out.println("""
                Select a option:
                [1]Information about a vehicles for a year
                [2]Information older or newer vehicle
                [3]Ocupation percent parking
                """);
        int opt = lt.nextInt();
        switch (opt){
            case 1:
                System.out.println("Type a year: ");
                int year = lt.nextInt();
                mss = ct.aboutVehicleYear(year);
                break;
            case 2:
                System.out.println("""
                        [1]Newer
                        [2]Older
                        """);
                opt2 = lt.nextInt();
                mss= ct.olderNewer(opt2);
                break;
            case 3:
                System.out.println("Parking percent");
                System.out.println('\n'+ct.calculatePercent());

        }
        System.out.println(mss);
    }
}

