package Lesson24;

public class Test1 {}

class A{
    String s= "Privet";
    void abc(){
        System.out.println("???");
    }
}

class B extends A{
    String s = "Poka";
    void abc(){
        System.out.println("???");
    }
}
class C extends B{
    public static void main(String[] args) {
        C c= new C();
        c.abc();
        System.out.println(c.s);
    }
}