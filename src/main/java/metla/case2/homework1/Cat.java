package metla.case2.homework1;

import java.util.StringJoiner;

public class Cat implements Participant {
    private int maxRun;
    private int maxJump;
    boolean participant = true;
    private static int idCounter = 1;
    private int id = idCounter;
    String runTrue = "��� " + id + " ��������";
    String runFalse = "��� " + id + " �� ��������";
    String jumpTrue = "��� " + id + " �����������";
    String jumpFalse = "��� " + id + " �� �����������";

    public Cat(int maxRun, int maxJump) {
        if (maxRun > 0) {
            this.maxRun = maxRun;
        }
        if (maxJump > 0) {
            this.maxJump = maxJump;
        }
        idCounter++;
    }

    @Override
    public boolean run(int length) {
        if (participant()) {
            System.out.println((length <= maxRun) ? runTrue : runFalse);
            participant = (length <= maxRun);
        }

        return participant;
    }

    @Override
    public boolean jump(int height) {
        if (participant()) {
            System.out.println((height <= maxJump) ? runTrue : runFalse);
            participant = (height <= maxJump);

        }
        return participant;
    }
    @Override
    public boolean participant() {  return participant;}

    @Override
    public String toString() {
        return new StringJoiner(", ", Cat.class.getSimpleName() + "[", "]")
                .add("maxRun=" + maxRun)
                .add("maxJump=" + maxJump)
                .add("id=" + id)
                .toString();
    }


}

