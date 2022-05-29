package metla.case2.homework1;

public class Treadmill implements Let {
    int length;

    public Treadmill(int length) {
        if(length>0) {
            this.length = length;
        }
    }


    @Override
    public boolean isWin(Participant p) {
        System.out.println("бежит ");
        return p.run(this.length);
    }

}
