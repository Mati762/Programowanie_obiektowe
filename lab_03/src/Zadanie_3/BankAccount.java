package Zadanie_3;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance){
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner(){
        return owner;
    }

    public double getBalance(){
        return balance;
    }

    public double deposit(double amount){
        if(amount > 0){
            balance += amount;
        }else{
            System.out.println("Wpłacana kwota nie może być mniejsza od 0.");
        }
        return balance;
    }

    public double withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
        }else{
            System.out.println("Stan konta nie posiada takich środków.");
        }
        return balance;
    }





}
