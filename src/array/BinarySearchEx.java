package array;

import java.util.Arrays;

public class BinarySearchEx {

    public static void main(String[] args) {

        BinarySearchEx binarySearchEx = new BinarySearchEx();
        int[] arrayEx = {54,56,2,7,90,2,45,12};
        Arrays.sort(arrayEx);
        int result = binarySearchEx.binarySearch(arrayEx,45);

        if(result == -1){
            System.out.println("No element found there ");
        }
        else{
            System.out.println("element found at index -> " + result);
        }

    }

    public int binarySearch(int [] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == x) return mid;

            if (arr[mid] < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

}
