package collection.link;

public class MyLinkedListV2 {
    private Node first;
    private int size = 0;

    public void add(Object e) {
        Node newNode = new Node(e);
        if (first == null) {
            first = newNode;
        } else {
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node getLastNode() {
        Node x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    /*
     * 첫번째 위치에 데이터 추가
     * 1. 신규 노드 생성 2. 신규노드와 first 노드 연결  3. first에 신규 노드 대입
     * 중간위치 데이터 추가
     * 1.신규 노드 생성 2.노드가 입력될 직전노드 찾기 3.신규노드와 다음 노드 연결 4.이전노드와 신규 노드 연결
     */
    public void add(int index, Object o) {
        Node newNode = new Node(o);
        if (index == 0) {
            newNode.next = first;
            first = newNode;
        } else {
            Node prev = getNode(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    public Object set(int index, Object element) {
        Node x = getNode(index);
        Object oldValue = x.item;
        x.item = element;
        return oldValue;
    }

    private Node getNode(int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    /*
     * 첫번째 위치의 데이터 삭제
     * 1.삭제 대상 선택 2.first에 삭제대상 다음 값 대입 3.삭제대상 데이터 초기화
     * 중간 위치의 데이터 삭제
     * 1.삭제 대상 선택 2.삭제대상 이전 노드 검색 3.이전노드와 삭제대상의 다음 노드 연결 4. 삭제대상 데이터 초기화
     * */
    public Object remove(int index) {
        Node removeNode = getNode(index);
        Object removedItem = removeNode.item;
        if (index == 0) {
            first = removeNode.next;
        } else {
            Node prev = getNode(index - 1);
            prev.next = removeNode.next;
        }
        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removedItem;
    }

    public Object get(int index) {
        Node node = getNode(index);
        return node.item;
    }

    public int indexOf(Object o) {
        int index = 0;
        for (Node x = first; x != null; x = x.next) {
            if (o.equals(x.item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV2{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }

}
