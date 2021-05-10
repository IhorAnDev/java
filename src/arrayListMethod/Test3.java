package arrayListMethod;

import java.util.HashMap;
import java.util.Map;

public class Test3 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(777, "Antonov Igor");
        map.put(778, "Anton Ivanov");
        map.put(779, "Peron Artem");
        map.remove(779);
        System.out.println("map = " + map);
    }
}
