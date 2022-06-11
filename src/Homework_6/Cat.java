package Homework_6;

public class Cat extends Animal{

    public Cat(String animal, String name, float maxRun, float maxSwim){
            super(animal, name, maxRun, maxSwim);
        }

        @Override
        public void swim(float distance){
            System.out.println("" + animal + " " + name + " " + "не умеет плавать");
            System.out.println();
        }
    }



