package generic.ex1;

public class BoxMain1 {
    //각 타입별로 XXBox 클래스를 모두 정의 ->코드 재사용 X , 타입 안정성 O

    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10);
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        StringBox stringBox = new StringBox();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);
    }
}
