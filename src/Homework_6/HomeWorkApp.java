package Homework_6;

public class HomeWorkApp {
    public static void main(String[] args) {
        AnimalOptions options = new AnimalOptions();

        Cat cat = options.newCat(200);
        Dog dog = options.newDog(500, 10);

        cat.run(200);
        cat.swim(0);

        dog.run(500);
        dog.swim(10);

        System.out.println();
        System.out.println("Животных создано всего: " + options.getAnimalsCount());
        System.out.println("Собак создано всего: " + options.getDogsCount());
        System.out.println("Кошек создано всего: " + options.getCatsCount());
    }
}
