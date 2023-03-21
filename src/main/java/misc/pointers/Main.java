package misc.pointers;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        map1.put("value", 11);
        map2 = map1;

        map1.put("value", 22);

//        int num1 = 11;
//        int num2 = num1;

        System.out.println(map1);
        System.out.println(map2);

//        System.out.println("num1: " + num1);
//        System.out.println("num2: " + num2 );
    }
}
