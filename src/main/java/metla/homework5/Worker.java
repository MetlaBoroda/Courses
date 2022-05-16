package metla.homework5;

public class Worker {
    String name;
    String post;
    String mail;
    String number;
    double salary;
    int age;

    public Worker(String name, String post, String mail, String number, double salary, int age) {
        this.name = name;
        this.post = post;
        this.mail = mail;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public void out() {
        System.out.printf("ФИО: %s\nДолжность: %s\nПочта: %s\nТелефон %s\nЗарплата %.2f\nВозраст: %d\n\n", name, post, mail, number, salary, age);

    }
}
