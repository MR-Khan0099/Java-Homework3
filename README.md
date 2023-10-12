# Java-Homework3
Name: Mohammed Rizwan
Matriculation Number: 7218982
Course: M.Eng ESE

### Package: Homework3
This Java code resides under the package named "Homework3".

### imports  
import java.util.ArrayList;

import java.util.List;

### class: Engine
class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}


This class represents an engine with a specific type. The type is defined as a private String member variable and can be accessed using the getType() method.

### Subclasses of Engine:
### 1. CombustionEngine:
This class extends the Engine class and represents a combustion engine type.

### 2. ElectricEngine:
Represents an electric engine type.

### 3. HybridEngine:
Represents a hybrid engine type.

### class:Manufacture
class Manufacture {
    private String name;
    private String location;
    // ... getters and setters ...
}

This class represents a vehicle manufacturer. It has private member variables for the manufacturer's name and location. It provides getter and setter methods for each member.

### Abstract Class: Vehicle
abstract class Vehicle {

    // ... member variables ...
    public Vehicle(...) {
    
        // ... constructor code ...
    }
    public abstract void ShowCharacteristics();
    // ... getters ...
}


This is an abstract class that represents a generic vehicle. It has attributes like manufacture details, engine type, year of manufacture, color, price, and registration number. This class provides an abstract method ShowCharacteristics() that needs to be implemented by its subclasses.

### Subclasses of Vehicle:
### 1. ICEV (Internal Combustion Engine Vehicle):
Represents vehicles with combustion engines. Implements the ShowCharacteristics() method to display details about this specific type of vehicle.

### 2. BEV (Battery Electric Vehicle):
Represents vehicles with electric engines. Implements the ShowCharacteristics() method to display details about this specific type of vehicle.

### 3. HybridV:
Represents vehicles with hybrid engines. Implements the ShowCharacteristics() method to display details about this specific type of vehicle.

public static void main(String[] args) {

    // ... code to instantiate manufacturers ...
    // ... code to instantiate vehicles ...
    // ... code to add vehicles to a list ...
    // ... code to display each vehicle's characteristics ...
}

The main method is responsible for:

1. Creating instances of manufacturers (Toyota and Tesla in this case).
2. Creating instances of vehicles (ICEV, BEV, and HybridV) and associating them with their respective manufacturers.
3. Storing the vehicles in a List named vehicles.
4. Iterating over the vehicles list and invoking the ShowCharacteristics() method for each vehicle to display its characteristics.

### Summary:
The code provides a system for modeling vehicles and their associated manufacturers and engines. Vehicles are categorized by their engine type (Internal Combustion Engine Vehicle, Battery Electric Vehicle, or Hybrid Vehicle). Each vehicle type has its method to display its characteristics. The main method showcases the functionality by creating manufacturers, vehicles, and displaying vehicle details.


If the code shows problem in running, follow the following step:
1. Go to Project.
2. Click on clean.
3. Then right click on the Homework3 on the left hand side.
   










