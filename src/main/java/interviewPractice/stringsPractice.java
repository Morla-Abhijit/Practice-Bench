package interviewPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class stringsPractice {
    public static int firstNonRepeatingChar(String str) {
        List<Character> characters = str.chars()
                                        .mapToObj(c -> (char) c)
                                        .collect(Collectors.toList());
        return 0;
    }
}
