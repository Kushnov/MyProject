package Homework_5;

public class HomeWorkApp {
    public static void main (String[] args) {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "89231231255", 30000, 30);
        empArray[1] = new Employee("Petrov Alexandr", "Developer", "alex@box.ru", "89251234588", 45000, 25);
        empArray[2] = new Employee("Smirnov Maxim", "QA Engineer", "smirnov@mail.com", "89202548892", 35000, 45);
        empArray[3] = new Employee("Botov Dmitry", "Developer", "ivivan@mailbox.com", "892312312", 50000, 48);
        empArray[4] = new Employee("Kotov Maxim", "QA Engineer", "ivivan@mailbox.com", "892312312", 55000, 35);

        int minAge = 40;
        for (Employee employee : empArray) {
            if (employee.age > minAge) {
                employee.info();
                System.out.println();

            }
        }
    }
}

