package metla.homework5;

public class Worker {
  private String name;
    private String post;
    private String mail;
    private String number;
    private double salary;
    private int age;

    public Worker(String name, String post, String mail, String number, double salary, int age) {
        this.name = name;
        this.post = post;
        this.mail = mail;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public void out() {
        System.out.printf("���: %s\n���������: %s\n�����: %s\n������� %s\n�������� %.2f\n�������: %d\n\n", name, post, mail, number, salary, age);

    }
    public int getAge(){
        return age;
    }
}
