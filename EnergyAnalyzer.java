import java.io.*;
import java.util.Scanner;

// 1. Interface defining the calculation contract
interface EnergyCalculator {
    double calculateMonthlyConsumption();
}

// 2. Abstract class representing a generic Appliance
abstract class Appliance implements EnergyCalculator {
    protected String name;
    protected double wattage; // in Watts
    protected double hoursPerDay;

    public Appliance(String name, double wattage, double hoursPerDay) {
        this.name = name;
        this.wattage = wattage;
        this.hoursPerDay = hoursPerDay;
    }

    public abstract void displayInfo();
}

// Concrete class extending the abstract class
class BasicAppliance extends Appliance {
    public BasicAppliance(String name, double wattage, double hoursPerDay) {
        super(name, wattage, hoursPerDay);
    }

    @Override
    public double calculateMonthlyConsumption() {
        // Formula: (Watts * hours * 30 days) / 1000 = kWh
        return (wattage * hoursPerDay * 30) / 1000;
    }

    @Override
    public void displayInfo() {
        System.out.println("Appliance: " + name + " | Consumption: " + calculateMonthlyConsumption() + " kWh/month");
    }
}

public class EnergyAnalyzer {
    public static void main(String[] args) {
        String fileName = "energy_log.txt";
        Appliance fridge = new BasicAppliance("Refrigerator", 150, 24);
        Appliance ac = new BasicAppliance("Air Conditioner", 2000, 8);

        // 3. I/O Streams: Writing to a File
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(fridge.name + "," + fridge.calculateMonthlyConsumption() + " kWh\n");
            writer.write(ac.name + "," + ac.calculateMonthlyConsumption() + " kWh\n");
            System.out.println("Data successfully written to " + fileName + "\n");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        // 4. I/O Streams: Reading from a File and showing on screen
        System.out.println("--- Reading Data from File ---");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Stored Record: " + line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}