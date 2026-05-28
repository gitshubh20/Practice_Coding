package array;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ArraySum {

    public static int simpleArraySum(List<Integer> ar) {
        Integer reducedSum = ar.stream().reduce(0, (a, b) -> a + b);
        System.out.println(reducedSum);
        return reducedSum;
    }

    public static void main(String[] args) {
        System.out.println(simpleArraySum(Arrays.asList(2,3,5,6,1,6)));
    }
    }

