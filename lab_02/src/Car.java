public class Car {
    String brand;
    String model;
    int productionYear;
    double mileage;

    public Car(String brand, String model, int productionYear,double mileage ){
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.mileage = mileage;
    }

    public Car(String brand){
        this(brand, "Nieznany", 2026, 10000);
    }

    public Car(String model, int productionYear){
        this("Nieznany", model, productionYear, 10000);
    }

    public Car(){
        this("Nieznany", "Nieznany", 2026, 10000);
    }

    public Car(Car other){
        this(other.brand, other.model, other.productionYear, other.mileage);
    }


    public double drive(double distance){
        if(distance >= 0){
            mileage += distance;
        }
        return distance;
    }

    public void showInformation(){
        System.out.printf("Marka: %s\n Model: %s\n Rok produkcji: %d\n Przebieg: %.2f",
                brand, model, productionYear, mileage);
    }

    public static void main(String[] args){

        Car oryginalne = new Car("BMW", "E39", 2000, 350000);
        Car kopia = new Car(oryginalne);

        kopia.productionYear = 2005;
        oryginalne.showInformation();

        // Zadanie 9 - NULL
        Car car = null;
        if (car != null) {
            car.showInformation();
        }

    }

}
/*
Rok produkcji nie zmienił się dla oryginalnego obiektu, ponieważ tworząc kopie
dałem 'new', które zerezerwowało odzielne miejsce w pamięci. Konstruktor skopiował
pola obiektu podanego w argumencie a następnie zapisał je jako odzielny obiekt,
nie połączony z oryginałem.
*/