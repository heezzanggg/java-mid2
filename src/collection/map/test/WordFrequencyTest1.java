package collection.map.test;

import java.awt.image.ImageProducer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        HashMap<String, Integer> result = new HashMap<>();

        String space = " ";
        String[] words = text.split(space);
        System.out.println("words = " + Arrays.toString(words));

//        for (String word : words) {
//            Integer count = result.get(word);
//            if(count == null){
//                count = 0;
//            }
//            count++;
//            result.put(word,count);
//        }

        for (String word : words) {
            result.put(word, result.getOrDefault(word, 0) + 1); // getOrDefault: 키가 없는 경우 대신 사용할 기본 값을 지정 할 수 있음
        }
        
        System.out.println("result = " + result);
    }
}
