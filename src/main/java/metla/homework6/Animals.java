package metla.homework6;

public abstract class Animals {

    private String name;
    private static int count;


    public Animals(String name) {
        this.name = name;
        count++;


    }

    public static int getCount() {
        return count;

    }

    public String getName() {
        return name;
    }

    public abstract void run (int length );
    public abstract void swim (int length);
    }
