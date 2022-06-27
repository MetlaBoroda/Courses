package metla.case2.homework3.PhoneBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class phoneBook {
    private final Map<String, ArrayList<String>> phonebook = new HashMap<>();
    private ArrayList<String> list = new ArrayList<>();

    void add(String name, String number) {
        if (phonebook.get(name) == null) {
            list = new ArrayList<>();
            phonebook.put(name, list);
        } else {
            list = phonebook.get(name);
        }
        list.add(number);
    }

    @Override
    public String toString() {

        return "phonebook{" + " setPhoneNumber = " + list + ", [ phonebook = " + phonebook + "}";
    }

    void getInfo(String name) {
        if (phonebook != null) {
            list = phonebook.get(name);
            System.out.printf(" у абонента " + name + " номер телефона ");
            for (String list : list) {
                System.out.println(list + "");
            }
            System.out.println();
        }

    }


    public void getInfoTotal() {
        phonebook.forEach((k, v) -> getInfo(k));
    }
}