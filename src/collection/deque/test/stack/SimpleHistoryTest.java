package collection.deque.test.stack;

import java.util.Stack;

public class SimpleHistoryTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
//        ArrayDeque<String> stack = new ArrayDeque<>();
        stack.push("youtube.com");
        stack.push("google.com");
        stack.push("facebook.com");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
