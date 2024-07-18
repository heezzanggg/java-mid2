package collection.list.test.ex1;

import java.util.ArrayList;

public class ListEx1 {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(90);
        scores.add(80);
        scores.add(70);
        scores.add(60);
        scores.add(50);

        int total = 0;
        for (Integer score : scores) {
            total += score;
        }
        double average = (double) total / scores.size();

        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
