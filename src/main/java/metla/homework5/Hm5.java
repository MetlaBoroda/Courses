package metla.homework5;

public class Hm5 {
    public static void main(String[] args) {
        worker[] w1;
        w1 = new worker[5];
        for (int i = 0; i < 5; i++) w1[i] = new worker();

        for (int i = 0; i < 5; i++) w1[i].out();

        for (int i = 0; i < 5; i++) if (w1[i].age > 40) w1[i].out();
    }
}
