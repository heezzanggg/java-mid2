package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {
    public static void main(String[] args) {
        //2차원 배열 -> Map<String,Integer> 변경
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};
        HashMap<String, Integer> productMap = new HashMap<>();
        for (String[] product : productArr) {
            productMap.put(product[0], Integer.valueOf(product[1]));
        }
        //Map 출력
        for (Map.Entry<String, Integer> entry : productMap.entrySet()) {
            System.out.println("제품: " + entry.getKey() + ", 가격: " + entry.getValue());
        }
    }
}
