package Zadanie_11;

public class User {

    private String login;
    private String password;
    private int age;

    public User(
            String login,
            String password,
            int age
    ) {
        if(age < 0){
            throw new IllegalStateException("Wiek nie moze byc ujemny");
        }
        this.login = login;
        this.password = password;
        this.age = age;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void showUser() {
        System.out.println(
                "Login: " + login
                        + ", hasło: " + password
                        + ", wiek: " + age
        );
    }
}