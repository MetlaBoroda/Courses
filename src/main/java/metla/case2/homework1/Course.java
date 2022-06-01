package metla.case2.homework1;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private List<Let> c = new ArrayList<>();

    public Course(Treadmill a, Wall b, Treadmill c, Wall d, Treadmill e, Wall f) {
        this.c.add(a);
        this.c.add(b);
        this.c.add(c);
        this.c.add(d);
        this.c.add(e);
        this.c.add(f);
    }

    public List<Let> getC() {
        return c;
    }

    public void dolt(Team t) {
        for (Let n : c) {
            for (Participant p: t.getT()) {
                n.isWin(p);
            }
        }

    }
}
