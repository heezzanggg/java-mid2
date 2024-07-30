package collection.map.test;

import java.util.ArrayList;
import java.util.Map;

public class ItemPriceTest {
    public static void main(String[] args) {
        //Map에 들어있는 데이터 중 값이 1000원인 모든 상품 출력
        Map<String, Integer> map = Map.of("사과", 500, "바나나", 500, "망고", 1000, "딸기", 1000);

        ArrayList<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1000) {
                list.add(entry.getKey());
            }
        }
        System.out.println(list);
    }
}
