package metla.case2.homework2;

public class MyArrayDataException extends Exception{
    private String dataType;

    public String getDataType() {
        return dataType;
    }
    public MyArrayDataException (String message, String dataType){
        super(message);
        this.dataType = dataType;
    }
}
