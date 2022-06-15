package metla.case2.homework2;

public class MyArraySizeException extends Exception {
    private int size_1, size_2;

    public int getSize_1() {
        return size_1;
    }

    public int getSize_2() {
        return size_2;
    }
    public MyArraySizeException (String message, int size_1,int size_2){
        super(message);
        this.size_1 = size_1;
        this.size_2 = size_2;
    }
}
