package collection.set.member;

public class MemberNoHashNoEq {
//hashCode(), equals() 재정의하지 않음 -> Object의 기본 기능 사용
    private String id;
    public MemberNoHashNoEq(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "MemberNoHashNoEq{" +
                "id='" + id + '\'' +
                '}';
    }
}
