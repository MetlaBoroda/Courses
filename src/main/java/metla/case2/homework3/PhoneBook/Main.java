package metla.case2.homework3.PhoneBook;

public class Main {
    public static void main(String[] args) {
        System.out.println("���������� �����. ��������� � ���� �� �������:");
       phoneBook phonebook = new phoneBook();
        phonebook.add("�������", "+37533388877");
        phonebook.add("������", "+37529458377");
        phonebook.add("��������", "+37525422553");
        phonebook.add("��������", "+37529745231");
        phonebook.add("��������", "+37529111111");
        phonebook.add("�������", "+375335846711");
        phonebook.add("�������", "+3753326941");
        phonebook.add("�����", "+3752945167541");
        phonebook.add("�������", "+3753314891");
        phonebook.add("�������", "+37529746156");
        phonebook.add("���", "+37533254568");
        phonebook.add("����", "+37525498138");
        phonebook.add("���������", "+37529761681");
        phonebook.getInfo("�������");
        phonebook.getInfoTotal();
    }


}
