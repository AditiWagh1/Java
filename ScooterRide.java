public class ScooterRide {
    // Private fields for data security (Encapsulation)
    private String rideID;
    private double distanceTravelled; // in kilometers
    private double batteryUsage;      // in percentage (e.g., 15.5)
    private double rideDuration;      // in minutes

    // Constructor to initialize the ride data
    public ScooterRide(String rideID, double distanceTravelled, double batteryUsage, double rideDuration) {
        this.rideID = rideID;
        this.distanceTravelled = distanceTravelled;
        this.batteryUsage = batteryUsage;
        this.rideDuration = rideDuration;
    }

    // Method to compute efficiency (Distance per 1% of battery)
    public double computeEfficiency() {
        if (batteryUsage == 0) return 0; 
        return distanceTravelled / batteryUsage;
    }

    // Method to compute average speed (km/h)
    public double computeAverageSpeed() {
        if (rideDuration == 0) return 0;
        return (distanceTravelled / rideDuration) * 60;
    }

    // Display ride summary
    public void displayRideDetails() {
        System.out.println("--- Ride Analysis: " + rideID + " ---");
        System.out.println("Distance: " + distanceTravelled + " km");
        System.out.println("Duration: " + rideDuration + " mins");
        System.out.println("Efficiency: " + String.format("%.2f", computeEfficiency()) + " km per 1% battery");
        System.out.println("Avg Speed: " + String.format("%.2f", computeAverageSpeed()) + " km/h");
        System.out.println("-------------------------------");
    }

    // Getters and Setters (Access Specifiers control)
    public String getRideID() { return rideID; }
    public void setRideID(String rideID) { this.rideID = rideID; }
}

// Main class to run the application
class Main {
    public static void main(String[] args) {
        // Creating an instance of the analyzer
        ScooterRide morningCommute = new ScooterRide("SR-101", 5.2, 12.0, 18.5);
        
        // Displaying results
        morningCommute.displayRideDetails();
    }
}