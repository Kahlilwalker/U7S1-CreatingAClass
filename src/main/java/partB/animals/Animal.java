package partB.animals;

import partB.factories.AnimalFactory;
import partA.ex02.SavingBond;
import partB.food.Food;
import partB.storage.CatHouse;

import java.util.Date;

public class Animal {
    public static String speak() {
        return "meow!";
    }

    Integer getNumberOfMealsEaten() {
        return null;
    }
    public static Cat createCat(String name, Date birthDate) {
        Integer newId = CatHouse.getNumberOfCats();
        return new Cat(name, birthDate, newId);
    }
    public Integer getId() {


        return null;
    }

    void eat(Food food) {
    }

    public static void main(String[] args) {

        System.out.println( speak());





    }
}


