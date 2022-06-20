//import L001.HelloWorld;
//import L002.POJO;
//import L003.Cat;

import L013.SwitchExample;
import animals.Cat;
import animals.Dog;
import animals.Duck;
import animals.MoveType;

import java.net.ServerSocket;
import java.util.*;

public class Main {

    public static void main(String[] args) {
//        HelloWorld.run();
//        POJO.run();
//
//        Cat catVar = new Cat();
//        catVar.voice();
//
//
//        L004.Cat catL004 = new L004.Cat();
//        catL004.voice();

        Cat cat = new Cat("Barsik", 20);
        System.out.println(cat.jumpHeight());
        cat.voice();

        Dog dog = new Dog();
        dog.goToStick(14);
        dog.whereTheDog();
        dog.goToStick(20);
        dog.whereTheDog();
        dog.goToStick(5);
        dog.whereTheDog();
        dog.voice();
        Dog homelessDog = Dog.ofHomeless(100);
        homelessDog.voice();

        Duck duck = new Duck();
        duck.voice();

        duck.takeOff();
        duck.isTheBirdFlying();
        duck.showSpeed();

        duck.landing();
        duck.isTheBirdFlying();
        duck.showSpeed();


        List<Dog> dogs = Dog.randomArray();
        for (int i = 0; i < dogs.size(); i++) {
            System.out.println(dogs.get(i));
        }

        List<Dog> dogsHomeless = Arrays.asList( new Dog[] {
                Dog.ofHomeless(2),
                Dog.ofHomeless(3),
                Dog.ofHomeless(5)
        });
        for(Dog dogItem : dogsHomeless) {
            System.out.println(dogItem);
            dogItem.setName(String.valueOf((new Random()).nextLong()));
            System.out.println(dogItem.getName());
        }

    List<Dog> dogsLinkedList = new LinkedList<>();
        dogsLinkedList.add(Dog.ofHomeless(10));
        dogsLinkedList.add(Dog.ofHomeless(10));
        dogsLinkedList.add(Dog.ofHomeless(10));
        dogsLinkedList.add(Dog.ofHomeless(10));
        dogsLinkedList.add(Dog.ofHomeless(10));
        int indexLinkedList = 0;
        while(indexLinkedList < dogsLinkedList .size())  {
            System.out.println(dogsLinkedList.get(indexLinkedList));
            indexLinkedList++;
        }

    for(int i = 0; i < 100; i++) {
        SwitchExample.run();
    }

    System.out.println(duck.getMoveType());
    System.out.println(dog.getMoveType().getValue());
    if(dog.getMoveType() == MoveType.WALK) {
        System.out.println("Может ходить");
    }



    
    }
}
