package collection.map.test;

import java.util.*;

public class ItemPriceTest {
    public static void main(String[] args) {
        //Map에 들어있는 데이터 중에 값이 1000원인 모든 상품 출력
        Map<String, Integer> map = Map.of("사과", 500, "바나나", 500, "망고", 1000, "딸기", 1000);
        ArrayList<String> result = new ArrayList<>();

        for (String key : map.keySet()) {
            if(map.get(key) == 1000){
                result.add(key);
            }
        }


//        System.out.println(map.entrySet());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
           if(entry.getValue().equals(1000)){
               result.add(entry.getKey());
           }
        }
        System.out.println("result = " + result);
    }
}
