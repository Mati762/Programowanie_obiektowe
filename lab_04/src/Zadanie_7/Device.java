package Zadanie_7;

public class Device {
    private String manufacturer;

    public Device(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public String getManufacturer(){
        return manufacturer;
    }
    public void showInformation(){
        System.out.printf("Producent: %s\n", getManufacturer());
    }

}
