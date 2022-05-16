package metla.homework6;

public class hm6 {
    public static void main(String[] args) {
        Cat murzik = new Cat(200,0);
        Dog bobby = new Dog(500,10);

        murzik.checkRun(199);
        murzik.checkRun(201);

        murzik.checkSwim(0);
        murzik.checkSwim(1);

        bobby.checkRun(499);
        bobby.checkRun(501);

        bobby.checkSwim(9);
        bobby.checkSwim(11);
    }
}
