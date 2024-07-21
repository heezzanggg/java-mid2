package collection.set.test;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class UniqueNamesTest2 {
    public static void main(String[] args) {
        Integer[] inputArr = {30,20,20,10,10};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (Integer i : inputArr) {
            set.add(i);
        }

        //배열 -> List
        List<Integer> list1 = Arrays.asList(inputArr); //자바 8 이하경우 사용
        List<Integer> list2 = List.of(inputArr); //자바 9 이상 경우 권장

        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
