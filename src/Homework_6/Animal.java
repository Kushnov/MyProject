package Homework_6;

public class Animal {
    String name;
    String animal;
    private final float maxRun;
    private final float maxSwim;

    public Animal(String animal, String name, float maxRun, float maxSwim) {
        this.animal = animal;
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    public void run(float distance) {
        if (distance > maxRun) {
            System.out.println("" + animal + " "  + name + " " + "не может пробежать" + " " + distance + " м");
            System.out.println("" + animal + " "  + name + " " + "может пробежать максимум" + " " + maxRun + " м");
        }
        else {
            System.out.println("" + animal + " " + name + " " + "пробежал" + " " + distance + " м");
        }
    }

    public void swim(float distance) {
        if (distance > maxSwim) {
            System.out.println("" + animal + " "  + name + " " + "не может проплыть" + " " + distance + " м");
            System.out.println("" + animal + " "  + name + " " + "может проплыть максимум" + " " + maxSwim + " м");
        }
        else {
            System.out.println("" + animal + " " + name + " " + "проплыл" + " " + distance + " м");
        }
    }
}




