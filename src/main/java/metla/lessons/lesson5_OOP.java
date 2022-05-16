package metla.lessons;


public class lesson5_OOP {
    public static void main(String[] args) {
        int a = 1;
        user u1 = new user();
        user u2 =new user();
        u1.firstName = "ivan";
        u1.age = 20;

        u2.firstName = "valera";
        u2.age = 70;

        System.out.println("u2 age= " +u2.age);

    }
}
