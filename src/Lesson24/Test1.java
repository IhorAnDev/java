package Lesson24;

public class Test1 {
    public final static void main(String[] args) {
        System.out.println("Privet");
    }
}

class A{
    String s= "Privet";
    void abc(){
        System.out.println("!!!");
    }
}

class B extends A{
    String s = "Poka";
    void abc(){
        System.out.println("???");
    }
}