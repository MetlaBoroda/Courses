package metla;

public class Homewor2 {
    public static void main(String[] args) {
        boolean tmp;
        tmp = checkSum(1,2);
        System.out.println(tmp);
        tmp = checkSum(3,12);
        System.out.println(tmp);
    }

    public static boolean checkSum(int a, int b) {
        if ((a + b >= 10) && (a + b <= 20)) return true;
        return false;
    }
}


