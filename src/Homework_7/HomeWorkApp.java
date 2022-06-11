package Homework_7;

public class HomeWorkApp {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Барсик", 8),
                new Cat("Дуся", 5),
                new Cat("Котя", 10)
        };

        Plate plate = new Plate(20);

        for (Cat cat : cats) {
            cat.eat(plate);

        }
        plate.increaseFood(10);

        for (Cat cat : cats) {
            cat.eat(plate);

        }
    }
}

