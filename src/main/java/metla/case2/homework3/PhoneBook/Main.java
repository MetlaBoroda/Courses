package metla.case2.homework3.PhoneBook;

public class Main {
    public static void main(String[] args) {
        System.out.println("телефонная книга. добавляем и ищем по фамилии:");
       phoneBook phonebook = new phoneBook();
        phonebook.add("сидоров", "+37533388877");
        phonebook.add("петров", "+37529458377");
        phonebook.add("васильев", "+37525422553");
        phonebook.add("валерьев", "+37529745231");
        phonebook.add("васильев", "+37529111111");
        phonebook.add("сидоров", "+375335846711");
        phonebook.add("гагарин", "+3753326941");
        phonebook.add("ильин", "+3752945167541");
        phonebook.add("семенов", "+3753314891");
        phonebook.add("семенов", "+37529746156");
        phonebook.add("кик", "+37533254568");
        phonebook.add("гриб", "+37525498138");
        phonebook.add("ковальски", "+37529761681");
        phonebook.getInfo("сидоров");
        phonebook.getInfoTotal();
    }


}
