public class Counter {
    int value;

    public Counter(int value){
        this.value = value;
    }

    public void increaseOther(Counter other){
        other.value += 1;
        System.out.printf("%d\n", other.value);
    }

    public static void main(String[] args){
        Counter counter = new Counter(10);
        Counter counter1 = new Counter(15);

        counter.increaseOther(counter1);
        counter1.increaseOther(counter);

    }
}

/*
Metoda otrzymuje referencję, a nie kopię całego obiektu.
Dzięki temu operuje bezpośrednio na oryginalnym obiekcie, trwale
zmieniając jego stan.
 */