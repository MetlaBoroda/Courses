package metla.homework6;

import java.util.Scanner;

public class Animals {
    int height;
    double weight;
    String color;
    public Animals(){
        Scanner sc = new Scanner(System.in);
        System.out.println("������� ����");
        height = sc.nextInt();

        System.out.println("������� ���");
        weight = sc.nextDouble();

        System.out.println("������� ����");
        color = sc.next();
    }
    public class cat extends Animals {
        String name;
        String breed;
        private int run = 200;
        private int swim =0;

        public cat (){
            Scanner sc = new Scanner(System.in);

            System.out.println("��� ����");
            name= sc.next();

            System.out.println("������");
            breed = sc.next();

        }

        public void checkRun(int )
        }


    }
}
