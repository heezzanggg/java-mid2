package collection.set.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class UniqueNamesTest1 {
    public static void main(String[] args) {
        Integer[] inputArr = {30,20,20,10,10};
        HashSet<Integer> set = new HashSet<>();
        for (Integer integer : inputArr) {
            set.add(integer);
        }

        //배열 -> List 변환
        List<Integer> list1 = Arrays.asList(inputArr); //자바 8 이하경우 사용
        List<Integer> list2 = List.of(inputArr); //자바 9 이상 경우 권장
        //set.addAll(Arrays.asList(inputArr));
        //set.addAll(list2);

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
