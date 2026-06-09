package mypack;
class Animal {
    String name;
    int age;

    Animal(String name,int age){
        this.name = name;
        this.age = age;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal {
    Dog(String name,int age){
        super(name,age);
        super.eat();
        super.sleep();
    }
    void bark() {
        System.out.println(name + " is barking.");
    }
}

class Cat extends Animal {
    Cat(String name,int age){
        super(name,age);
        super.eat();
        super.sleep();

    }
    void meow() {
        System.out.println(name + " is meowing.");
    }
}


// public class Main {
//     public static void main(String[] args) {

//         Dog d = new Dog();
//         d.name = "Bruno";
//         d.age = 3;
//         d.eat();    // inherited from Animal
//         d.sleep();  // inherited from Animal
//         d.bark();   // Dog's own method

//         Cat c = new Cat();
//         c.name = "Mimi";
//         c.age = 2;
//         c.eat();    // inherited from Animal
//         c.meow();   // Cat's own method
//     }
// }

public class Main {
    public static void main(String[] args) {

        Dog d1 = new Dog("Dommy", 3);
        d1.bark();

        Cat c1 = new Cat("Mimi", 2);
        c1.meow();

    }
}