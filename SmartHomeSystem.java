// Parent Class (Superclass)
class SmartAppliance {
    protected String brand;
    protected boolean isOn;

    public SmartAppliance(String brand) {
        this.brand = brand;
        this.isOn = false; // Default state is off
    }

    public void turnOn() {
        isOn = true;
        System.out.println(brand + " appliance is now ON.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(brand + " appliance is now OFF.");
    }
}

// Subclass for Lights
class SmartLight extends SmartAppliance {
    private int brightness; // Unique to lights

    public SmartLight(String brand) {
        super(brand); // Calls the Parent constructor
        this.brightness = 50; 
    }

    public void setBrightness(int level) {
        this.brightness = level;
        System.out.println(brand + " light brightness set to " + brightness + "%.");
    }
}

// Subclass for Thermostats
class SmartThermostat extends SmartAppliance {
    private double temperature;

    public SmartThermostat(String brand) {
        super(brand);
        this.temperature = 22.0; // Default temp
    }

    public void setTemperature(double temp) {
        this.temperature = temp;
        System.out.println(brand + " thermostat set to " + temperature + "°C.");
    }
}

public class SmartHomeSystem {
    public static void main(String[] args) {
        SmartLight livingRoomLight = new SmartLight("Philips");
        SmartThermostat nest = new SmartThermostat("Google");

        livingRoomLight.turnOn();
        livingRoomLight.setBrightness(80);

        nest.turnOn();
        nest.setTemperature(24.5);
    }
}