package Homework3;
import java.util.ArrayList;
import java.util.List;

// Superclass Engine
class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

// Subclasses of Engine
class CombustionEngine extends Engine {
    public CombustionEngine() {
        super("Combustion");
    }
}

class ElectricEngine extends Engine {
    public ElectricEngine() {
        super("Electric");
    }
}

class HybridEngine extends Engine {
    public HybridEngine() {
        super("Hybrid");
    }
}

// Class Manufacture
class Manufacture {
    private String name;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

// Abstract superclass Vehicle
abstract class Vehicle {
    private Manufacture manufacture;
    private Engine engine;
    private int year;
    private String color;
    private double price;
    private String registrationNumber;

    public Vehicle(
        Manufacture manufacture,
        Engine engine,
        int year,
        String color,
        double price,
        String registrationNumber
    ) {
        this.manufacture = manufacture;
        this.engine = engine;
        this.year = year;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public abstract void ShowCharacteristics();

    public Manufacture getManufacture() {
        return manufacture;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
}

// Subclasses of Vehicle
class ICEV extends Vehicle {
    public ICEV(
        Manufacture manufacture,
        CombustionEngine engine,
        int year,
        String color,
        double price,
        String registrationNumber
    ) {
        super(manufacture, engine, year, color, price, registrationNumber);
    }

    @Override
    public void ShowCharacteristics() {
        System.out.println("Vehicle Type: ICEV");
        System.out.println("Manufacturer: " + getManufacture().getName());
        System.out.println("Location: " + getManufacture().getLocation());
        System.out.println("Engine Type: " + getEngine().getType());
        System.out.println("Year: " + getYear());
        System.out.println("Color: " + getColor());
        System.out.println("Price: " + getPrice());
        System.out.println("Registration Number: " + getRegistrationNumber());
    }
}

class BEV extends Vehicle {
    public BEV(
        Manufacture manufacture,
        ElectricEngine engine,
        int year,
        String color,
        double price,
        String registrationNumber
    ) {
        super(manufacture, engine, year, color, price, registrationNumber);
    }

    @Override
    public void ShowCharacteristics() {
        System.out.println("Vehicle Type: BEV");
        System.out.println("Manufacturer: " + getManufacture().getName());
        System.out.println("Location: " + getManufacture().getLocation());
        System.out.println("Engine Type: " + getEngine().getType());
        System.out.println("Year: " + getYear());
        System.out.println("Color: " + getColor());
        System.out.println("Price: " + getPrice());
        System.out.println("Registration Number: " + getRegistrationNumber());
    }
}

class HybridV extends Vehicle {
    public HybridV(
        Manufacture manufacture,
        HybridEngine engine,
        int year,
        String color,
        double price,
        String registrationNumber
    ) {
        super(manufacture, engine, year, color, price, registrationNumber);
    }

    @Override
    public void ShowCharacteristics() {
        System.out.println("Vehicle Type: HybridV");
        System.out.println("Manufacturer: " + getManufacture().getName());
        System.out.println("Location: " + getManufacture().getLocation());
        System.out.println("Engine Type: " + getEngine().getType());
        System.out.println("Year: " + getYear());
        System.out.println("Color: " + getColor());
        System.out.println("Price: " + getPrice());
        System.out.println("Registration Number: " + getRegistrationNumber());
    }
    public static void main(String[] args) {
        // Create manufacturers
        Manufacture toyotaManufacture = new Manufacture();
        toyotaManufacture.setName("Toyota");
        toyotaManufacture.setLocation("Japan");

        Manufacture teslaManufacture = new Manufacture();
        teslaManufacture.setName("Tesla");
        teslaManufacture.setLocation("USA");

        // Create vehicles
        ICEV icev = new ICEV(
            toyotaManufacture,
            new CombustionEngine(),
            2022,
            "Red",
            25000.0,
            "ABC123"
        );

        BEV bev = new BEV(
            teslaManufacture,
            new ElectricEngine(),
            2021,
            "Blue",
            35000.0,
            "XYZ456"
        );

        HybridV hybridV = new HybridV(
            toyotaManufacture,
            new HybridEngine(),
            2020,
            "Silver",
            30000.0,
            "DEF789"
        );

        // Create an array of vehicles
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(icev);
        vehicles.add(bev);
        vehicles.add(hybridV);

        // Show characteristics of each vehicle
        for (Vehicle vehicle : vehicles) {
            vehicle.ShowCharacteristics();
            System.out.println();
        }
    }
}


    






