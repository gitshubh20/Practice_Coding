package array;

import java.util.HashSet;

public class DuplicateNumArr {

    public static void main(String[] args) {

        int[] arr = {2,3,5,9,0,1,8,3,5,-2,7,3,5,1};

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();

        for(int n : arr){
            if(!seen.add(n)){
                duplicate.add(n);
            }
        }

        System.out.println("Duplicates are :" + duplicate);

    }


    public boolean checkDup(int[] arr){


       // Object collect = Arrays.stream(arr).distinct().collect(Collectors.toSet());
        return false;
    }
}
