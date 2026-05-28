package map;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {

    public static void main(String[] args) {

        int[] arr = {1,2,3,1,2,1,4};

        Map<Integer, Integer> map = new HashMap<>();

        for(int num : arr) {

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(map);
    }
}