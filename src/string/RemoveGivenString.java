package string;

import java.util.Scanner;

public class RemoveGivenString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

    }

    public static void removeGivenString(String str, String word){

        String nayaString ="";
        String msg[] = str.split(" ");
        for(String s : msg){
            if(!(s.equals(word))){
                nayaString += s;
            }
        }
        System.out.println("The new string is as : " + nayaString);

    }
}
