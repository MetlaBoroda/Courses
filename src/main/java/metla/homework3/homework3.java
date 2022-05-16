package metla.homework3;

public class homework3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 0, 1, 0, 1, 0, 1, 1, 1, 0};
        refactorBinaryArray(arr1);
        System.out.println();

        int[] arr2 = new int[100];
        fullingArray(arr2);
        System.out.println();

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multArr(arr3);
        System.out.println();

        int[][] arr4 = new int[5][5];
        fullingDiagonals(arr4);
        System.out.println();

        int[] arr5;
        int len = 3, initialValue = 0;
        arr5 = initArray(len, initialValue);
        for (int i = 0; i < len; i++)
            System.out.print(arr5[i] + ", ");
        System.out.println();

        int[] arr6_1 = {1, 2, 3, 2};
        System.out.println(checkBallance(arr6_1));
        int[] arr6_2 = {1, 2, 4, 7};
        System.out.println(checkBallance(arr6_2));
        System.out.println();

        int[] arr8_1 = {1, 2, 3};
        offsetArray(arr8_1, -5);
        for (int i = 0; i < arr8_1.length; i++)
            System.out.print(arr8_1[i]);
        System.out.println();

        int[] arr8_2 = {1, 2, 3};
        offsetArray(arr8_2, 3);
        for (int i = 0; i < arr8_2.length; i++)
            System.out.print(arr8_2[i]);

    }

    public static void refactorBinaryArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
            System.out.print(arr[i] + ", ");
        }
    }

    public static void fullingArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + ", ");
        }
    }

    public static void multArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;
            System.out.print(arr[i] + ", ");
        }
    }

    public static void fullingDiagonals(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) arr[i][j] = 1;
                if ((i + j) == (arr.length - 1)) arr[i][j] = 1;
                System.out.printf("%d, ", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] initArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++)
            arr[i] = initialValue;
        return arr;
    }

    public static boolean checkBallance(int[] arr) {
        int lSum = 0, rSum = 0;
        for (int i = 0; i < arr.length; i++) {
            lSum += arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                rSum += arr[j];
            }
            if (lSum == rSum) return true;
            rSum = 0;
        }
        return false;
    }

    public static void offsetArray(int[] arr, int n) {
        int tmp = 0;
        if (n > 0) {
            while (n != 0) {
                tmp = arr[arr.length - 1];
                for (int i = arr.length - 1; i >= 0; i--) {
                    if (i != 0) arr[i] = arr[i - 1];
                    else arr[i] = tmp;
                }
                n--;
            }
        } else {
            while (n != 0) {
                tmp = arr[0];
                for (int i = 0; i < arr.length; i++) {
                    if (i != arr.length - 1) arr[i] = arr[i + 1];
                    else arr[i] = tmp;
                }
                n++;
            }
        }
    }
}
