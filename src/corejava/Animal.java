package corejava;

// Parent class
class Animal {
    public void eat() {
        System.out.println("Animals eat food");
    }
}

// Subclass 1
class Dog extends Animal {
    public void bark() {
        System.out.println("Dog barks");
    }
}

// Subclass 2
class Cat extends Animal {
    public void meow() {
        System.out.println("Cat meows");
    }
}

// Main class
class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // inherited from Animal
        d.bark();  // Dog's method

        Cat c = new Cat();
        c.eat();   // inherited from Animal
        c.meow();  // Cat's method
    }
}
