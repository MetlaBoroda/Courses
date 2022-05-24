package metla.hm7;


public class Main {
    public static void main(String[] args) {//
        Cat[] array = new Cat[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Cat("cat" + (i + 1), ((int) (1 + Math.random() * 49)));
            System.out.println(array);

        }



        Plate plate = new Plate(4);
        System.out.println(plate);
        plate.addFood(4);
        System.out.println(plate);
        for (Cat Cat :array) {

            Cat.eat(plate);
            System.out.println(plate);
        }

    }

}


