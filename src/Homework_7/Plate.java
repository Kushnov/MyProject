package Homework_7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int appetite) {
        if (!foodForAppetite(appetite)) {
            System.out.println("В тарелке " + food + " а кот хочет " + appetite);
        }
        else {
            food = food - appetite;
        }
    }

    public void info() {
        System.out.println("В тарелке " + food + " еды");
    }



    public boolean foodForAppetite(int appetite) {
        return appetite < food;
    }
    public void increaseFood(int countOfFood) {
        food += countOfFood;
    }
}
