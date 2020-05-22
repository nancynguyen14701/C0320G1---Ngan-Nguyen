package P5AdvancedObjectOrientedDesign.ThucHanh.AnimalEdible;

import P5AdvancedObjectOrientedDesign.ThucHanh.AnimalEdible.Animals.Animal;
import P5AdvancedObjectOrientedDesign.ThucHanh.AnimalEdible.Animals.Chicken;
import P5AdvancedObjectOrientedDesign.ThucHanh.AnimalEdible.Animals.Tiger;

import java.util.ArrayList;
import java.util.List;

public class AbstractAndInterfaceTests {
    static List<Integer> lst = new ArrayList<Integer>();
    public static void main(String[] args) {

        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println( animal.makeSound());
        }
    }
}