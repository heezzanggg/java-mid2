package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeStackMain {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
//        Deque<Integer> deque = new LinkedList<>();

        //stack -> push, pop
        //데이터 추가 - push : 앞에서 부터 입력
        deque.push(1); //[1]
        deque.push(2); //[2,1]
        deque.push(3); //[3,2,1]

        System.out.println("deque.peek() = " + deque.peek());

        //데이터 꺼내기 - pop : 앞에서 부터 꺼냄
        System.out.println("pop = " + deque.pop()); //3
        System.out.println("pop = " + deque.pop()); //2
        System.out.println("pop = " + deque.pop()); //1
        System.out.println(deque);
    }
}
