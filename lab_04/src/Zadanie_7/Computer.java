package Zadanie_7;

public class Computer extends Device{
    private int ramGb;

    public Computer(String manufacturer, int ramGb){
        super(manufacturer);
        this.ramGb = ramGb;
    }

    public int getRamGb(){
        return ramGb;
    }

    @Override
    public void showInformation(){
        super.showInformation();

        System.out.printf("Ram: %d\n", getRamGb());
    }

}
