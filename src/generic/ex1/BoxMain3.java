package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<>(); //생성 시점에 T의 타입 결정
        integerBox.set(10);
        //integerBox.set("eee"); Integer 타입만 허용, 컴파일오류
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.set("Hello");
        String s = stringBox.get();
        System.out.println("s = " + s);

        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.set(3.14);
        Double doubleValue = doubleBox.get();
        System.out.println("doubleValue = " + doubleValue);


    }
}
