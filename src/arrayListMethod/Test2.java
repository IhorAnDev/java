package arrayListMethod;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> ar1 = new ArrayList<>();
        ar1.add("one");
        ar1.add("two");
        ar1.add("three");
        ar1.add("four");
        ar1.add("five");
        for (Object ar : ar1
        ) {
            System.out.println("Number = " + ar + " and lenth" + ((String) ar).length());
        }
    }
}
