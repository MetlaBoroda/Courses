package metla.case2.homework3;

import java.util.ArrayList;

public class hW3 {
    static ArrayList<String> sl = new ArrayList<String>();
    static int counter = 1;
    static String tmp = "";

    public static void main(String[] args) {
        sl.add("a");
        sl.add("b");
        sl.add("o");
        sl.add("b");
        sl.add("a");
        sl.add("g");
        sl.add("l");
        sl.add("a");
        sl.add("d");
        sl.add("v");
        sl.add("a");
        sl.add("l");
        sl.add("a");
        sl.add("k");
        sl.add("a");
        sl.add("s");

        for (int i = 0; i < sl.size(); i++) {
            tmp = sl.get(i);
            for (int j = i + 1; j < sl.size(); j++) {
                if(tmp == sl.get(j)){
                    counter++;
                    sl.remove(j);
                }
            }
            if (counter == 1) {
                System.out.println(tmp);
            }
            System.out.printf("слово: %s колл-во: %d\n", tmp ,counter);
            counter = 1;
        }
    }
}
