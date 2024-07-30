package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
//        Map<String, Integer> map1 = Map.of("A", 1, "B", 2, "C", 3);
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        HashMap<String, Integer> map2 = new HashMap<>();
//        Map<String, Integer> map2 = Map.of("B", 4, "C", 5, "D", 6);
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);

        //map1,map2에 공통으로 들어있는 키 찾고 그 값의 합 구하기
        HashMap<String, Integer> resultMap = new HashMap<>();
        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                resultMap.put(key, map1.get(key) + map2.get(key));
            }
        }

        System.out.println(resultMap);
    }
}
