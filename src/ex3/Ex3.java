package ex3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex3 {
    public static void main(String[] args) {
        // B1: Khai báo một HashMap và thêm các phần tử vào
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 5);
        hashMap.put("Banana", 2);
        hashMap.put("Cherry", 7);
        hashMap.put("Date", 1);
        hashMap.put("Elderberry", 4);

        // B2: Tạo một danh sách các cặp key-value từ HashMap
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(hashMap.entrySet());

        // B3: Sử dụng phương thức Collections.sort() để sắp xếp danh sách các phần tử theo giá trị tăng dần
        entryList.sort(Map.Entry.comparingByValue());

        // B4: Duyệt qua danh sách đã sắp xếp các phần tử và in giá trị của chúng
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}