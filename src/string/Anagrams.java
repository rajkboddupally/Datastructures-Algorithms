package string;

/* Raj Kumar Boddupally created on 8/13/2021 inside the package - string */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Check if 2 sentences are anagrams
public class Anagrams {
    public static void main(String[] args) {
        Anagrams anagrams = new Anagrams();
        System.out.println(anagrams.isAnagram("aprle", "bat"));
        System.out.println(anagrams.isAnagram("welcome to java", "ot vaja omcelew"));
    }

    public boolean isAnagram(String s1, String s2) {
        String[] s1Arr = s1.split(" ");
        String[] s2Arr = s2.split(" ");

        if (s1Arr.length != s2Arr.length) return false;

        Set<String> s1Set = new HashSet<>();
        Set<String> s2Set = new HashSet<>();

        for (int i = 0; i < s1Arr.length; i++) {
            char[] chars1 = s1Arr[i].toCharArray();
            Arrays.sort(chars1);
            s1Set.add(String.valueOf(chars1));

            char[] chars2 = s2Arr[i].toCharArray();
            Arrays.sort(chars2);
            s2Set.add(String.valueOf(chars2));
        }
        return s1Set.containsAll(s2Set) && s2Set.containsAll(s1Set);
    }
}
