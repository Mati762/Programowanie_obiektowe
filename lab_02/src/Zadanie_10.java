class Box {
    int value;

    public Box(int value) {
        this.value = value;
    }
}

public class Zadanie_10 {
    public static void main(String[] args) {
        Box a = new Box(10);
        Box b = a;
        Box c = new Box(a.value);

        b.value = 20;
        c.value = 30;

        System.out.println(a.value);
        System.out.println(b.value);
        System.out.println(c.value);

        System.out.println(a == b);
        System.out.println(a == c);
    }
}
/*
a oraz b -> [ Obiekt Box | value: 20 ] (dwie referencje wskazujące na ten sam obiekt w pamięci)

c -> [ Obiekt Box | value: 30 ] (niezależna referencja wskazująca na odrębny obiekt w pamięci)
 */