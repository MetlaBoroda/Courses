package metla.homework6;

import java.util.Scanner;

public class Animals {
    int height;
    double weight;
    String color;
    public Animals(){
        Scanner sc = new Scanner(System.in);
        System.out.println("введите рост");
        height = sc.nextInt();

        System.out.println("введите вес");
        weight = sc.nextDouble();

        System.out.println("введите цвет");
        color = sc.next();
    }
    public class cat extends Animals {
        String name;
        String breed;
        private int run = 200;
        private int swim =0;

        public cat (){
            Scanner sc = new Scanner(System.in);

            System.out.println("имя кота");
            name= sc.next();

            System.out.println("порода");
            breed = sc.next();

        }

        public void checkRun(int )
        }


    }
}
