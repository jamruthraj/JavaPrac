public class Zoo {
    public static void main(String[] args) {
        Animal animal = new Animal(1, 1, 5, 5, "Animal");
        Dog dog = new Dog(8, 20, "Scooby", 2, 4, 1, 20, "Golden Brown");
        Fish fish = new Fish(3, 5,"Catfish", 8, 2, 3);
        dog.eat();

        fish.move(5);
    }
}
