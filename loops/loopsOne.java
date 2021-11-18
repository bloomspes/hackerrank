import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

// print 10 lines of output, each line i contains result of N x i in the form.
// N * i = result

public class LoopsOne {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(
                new InputStreamReader(System.in));
        int number = Integer.parseInt(input.readLine());

        IntStream.rangeClosed(1, 10)
                .parallel()
                .forEachOrdered(i -> System.out.printf("%d x %d = %d%n", number, i, number * i));
    }
}