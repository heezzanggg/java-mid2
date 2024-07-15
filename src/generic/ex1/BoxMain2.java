package generic.ex1;

public class BoxMain2 {
    //ObjectBox 사용해서 다형성으로 하나의 클래스만 정의 -> 코드 재사용 O , 타입 안정성 X
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get(); //Object -> Integer 캐스팅
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get(); //Object -> String 캐스팅
        System.out.println("str = " + str);

        //잘못된 타입의 인수 전달
        integerBox.set("문자100");
        Integer result = (Integer) integerBox.get(); //String -> Integer 캐스팅 예외
        System.out.println("result = " + result);
    }
}
