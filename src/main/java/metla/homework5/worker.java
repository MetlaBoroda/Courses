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

        System.out.println("������� ���");
        name= sc.next();

        System.out.println("������� ���������");
        post = sc.next();

        System.out.println("������� �����");
        mail = sc.next();

        System.out.println("������� �������");
        number = sc.next();

        System.out.println("������� ��������");
        salary = sc.nextDouble();

        System.out.println("������� �������");
        age = sc.nextInt();
    }

    public void out(){
        System.out.printf("���: %s\n���������: %s\n�����: %s\n������� %s\n�������� %.2f\n�������: %d\n\n", name,post,mail,number,salary,age);

    }
}
