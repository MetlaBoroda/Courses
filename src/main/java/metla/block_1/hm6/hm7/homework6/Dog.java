package metla.block_1.hm6.hm7.homework6;

public class Dog extends Animals {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int length) {
        if (length <= 500)
            System.out.println(" �� " + getName() + " �������� " + length + " ������ ");
        else {
            System.out.println(" �� " + getName() + " �� ���� ��������� " + length + " ������ ");
        }
    }

    @Override
    public void swim(int length) {
        if (length <= 10)
            System.out.println(" �� " + getName() + " ������� " + length + " ������ ");
        else {
            System.out.println(" �� " + getName() + " �� ���� �������� " + length + " ������ ");
        }
    }
}
