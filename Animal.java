class Animal {
    String name;
    int age;

    void eat() {
        System.out.println(name + " is eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println(name + " is meowing.");
    }
}


public class Main {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.name = "Bruno";
        d.age = 3;
        d.eat();    // inherited from Animal
        d.sleep();  // inherited from Animal
        d.bark();   // Dog's own method

        Cat c = new Cat();
        c.name = "Mimi";
        c.age = 2;
        c.eat();    // inherited from Animal
        c.meow();   // Cat's own method
    }
}
