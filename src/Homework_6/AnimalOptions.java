package Homework_6;

public class AnimalOptions {

    private int animalsCount;
    private int dogsCount;
    private int catsCount;

    public AnimalOptions() {
        animalsCount = 0;
        dogsCount = 0;
        catsCount = 0;
    }

    public Cat newCat(int maxRunDistance) {
        animalsCount++;
        catsCount++;
        return new Cat("Кот", "Барсик", maxRunDistance, maxRunDistance);
    }

    public Dog newDog(int maxRunDistance, int maxSwimDistance) {
        animalsCount++;
        dogsCount++;
        return new Dog("Собака", "Тузик", maxRunDistance, maxSwimDistance);
    }

    public int getAnimalsCount() {
        return animalsCount;
    }

    public int getDogsCount() {
        return dogsCount;
    }

    public int getCatsCount() {
        return catsCount;
    }
}
