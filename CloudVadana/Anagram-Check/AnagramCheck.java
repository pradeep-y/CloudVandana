import java.util.Scanner;
import java.util.Arrays;

public class AnagramCheckSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine().toLowerCase().replace(" ", "");

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine().toLowerCase().replace(" ", "");

        // Check anagram
        boolean isAnagram = checkAnagram(str1, str2);


        System.out.println("Are the strings anagrams? " + isAnagram);
    }

    static boolean checkAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1, a2);
    }
}
