package generic.test.ex3;

import generic.test.ex3.unit.Marine;

public class UnitPrinter {
    //UnitPrinter.printV1() 제네릭 메서드로 구현
    //UnitPrinter.printV2() 와일드카드로 구현
    // 이 두 메서드는 셔틀에 들어있는 유닛의 정보를 출력함

//    Shuttle<Marine> shuttle1 전달. 타입 추론에 의해 T가 Marine 됨
    public static <T extends BioUnit> void printV1(Shuttle<T> t1){
        T unit = t1.out();
        System.out.println("이름: "+unit.getName()+", HP: "+unit.getHp());
//        t1.showInfo();
    }

    public static void printV2(Shuttle<? extends BioUnit> t1){
        BioUnit unit = t1.out();
        System.out.println("이름: "+unit.getName()+", HP: "+unit.getHp());
//        t1.showInfo();
    }
}
