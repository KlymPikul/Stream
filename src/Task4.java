import java.util.Arrays;

public class Task4 {
    public static String findLongestWord(String[] words) {
        return Arrays.stream(words)
                .reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2)
                .orElse("");
    }
}


