package metla.homework6;

public class Cat extends Animals {
    public Cat(int run,int swim){
        this.run = run;
        this.swim = swim;
    }

    public void checkRun(int check){
        if (check > run) System.out.println("�� �������");
        else System.out.println("���� ������,������");
    }
    public void checkSwim(int check){
        if (check > swim) System.out.println("���� �� ����� ����");
    }
}
