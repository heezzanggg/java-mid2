package collection.map.test;

import java.util.HashMap;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        //각각의 단어가 나타난 수를 출력 {orange=1, banana=2, apple=3}
        String text = "orange banana apple apple banana apple";
        String[] words = text.split(" ");

        HashMap<String, Integer> resultMap = new HashMap<>();
        for (String word : words) {
            Integer count = resultMap.getOrDefault(word, 0) + 1;
            resultMap.put(word, count);
        }

        System.out.println(resultMap);

    }
}
