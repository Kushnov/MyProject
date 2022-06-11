package Homework_5;

public class Employee {
    String fullName;
    String jobTitle;
    String email;
    String phoneNumber;
    float salary;
    int age;

    public Employee(String fullName, String jobTitle, String email, String phoneNumber, float salary, int age) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + jobTitle);
        System.out.println("e-mail: " + email);
        System.out.println("Тел.: " + phoneNumber);
        System.out.println("ЗП: " + salary);
        System.out.println("Возраст: " + age);
    }
}
