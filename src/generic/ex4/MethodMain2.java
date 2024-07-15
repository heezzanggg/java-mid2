package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("dog", 100);
        Cat cat = new Cat("cat", 100);

        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);

        Dog dog2 = new Dog("dog2", 200);
        Dog bigger = AnimalMethod.getBigger(dog, dog2);
        System.out.println("bigger = " + bigger);
    }
}
