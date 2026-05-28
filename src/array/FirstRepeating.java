package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.stream.Stream;

public class FirstRepeating {
    public static void main(String[] args) {

        int[] arr = {2,3,5,9,0,1,8,3,5,-2,7,3,5,1};

//        HashSet<Object> set = new HashSet<>();
//        for(int i = 0; i<arr.length; i++){
//            if(set.contains(arr[i])) return;
//            set.add(arr[i]);
//
//        }


        Integer secondHigh = Arrays.stream(arr)
                .distinct().boxed().distinct().sorted((a, b) -> b - a)
                .skip(1).findFirst().orElseThrow(() -> new RuntimeException("nahi mila"));

        System.out.println("2nd high hai :: " +secondHigh);
    }
}


