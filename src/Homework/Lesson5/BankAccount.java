package Homework.Lesson5;

public class BankAccount {

    int id = 10;
    String name = "Petr";
    double balance = 100;

    void popolnenieScheta(double summaPopolnenia) {

        System.out.println("Balance do popolneniya: " + balance);
        System.out.println("Balance popolnitsya na: " + summaPopolnenia);
        balance += summaPopolnenia;
        System.out.println("Balance posle popolneniya " + balance);
        System.out.println();
    }

    void snyatieSoScheta(double summaSnyatia) {
        System.out.println("Summa do snyatia: " + balance);
        System.out.println("Balance umenshytsya na: " + summaSnyatia);
        balance -= summaSnyatia;
        System.out.println("Balance posle snyatia: " + balance);
        System.out.println();
    }

}


class BankAccountTest {

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.name = "Fillip ";
        System.out.println("Account polzovatel: " + myAccount.name + "budet popolnen");
        myAccount.popolnenieScheta(28);
        myAccount.snyatieSoScheta(30);
    }

}