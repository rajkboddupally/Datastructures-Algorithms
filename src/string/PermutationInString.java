package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PermutationInString {
    public boolean checkInclusion_v0(String s1, String s2) {
        int l = 0;
        Map<Character, Integer> s1Map = new HashMap<>();
        Map<Character, Integer> s2Map = new HashMap<>();

        // corner cases
        if (s1.length() > s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            s1Map.put(c, s1Map.getOrDefault(c, 0) + 1);
            char d = s2.charAt(i);
            s2Map.put(d, s2Map.getOrDefault(d, 0) + 1);
        }

        if (s1Map.equals(s2Map)) return true;

        for (int r = s1.length(); r < s2.length(); r++) {
            char d = s2.charAt(r);
            s2Map.put(d, s2Map.getOrDefault(d, 0) + 1);
            s2Map.put(s2.charAt(l), s2Map.get(s2.charAt(l)) - 1);

            if (s2Map.get(s2.charAt(l)) == 0) {
                s2Map.remove(s2.charAt(l));
            }

            if (s1Map.equals(s2Map)) return true;
            l++;
        }

        return false;
    }

    public boolean checkInclusion(String s1, String s2) {
        int[] a = new int[26];
        int l1 = s1.length();

        if(l1 > s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {
            a[s1.charAt(i) - 'a']--;
            a[s2.charAt(i) - 'a']++;
        }
        if (allZeros(a)) return true;

        for (int r = s1.length(); r < s2.length(); r++) {
            a[s2.charAt(r) - 'a']++;
            a[s2.charAt(r - l1) - 'a']--;
            if (allZeros(a)) return true;
        }
        return false;
    }

    private boolean allZeros(int[] a) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != 0) return false;
        }
        return true;
    }
}
