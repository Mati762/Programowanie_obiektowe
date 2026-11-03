package Zadanie_12;

public class AdministratorAccount extends PremiumAccount{
    private int zbanowane_konta;

    public AdministratorAccount(String imie, String nazwisko, int rokUrodzenia, String nick, int polaczone_konta, int zbanowane_konta) {
        super(imie, nazwisko, rokUrodzenia, nick, polaczone_konta);
        this.zbanowane_konta = zbanowane_konta;
    }

    public int getZbanowane_konta() {
        return zbanowane_konta;
    }

    @Override
    public void info(){
        super.info();
        System.out.println("Zbanowane_konta: " + getZbanowane_konta());
    }

    @Override
    public String toString(){
        return "Account{Imie = %s, Nazwisko = %s, Rok urodzenia = %d, Nick = %s, Polaczone konta = %d, Zbanowane konta = %d}"
                .formatted(this.getImie(), this.getNazwisko(), this.getRokUrodzenia(), this.getNick(), this.getPolaczone_konta(), this.getZbanowane_konta());
    }

}
