package Zadanie_7;

public class Laptop extends Computer{
    private double batteryCapacityWh;

    public Laptop(String manufacturer, int ramGb, double batteryCapacityWh){
        super(manufacturer, ramGb);
        this.batteryCapacityWh = batteryCapacityWh;
    }

    public double getBatteryCapacityWh(){
        return batteryCapacityWh;
    }

    @Override
    public void showInformation(){
        super.showInformation();

        System.out.printf("Bateria: %.2f", getBatteryCapacityWh());
    }

}
