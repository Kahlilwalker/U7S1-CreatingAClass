package partB.animals;

import java.util.Date;

public class Dog extends Mammal {
    public Dog(String name, Date birthDate, Integer id) {
        super(name, birthDate, id);
    }

    public static String speak() {
        return "bark!";
    }
}
