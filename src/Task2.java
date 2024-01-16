import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;

public class Task2 {
    public static List<String> filterByLength(String[] strings) {
        return Arrays.stream(strings)
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());
    }

}


