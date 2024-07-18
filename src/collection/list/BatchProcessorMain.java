package collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();

        BatchProcessor processorArrayList = new BatchProcessor(arrayList);
        BatchProcessor processorLinkedList = new BatchProcessor(linkedList);
        processorArrayList.logic(50_000);
        processorLinkedList.logic(50_000);
    }
}
