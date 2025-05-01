abstract class Animal {
    // Abstract method for making a sound
    public abstract void makeSound();
    
    // Concrete method
    public void sleep() {
        System.out.println("The animal is sleeping.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class AbstractMethod {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        
        dog.makeSound();
        dog.sleep();
        
        System.out.println();
        
        cat.makeSound();
        cat.sleep();
    }
}
