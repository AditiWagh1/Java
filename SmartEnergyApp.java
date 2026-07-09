class EnergyDevice{
String deviceID;
double powerRating;
double usageDuration;
double energyCost;

public EnergyDevice(String deviceID,double powerRating,double usageDuration)
{
this.deviceID=deviceID;
this.powerRating=powerRating;
this.usageDuration=usageDuration;
}
public double calculateUsage() {
return powerRating*usageDuration;
}
public double calculateUsage(double efficiency) { //method overloading within same class pan different parameters it is compile-time
return (powerRating*usageDuration)*efficiency;
}
public void calculateCost() {
this.energyCost=calculateUsage()*0.15;
}
public void displayInfo()
{
System.out.println("Device:"+deviceID+"|Cost:$"+energyCost);
}
}
class HAVAC extends EnergyDevice{
double energyCost;
public HAVAC (String id,double rating,double duration)
{
super(id,rating,duration);
}
public void calculateCost() {
super.calculateCost();
double baseCost=super.energyCost;
this.energyCost=baseCost+(baseCost*0.10);
super.energyCost=this.energyCost;
}
}
class RenewableSystem extends EnergyDevice{
public RenewableSystem(String id,double rating,double duration)
{
super(id,rating,duration);
}

public void calculateCost() {
this.energyCost=(calculateUsage()*0.15)*0.5;
}
}
public class SmartEnergyApp {

public static void main(String[] args) {
System.out.println("---Smart Energy Consumption Report---");
HAVAC ac=new HAVAC("AC-UNIT_01",2.5,5);
ac.calculateCost();
ac.displayInfo();
RenewableSystem solar=new RenewableSystem("SOLAR-V3",5.0,8);
double usageWithEfficiency=solar.calculateUsage(0.9);
solar.calculateCost();
System.out.println("Solar Deevice Usage (at 90% efficiency):"+usageWithEfficiency+"kWh");
solar.displayInfo();
}


}
