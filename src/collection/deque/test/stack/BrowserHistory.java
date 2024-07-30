package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    private Deque<String> browserHistory = new ArrayDeque<>();
    private String currentPage = "main";

    //visitPage(): 특정 페이지 방문
    //goBack(): 뒤로가기 (나중에 넣은 데이터가 먼저나옴)

    public void visitPage(String url) {
        if (!currentPage.equals("main")) {
            browserHistory.push(currentPage);
        }
        currentPage = url;
        System.out.println("방문: " + url);
    }

    public String goBack() {
//        System.out.println("goBack_currentPage"+currentPage); //facebook
//        System.out.println("browserHistory = " + browserHistory); //yotube , google
        if(!browserHistory.isEmpty()){
            currentPage = browserHistory.pop(); // google
            System.out.println("뒤로가기 : " + currentPage);
            return currentPage;
        }
        return "main";
    }
}
