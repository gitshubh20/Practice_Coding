package string;

import java.util.Arrays;
import java.util.List;

public class MatchingName {
    public static void main(String[] args) {

        List<String> nameList = Arrays.asList("Sekhar", "Suman", "Faheen", "Arman");
        boolean isPresent = nameList.stream().anyMatch(n -> n.contains("Sekhar"));

        System.out.println(isPresent ? "Present hai" : "Nahi mila");

    }
}
