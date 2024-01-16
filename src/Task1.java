import java.util.Arrays;
public class Task1 {
    public static int sumOfSquares(int[] numbers) {
        return Arrays.stream(numbers)
                .map(x -> x * x)
                .sum();
    }
}


