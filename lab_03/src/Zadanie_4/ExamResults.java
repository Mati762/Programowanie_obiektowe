package Zadanie_4;

import java.util.Arrays;

public class ExamResults {
    private int[] points;

    public ExamResults(int[] points){
        this.points = Arrays.copyOf(points, points.length);
    }

    public int[] getPoints(){
        return Arrays.copyOf(points, points.length);
    }
}