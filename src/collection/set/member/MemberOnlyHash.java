package collection.set.member;

import java.util.Objects;

public class MemberOnlyHash {
    private  String id;

    public MemberOnlyHash(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public int hashCode() {
        //id 기준으로 해시코드 생성
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "MemberOnlyHash{" +
                "id='" + id + '\'' +
                '}';
    }
}
