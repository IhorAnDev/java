package Lesson20;

import java.util.ArrayList;
import java.util.List;


public class Test1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("privet");
        Car c = new Car();
        list.add(c);
        Student st = new Student();
        list.add(st);
        list.add(new StringBuilder("ok"));

        ArrayList<String> list2 = new ArrayList();
        list2.add("poka");
        ArrayList<StringBuilder> list3 = new ArrayList<>();
        List<StringBuilder> list4 = new ArrayList<>();
        ArrayList<String> list5 = new ArrayList<>(list2);

    }
}


class Car {
}

class Student {

}