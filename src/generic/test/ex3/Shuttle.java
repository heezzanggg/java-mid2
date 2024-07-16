package generic.test.ex3;

public class Shuttle<T extends BioUnit> {
    //제네릭 타입 사용
    //showInfo()메서드 통해 탑승한 유닛의 정보 출력

    private T unit;

    public void in(T t) {
        this.unit = t;
    }

    public T out() {
        return unit;
    }

    public void showInfo() {
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
    }
}
