package collection.set.member;

public class JavaHshCodeMain {

    public static void main(String[] args) {
        //Object의 기본 hashCode는 객체의 참조값을 기반으로 생성 => obj1, obj2 서로 다른 해시코드 반환
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("obj1.hashCode() = " + obj1.hashCode());
        System.out.println("obj2.hashCode() = " + obj2.hashCode());

        //각 클래스 마다 hashCode
        Integer i = 10;
        String strA = "A";
        String strAB = "AB";
        System.out.println("i.hasoCode() = " + i.hashCode());
        System.out.println("strA.hashCode() = " + strA.hashCode());
        System.out.println("strAB.hashCode() = " + strAB.hashCode());

        System.out.println("-1.hashCode = " + Integer.valueOf(-1).hashCode());

        //인스턴스는 다르지만, equals는 같다.
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");

        //equals, hashCode를 오버라이딩 하지 않은 경우와, 한 경우 비교
        System.out.println("(member1 == member2) = " + (member1 == member2));
        System.out.println("member1 equals member2 = " + member1.equals(member2));
        System.out.println("member1.hashCode() = " + member1.hashCode());
        System.out.println("member2.hashCode() = s" + member2.hashCode());

    }
}
