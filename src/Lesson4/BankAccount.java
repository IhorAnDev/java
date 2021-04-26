package Lesson4;

public class BankAccount {

    int id = 10;
    String name = "Petr";
    double balance = 100;

}



class BankAccountTest {

    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name = "Igor";
        MyAccount.balance = 12.35;

        YourAccount.id = 2;
        YourAccount.name = "Ivan";
        YourAccount.balance = 2.35;

        HisAccount.id = 3;
        HisAccount.name = "Ignat";
        HisAccount.balance = 123.35;

        System.out.println(MyAccount.id);
        System.out.println(YourAccount.name);
        System.out.println(HisAccount.balance);
    }

}