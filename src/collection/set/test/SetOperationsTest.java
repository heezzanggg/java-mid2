package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationsTest {
    //두 집합 제공
    //두 집합의 합집합, 교집합, 차집합(집합1-집합2) 구하기

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1,2,3,4,5));
        Set<Integer> set2 = new HashSet<>(List.of(3,4,5,6,7));

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        HashSet<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        HashSet<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);

        System.out.println("합집합: " + union);
        System.out.println("교집합: " + intersection);
        System.out.println("차집합: " + difference);
    }

}
