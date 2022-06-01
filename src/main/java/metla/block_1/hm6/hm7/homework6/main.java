package metla.block_1.hm6.hm7.homework6;

import java.util.Random;

public class main {
    public static void main(String[] args) {
        Animals[] animals = {
                new Cat("барсик"),
                new Dog("бобик"),
                new Cat("бальжедор"),
                new Dog("босс")
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

