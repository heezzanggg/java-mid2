package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV2 {

    static final int DEFAULT_INITIAL_CAPACITY = 16;

    private LinkedList<Object>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV2() {
        initBuckets();
    }

    public MyHashSetV2(int initialCapacity) {
        this.capacity = initialCapacity;
        initBuckets();
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    //저장
    public boolean add(Object value){
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex];
        if(bucket.contains(value)){
            return false;
        }

        bucket.add(value);
        size++;
        return true;
    }

    //검색
    public boolean contains(Object searchValue){
        int hashIndex = hashIndex(searchValue);
        LinkedList<Object> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }

    //삭제
    public boolean remove(Object value){
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex];
        boolean result = bucket.remove(value);
        if(result){
            size--;
            return true;
        }else {
            return false;
        }
    }

    private int hashIndex(Object value) {
        //hashCode의 결과로 음수 나올수 없음. abs() 사용해서 마이너스 제거한다.
        return Math.abs(value.hashCode()) % capacity;
    }

    public int getSize(){
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV2{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
