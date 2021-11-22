import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));

        String a = bufferedReader.readLine();
        String b = bufferedReader.readLine();

        bufferedReader.close();

        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

    public static boolean isAnagram(String a, String b) {
        char[] first = a.toLowerCase().toCharArray();
        char[] second = b.toLowerCase().toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        String firstResult = new String(first);
        String secondResult = new String(second);

        return firstResult.equals(secondResult);
    }
}
