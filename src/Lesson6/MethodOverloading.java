package Lesson6;

public class MethodOverloading {
    void show(int i1) {
        System.out.println(i1);
        System.out.println("Data type is int");
    }

    void show(int a,int b){

    }

    void show( boolean b1){
        System.out.println(b1);
        System.out.println("Data type is bool");

    }

    void  show(String s1){
        System.out.println(s1);
        System.out.println("Data type is String ");
    }

}

class MethodOverloadingTest {
    public static void main(String[] args) {

        MethodOverloading m1 = new MethodOverloading();
        int a = 500;
        m1.show(a);
        boolean b = true;
        m1.show(b);
        String str = "Heyy";
        m1.show(str);


    }
}
