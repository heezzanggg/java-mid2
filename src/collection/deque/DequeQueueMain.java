package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeQueueMain {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
//        Deque<Integer> deque = new LinkedList<>();

        //queue : offer, poll
        //데이터 추가 -offer : 뒤에서 입력
        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        System.out.println(deque); //[1,2,3]

        //데이터 꺼내기 -poll : 앞에서부터 꺼냄
        System.out.println("poll = " + deque.poll()); //1
        System.out.println("poll = " + deque.poll()); //2
        System.out.println("poll = " + deque.poll()); //3
        System.out.println(deque);


    }
}
