package metla.block_1.hm6.hm7.homework1;


public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        CheckSumSign();
        printColor();
        compareNumbers();

    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void CheckSumSign() {
        int a = 22;
        int b = 23;
        int c = (a + b);
        System.out.println("c = " + c);
        if (c > 0) {
            System.out.println("����� ������");

        } else {
            System.out.println("����� ������");
        }
    }

    public static void printColor() {
        int value = 41205;
        if (value <= 0) {
            System.out.println("�������");
        }
        if (value >= 0) {
            System.out.println("�����");
        }
        if (value > 100) {
            System.out.println("������");
        }


    }

    public static void compareNumbers() {
        int a = 2;
        int b = -234567;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println(" a < b ");
        }

    }
}
