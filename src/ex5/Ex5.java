package ex5;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Ex5 {
    public static void main(String[] args) {
        int[] mang = {2,5,49,45,554,5,8,1,2,6,8,6,84,3,5};
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        TreeMap<Integer,Integer> map1 = new TreeMap<>();
        for (int i : mang) {
            map1.put(i,0);
        }
        System.out.println(map1);
        System.out.println("Phan tu nho nhat: "+ map1.firstKey());
        System.out.println("Phan tu lon nhat: "+ map1.lastKey());
        // xóa phần tử max
        map1.remove(map1.lastKey());

        TreeMap<Integer,Integer> map2 = new TreeMap<>(Comparator.reverseOrder());
        map2.putAll(map1);
        System.out.println(map2);
    }
}
