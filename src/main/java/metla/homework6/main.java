package metla.homework6;

import java.util.Random;

public class main {
    public static void main(String[] args) {

        Animals[] animals = {
                new Cat("������"),
                new Dog("�����"),
                new Cat("���������"),
                new Dog("����")
        };

        {
            System.out.println(Animals.getCount());
            Random random = new Random();
            for (Animals animal : animals) {
                animal.run(random.nextInt(animals.length));
                animal.swim(random.nextInt(animals.length));
            }
        }
    }
}

