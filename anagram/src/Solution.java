import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        printAnagram("test", "test");
    }

    public static void printAnagram(String first, String second) {
        char[] firstWords = first.toLowerCase().toCharArray();
        char[] secondWords = second.toLowerCase().toCharArray();

        Arrays.sort(firstWords);
        Arrays.sort(secondWords);

        String firstResult = new String(firstWords);
        String secondResult = new String(secondWords);

        if (firstResult.equals(secondResult)) {
            System.out.println("Anagrams");
        }
        else {
            System.out.println("Not Anagrams");
        }
    }
}
