package metla.homework6;

public class Dog extends Animals {

    public Dog(int run,int swim){
        this.run = run;
        this.swim = swim;
    }

    public void checkRun(int check){
        if (check > run) System.out.println("не добежал");
        else System.out.println("беги форест,бегиии");

    }
    public void checkSwim(int check){
        if (check < swim) System.out.println("ммм,водичка");
        else System.out.println("бобик сдох(навенрое чихуахуа)");
    }
}
