package metla.homework6;

public class Dog extends Animals {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int length) {
        if (length <= 500)
            System.out.println(" пёс " + getName() + " пробежал " + length + " метров ");
        else {
            System.out.println(" пёс " + getName() + " не смог пробежать " + length + " метров ");
        }

    }

    @Override
    public void swim(int length) {
        if (length <= 10)
            System.out.println(" пёс " + getName() + " проплыл " + length + " метров ");
        else {
            System.out.println(" пёс " + getName() + " не смог проплыть " + length + " метров ");

        }
    }
}
