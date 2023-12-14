public class Main {
    public static void main(String[] args) {
        AnimalHouse<Animal> tigerHouse = new AnimalHouse<Animal>();
        AnimalHouse<Animal> birdHouse = new AnimalHouse<Animal>();
        Tiger t = new Tiger();
        t.name = "Pesho";
        tigerHouse.animal = t;
        Bird b = new Bird();
        b.highOfFlight = 45.6;
        birdHouse.animal = b;
    }
}
