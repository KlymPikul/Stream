import java.util.Arrays;

public class Task3 {
    public static int findMax(int[] numbers) {
        return Arrays.stream(numbers)
                .reduce(Integer::max)
                .orElse(0);
    }
}


