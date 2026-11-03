package Zadanie_9;

public class RPG extends Game{

    @Override
    public void start(){
        super.start();
        System.out.println("RPG sie odpala");
    }
    /*
    @Override
    public final void initialize(){
        super.initialize();
        System.out.println("gry RPG");
    }*/

    public static void main(String[] args){
        RPG gra = new RPG();
        gra.start();
    }
}
