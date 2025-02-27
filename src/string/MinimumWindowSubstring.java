package string;

import java.util.*;

public class MinimumWindowSubstring {
    public String minWindow_v0(String s, String t) {
        Queue<String> w = new PriorityQueue<>(Comparator.comparingInt(String::length));
        String result = s;
        int l1 = s.length(), l2 = t.length();
        int l = 0;
        int[] a = new int[100], b = new int[100];

        if (l2 > l1) return "";

        for (int i = 0; i < l2; i++) {
            a[s.charAt(i) - 'A']++;
            b[t.charAt(i) - 'A']++;
        }

        if (contain(a, b)) {
            return s.substring(0, l2 + 1);
        }

        for (int r = l2; r < l1; r++) {
            a[s.charAt(r) - 'A']++;
            while (contain(a, b)) {
                //w.offer(s.substring(l, r + 1));
                String res = s.substring(l, r + 1);
                if (res.length() < result.length()) {
                    result = res;
                }
                a[s.charAt(l) - 'A']--;
                l++;
            }
        }
        return w.isEmpty() ? "" : w.poll();
    }

    private boolean contain(int[] a, int[] b) {
        for (int i = 0; i < 100; i++) {
            if (b[i] != 0 && a[i] < b[i]) return false;
        }
        return true;
    }

    public String minWindow(String s, String t) {
        int l1 = s.length(), l2 = t.length();
        int l = 0;
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        String result = s;

        if (l2 > l1) return "";

        for (int i = 0; i < l2; i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
        }

        if (sContainsT(sMap, tMap)) {
            return s.substring(0, l2);
        }

        for (int r = l2; r < l1; r++) {
            sMap.put(s.charAt(r), sMap.getOrDefault(s.charAt(r), 0) + 1);
            while (sContainsT(sMap, tMap)) {
                if (s.substring(l, r + 1).length() < result.length()) {
                    result = s.substring(l, r + 1);
                }
                sMap.put(s.charAt(l), sMap.get(s.charAt(l)) - 1);
                l++;
            }
        }
        return s.equals(result) ? "" : result;
    }

    private boolean sContainsT(Map<Character, Integer> sMap, Map<Character, Integer> tMap) {
        for (char key : tMap.keySet()) {
            if (sMap.get(key) == null || sMap.get(key) < tMap.get(key)) return false;
        }
        return true;
    }

}
