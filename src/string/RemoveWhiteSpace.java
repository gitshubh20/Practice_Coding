package string;

public class RemoveWhiteSpace {

    public static void main(String[] args) {
        String s = "Shubham Gupta is a Java Developer   ";

        s = s.replaceAll("\\s", "");

        //2nd way
        String a = s.replace(" ", "");

        String newSt = "";
        for(int i=0; i<=s.length()-1;i++){
        char c = s.charAt(i);
        if(!Character.isWhitespace(c)){
            newSt += c;
        }
        }

        //System.out.println("The prev string is :: " + s);
        System.out.println("The replace string is :: " + s);
        System.out.println("The replace string is :: " + a);
        System.out.println("The replace string is :: " + newSt);
    }




}
