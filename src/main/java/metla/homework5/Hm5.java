package metla.homework5;

public class Hm5 {
    public static void main(String[] args)
        Worker[] w1 = new Worker[5];
        w1[0] = new Worker("a", "a", "a", "a", 1000, 20);
        w1[1] = new Worker("b", "b", "b", "b", 800, 66);
        w1[2] = new Worker("c", "c", "c", "c", 1500, 34);
        w1[3] = new Worker("d", "d", "d", "d", 1200, 54);
        w1[4] = new Worker("e", "e", "e", "e", 5000, 46);
        System.out.println("Все работники:");
        for (int i = 0; i<5;i++) w1[i].out();
        System.out.println();
        System.out.println("Работники 40+:");
        for (int i = 0; i<5;i++) if (w1[i].getAge() > 40) w1[i].out();
    }
}
