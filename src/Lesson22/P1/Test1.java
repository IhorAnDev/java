package Lesson22.P1;

import Lesson22.Chelovek;

public class Test1 {
    public static void main(String[] args) {
        Chelovek c = new Chelovek("male");
        //c.setName("Kolya");
        c.setVes(60);
        c.setVozrast(15);
        System.out.println(c.getName());
        System.out.println(c.getVozrast());
        System.out.println(c.getVes());
    }
}
