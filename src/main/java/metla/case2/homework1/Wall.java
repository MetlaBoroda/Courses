package metla.case2.homework1;

public class Wall implements Let {
    private int height;

    public Wall(int height) {
        if (height>0)
        this.height = height;
    }

    @Override
    public boolean isWin(Participant p) {
        System.out.println("ןנûדאוע ");
        return p.jump(height);
    }
}
