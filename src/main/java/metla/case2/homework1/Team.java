package metla.case2.homework1;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Participant> t = new ArrayList<>();
    int i = 1;

    public List<Participant> getT() {
        return t;
    }

    public Team(Participant a, Participant b, Participant c, Participant d) {
        t.add(a);
        t.add(b);
        t.add(c);
        t.add(d);
    }

    public void allTeam() {
        System.out.println("информация о команде:");
        for (Participant val : t) {
            System.out.printf("участник: %d\n%s\n", i, val.toString());
            i++;
        }
        System.out.println();
        i=1;
    }

    public void winFromTeam() {
        System.out.println("информация о команде:");
        for (Participant val : t) {
            if (val.participant())
                System.out.printf("участник: %d\n%s\n", i, val.toString());
            i++;
        }
    }
}
