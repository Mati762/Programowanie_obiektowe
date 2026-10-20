public class Point{
    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double distance(Point otherPoint){
            double liczba = Math.sqrt(Math.pow(this.x - otherPoint.x, 2) + Math.pow(this.y - otherPoint.y, 2));
            return liczba;
    }

    public static void main(String[] args){
        Point point1 = new Point(10,4);
        Point point2 = new Point(0, 0);

        double wynik = point1.distance(point2);
        System.out.println("Odległość wynosi " + wynik);

    }


}