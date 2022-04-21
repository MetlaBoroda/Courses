package metla.homework2;

public class Homewor2 {
    public static void main(String[] args) {
        boolean tmp;

        checkPos(-1);
        checkPos(1);
        System.out.println();

        System.out.println(checkSum2(1));
        System.out.println(checkSum2(-1));
        System.out.println();

        tmp = checkSum(1, 2);
        System.out.println(tmp);
        tmp = checkSum(3, 12);
        System.out.println(tmp);
        System.out.println();

        stringOut("youWin", 3);
        System.out.println();

        System.out.println(checkLeapYear(2020));
        System.out.println(checkLeapYear(2000));
        System.out.println(checkLeapYear(1000));
    }

    public static boolean checkSum(int a, int b) {
        if ((a + b >= 10) && (a + b <= 20)) return true;
        return false;
    }

    public static void checkPos(int a) {
        if (a >= 0) {
            System.out.println("число положительное");
        } else {
            System.out.println("число отрицательное");
        }
    }

    public static boolean checkSum2(int c) {
        if (c < 0) {return true;}
        return false;
    }

    public static void stringOut(String str, int counter){
        for (int i = 0; i < counter; i++)
            System.out.println(str);
    }

    public static boolean checkLeapYear(int year){
        if (year % 400 == 0){
            return true;
        } else if ((year % 4 == 0) && (year % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }
}

