package string;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class RemoveEmpty {

    public static void main(String[] args) {

        String [] input = {"java", "", " ", null,"Streams", "", "Alice"};

        String[] finalArray = Arrays.stream(input)
                .filter(Objects::nonNull)
                .filter(s -> !s.isBlank())
                .filter(s -> !s.isEmpty())
                .toArray(String[]::new);

        System.out.println(Arrays.toString(finalArray));
    }


}
