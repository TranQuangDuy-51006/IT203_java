package ss9.B4;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();

        animal.sound();

        // animal.wagTail();

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.wagTail();
        }
    }
}
