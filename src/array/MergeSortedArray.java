package array;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeSortedArray {

    public static void main(String[] args) {

        int[] arr1 = {2, 3, 4, 5};
        int[] arr2 = {3, 7, 8, 6};

        int[] merged = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().toArray();
        System.out.println(Arrays.toString(merged));

    }
}