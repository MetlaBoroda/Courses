package metla.case2.homework1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Participant> team = new ArrayList<>();
        List<Let> lets = new ArrayList<>();

        Course course = new Course(
                new Treadmill((int) (1 + Math.random() * 2500)),
                new Wall((int) (1 + Math.random() * 19)),
                new Treadmill((int) (1 + Math.random() * 2500)),
                new Wall((int) (1 + Math.random() * 19)),
                new Treadmill((int) (1 + Math.random() * 2500)),
                new Wall((int) (1 + Math.random() * 19)));

        Team team1 = new Team(new Man((int) (1 + Math.random() * 100), (int) (1 + Math.random() * 3)),
                new Robot((int) (1 + Math.random() * 3000), (int) (1 + Math.random() * 20)),
                new Cat((int) (1 + Math.random() * 1500), (int) (1 + Math.random() * 7)),
                new Robot((int) 3000, (int) 25));

        for (int i = 0; i < 7; i++) {
            team.add(new Man((int) (1 + Math.random() * 100), (int) (1 + Math.random() * 3)));
            team.add(new Cat((int) (1 + Math.random() * 1500), (int) (1 + Math.random() * 7)));
            team.add(new Robot((int) (1 + Math.random() * 3000), (int) (1 + Math.random() * 20)));
            lets.add(new Treadmill((int) (1 + Math.random() * 5000)));
            lets.add(new Wall((int) (1 + Math.random() * 25)));
        }

        for (Participant participant : team) {
            System.out.println(participant.toString());
            for (Let let : lets) {
                System.out.println(let.toString());
                let.isWin(participant);
            }
        }
        team1.allTeam();
        course.dolt(team1);
        team1.winFromTeam();

    }
}
