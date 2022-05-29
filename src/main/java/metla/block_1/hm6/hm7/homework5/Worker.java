package metla.block_1.hm6.hm7.homework5;

public class Worker {
  private String name;
    private String post;
    private String mail;
    private String number;
    private double salary;
    private int age;

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", post='" + post + '\'' +
                ", mail='" + mail + '\'' +
                ", number='" + number + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public Worker(String name, String post, String mail, String number, double salary, int age) {
        this.name = name;
        this.post = post;
        this.mail = mail;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public void out() {
        System.out.print(toString());

    }
    public int getAge(){
        return age;
    }
}
