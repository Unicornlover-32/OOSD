package Lab7;

public class AnimalDriver {
    public static void main(String[] args) {
        Vet vet = new Vet("Dr. Smith");
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        vet.Vaccinate(dog);
        vet.Vaccinate(cat);
    }
}
