package metla.homework5;
import java.util.Scanner;

public class worker {
    String name;
    String post;
    String mail;
    String number;
    double salary;
    int age;

    public worker(){
        Scanner sc = new Scanner(System.in);

        System.out.println("введите ФИО");
        name= sc.next();

        System.out.println("введите должность");
        post = sc.next();

        System.out.println("введите почту");
        mail = sc.next();

        System.out.println("введите телефон");
        number = sc.next();

        System.out.println("введите зарплату");
        salary = sc.nextDouble();

        System.out.println("введите возраст");
        age = sc.nextInt();
    }

    public void out(){
        System.out.printf("ФИО: %s\nДолжность: %s\nПочта: %s\nТелефон %s\nЗарплата %.2f\nВозраст: %d\n\n", name,post,mail,number,salary,age);

    }
}
