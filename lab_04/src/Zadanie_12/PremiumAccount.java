package Zadanie_12;

public class PremiumAccount extends StandradAccount{
    private int polaczone_konta;

    public PremiumAccount(String imie, String nazwisko, int rokUrodzenia, String nick, int polaczone_konta) {
        super(imie, nazwisko, rokUrodzenia, nick);
        this.polaczone_konta = polaczone_konta;
    }

    public int getPolaczone_konta() {
        return polaczone_konta;
    }

    @Override
    public void info(){
        super.info();
        System.out.println("Połaczone konta: " + getPolaczone_konta());
    }
}
