package generic.test.ex3;

public class UnitUtil {

    public static <T extends BioUnit> T maxHp(T t1, T t2) {
        //두 유닛 입력 받아서 체력이 높은 유닛 반환
        //체력이 같은 경우 둘 중 아무나 반환
        //제네릭 메서드 이용
        //입력하는 유닛의 타입과 반환하는 유닛의 타입 같아야함
        if(t1.getHp() > t2.getHp()) {
            return  t1;
        }else {
            return t2;
        }
    }

}
