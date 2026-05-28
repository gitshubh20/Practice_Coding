package string;

public class Removewhitepsce {

    public static void main(String[] args) {

        String str = "asf adj asjdad";

        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (!Character.isWhitespace(c)) sb.append(c);
        }

        System.out.println(sb.toString());
    }

    public static boolean isPalindromeorNot(String str) {
        int left = 0;
        int right = str.length() - 1;
        char[] chars = str.toCharArray();
        while (left <= right) {

//            if (chars[left] == chars[right] {
//                return true;
//            }


        }


        return false;
    }
}
