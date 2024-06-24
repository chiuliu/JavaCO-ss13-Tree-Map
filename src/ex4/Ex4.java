package ex4;

import java.util.HashMap;
import java.util.Map;

public class Ex4 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,1);
        map.put(2,12);
        map.put(3,11);
        map.put(4,10);
        map.put(5,7);
        map.put(6,5);
        map.put(7,3);
        map.put(8,2);
        Map<Integer, Integer> map2 = new HashMap<>();
        map2.putAll(map);
        System.out.println(map2);
        System.out.println(map2.containsKey(map.get(1)));
    }
}