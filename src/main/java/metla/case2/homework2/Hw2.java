package metla.case2.homework2;

import static java.lang.Integer.parseInt;

public class Hw2 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 0, j = 0;

        String[][] arr1 = new String[4][4];
        String[][] arr2 = new String[5][5];

        try {
            for (int k = 0; k < arr2.length; k++) {
                for (int l = 0; l < arr2.length; l++) {
                    arr1[k][l] = arr2[k][l];
                }
            }
        } catch (Exception myArraySizeException) {
            System.out.println("массив номер 2 не соответствует размеру массива 1 " + myArraySizeException.toString());
        } finally {


            arr1[0][0] = "54";
            arr1[0][1] = "1";
            arr1[0][2] = "1";
            arr1[0][3] = "1";
            arr1[1][0] = "1";
            arr1[1][1] = "ee";
            arr1[1][2] = "1";
            arr1[1][3] = "1";

            try {
                for (i = 0; i < arr1.length; i++) {
                    for (j = 0; j < arr1.length; j++) {
                        sum += parseInt(arr1[i][j]);
                    }
                }
            } catch (Exception myArrayDataException) {
                System.out.printf("элемент [%d][%d] не соответствует типу данных integer\n%s ", i, j, myArrayDataException.toString());
            }
        }
    }
}