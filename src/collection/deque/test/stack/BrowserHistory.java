package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    //특정 페이지 방문 : visitPage();
    //뒤로가기 : goBack();
    private Deque<String> history = new ArrayDeque<>();
    private String currentPage = null;

    public void visitPage(String url) {
        System.out.println("currentPage = " + currentPage);
        if(currentPage != null) {
            history.push(currentPage);
        }
        currentPage = url;
        System.out.println("방문: " + history.peek());
    }

    public String goBack(){
        if(!history.isEmpty()) {
            currentPage = history.pop();
            System.out.println("뒤로가기: "+currentPage);
            return currentPage;
        }
        return null;
    }
}
