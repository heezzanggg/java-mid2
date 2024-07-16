package generic.ex5;

import generic.animal.Animal;

public class WildcardEx {

    //제네릭 메서드
    //Box<Dog> dogBox 전달함. 타입 추론에 의해 타입 T가 Dog가 됨
    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }

    //제네릭 메서드 아님. 일반적인 메서드
    //Box<Dog> dogBox 전달함. 와일드카드 ? 는 모든 타입을 받을 수 있다.
    static void printWildCardV1(Box<?> box) {
        System.out.println("? = " + box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("이름= " + t.getName());
    }

    static void printWildcardV2(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
    }

    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    static Animal printAndReturnWildcard(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }
}
