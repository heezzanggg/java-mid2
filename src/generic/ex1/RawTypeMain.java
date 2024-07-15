package generic.ex1;

public class RawTypeMain {
    public static void main(String[] args) {
        // <>지정 하지 않고 사용, 로타입 or 원시타입,
        // 원시 타입 사용하면 내부의 타입 매개변수가 Object로 사용됨
        GenericBox integerBox = new GenericBox();
        integerBox.set(10);
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);
    }
}
