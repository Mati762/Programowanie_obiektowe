package Zadanie_12;

public class StandradAccount extends Account{
    private String nick;

    public StandradAccount(String imie, String nazwisko, int rokUrodzenia, String nick){
        super(imie, nazwisko, rokUrodzenia);
        this.nick = nick;
    }

    public String getNick(){
        return nick;
    }

    @Override
    public void info(){
        super.info();
        System.out.println("Nick: " + getNick());
    }

}
