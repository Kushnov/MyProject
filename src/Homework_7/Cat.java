package Homework_7;

public class Cat {
    private String name;
    private int appetite;
    private boolean isFull;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        isFull = false;
    }

    public void eat(Plate plate) {
        if (plate.foodForAppetite(appetite) && !isFull) {
            infoAppetite();
            System.out.println(name + " Покушал");
            plate.decreaseFood(appetite);
            isFull = true;
            plate.info();
            System.out.println();
        }
        else if (!plate.foodForAppetite(appetite)) {
            infoAppetite();
            plate.info();
            System.out.println("Это мало для " + name);
            System.out.println();
        }
        else if (isFull) {
            System.out.println(name + " не голоден");
        }
    }
    public void infoAppetite() {
        System.out.println("У " + name + " аппетит на " + appetite + " еды");
    }
}
