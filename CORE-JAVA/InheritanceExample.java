class Animal {
    void makeSound() {
        System.out.println("Animal Sound");
    }
}
class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}
public class InheritanceExample {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeSound();  
        Dog d = new Dog();
        d.makeSound();  
    }
}
