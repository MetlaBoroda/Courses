package metla.block_1.hm6.hm7.homework6;

public class Cat extends Animals {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int length) {
        if (length <= 200)
            System.out.println(" ��� " + getName() + " ����� " + length);
        else {
            System.out.println(" ��� " + getName() + " �� ���� ��������� " + length + " ������ ");
        }
    }

    @Override
    public void swim(int length) {
        System.out.println("���� �� �������");
    }
}
