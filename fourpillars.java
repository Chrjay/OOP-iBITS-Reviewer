// ============================================================
//  ENCAPSULATION — fields are private; access is controlled
//  via public methods only.
// ============================================================
class Animal {
    private String name;   // hidden from outside
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age  = age;
    }

    // getter — read-only access to name
    public String getName() { return name; }

    // getter — read-only access to age
    public int getAge() { return age; }

    // ============================================================
    //  ABSTRACTION — makeSound() defines *what* every animal does
    //  without exposing *how* each one does it. Callers just call
    //  makeSound(); they don't care about the inner logic.
    // ============================================================
    public void makeSound() {
        // default sound — subclasses can override this
        System.out.println(name + " makes a generic sound.");
    }

    public void describe() {
        System.out.println("I am " + name + ", age " + age + ".");
    }
}

// ============================================================
//  INHERITANCE — Dog and Cat reuse Animal's fields and methods
//  without rewriting them. They extend the base class.
// ============================================================
class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);   // reuse Animal's constructor
        this.breed = breed;
    }

    // ============================================================
    //  POLYMORPHISM — makeSound() is overridden here. The same
    //  method call behaves differently depending on the object type.
    // ============================================================
    @Override
    public void makeSound() {
        System.out.println(getName() + " barks: Woof!");
    }

    public String getBreed() { return breed; }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    // POLYMORPHISM — same method name, different behaviour
    @Override
    public void makeSound() {
        System.out.println(getName() + " meows: Meow!");
    }
}

// ============================================================
//  MAIN — polymorphism in action: one loop, one method call,
//  three different behaviours depending on the actual object.
// ============================================================
public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
            new Animal("Generic Animal", 1),
            new Dog("Rex", 5, "Labrador"),
            new Cat("Whiskers", 3)
        };

        for (Animal a : animals) {
            a.describe();     // inherited from Animal
            a.makeSound();    // polymorphic — each type responds differently
            System.out.println();
        }
    }
}
