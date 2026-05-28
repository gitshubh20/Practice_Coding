package string;

import java.util.*;

public class RevSort {

    public static void sortStrings(List<String> inputList){
        Collections.sort(inputList);
        for(String s : inputList){
            System.out.println(s);
        }
        System.out.println("===================================");
        Collections.sort(inputList, Comparator.reverseOrder());
        for(String s : inputList){
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("Sujjet", "Soman", "Theerth", "Avinash","Maya","Emanaual");
        sortStrings(inputList);



    }
}
