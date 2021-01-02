package string;

import java.util.Locale;

public class SameVowels {

    public static void main(String[] args) {
        String str = "abcdefgh";
        System.out.println(halvesAreAlike(str));
    }

    public static boolean halvesAreAlike(String s) {


        /*
        int length = s.length();
        s = s.toLowerCase();
        String s1 = s.substring(0, length / 2);
        String s2 = s.substring(length / 2, length);

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int counter = 0;


        for (char c : c1) {
            if (c == 'a' | c == 'e' | c == 'i' | c == 'o' | c == 'u') {
                counter++;
            }
        }

        for (char c : c2) {
            if (c == 'a' | c == 'e' | c == 'i' | c == 'o' | c == 'u') {
                counter--;
            }
        }
        */
        int length = s.length();
        s = s.toLowerCase();
        char[] c = s.toCharArray();
        int count=0;

        for (int i = 0; i < c.length/2; i++) {
            if (c[i] == 'a' | c[i] == 'e' | c[i] == 'i' | c[i] == 'o' | c[i] == 'u') {
                count++;
            }
            if(c[length-1-i] == 'a' | c[length-1-i] == 'e' | c[length-1-i] == 'i' | c[length-1-i] == 'o' | c[length-1-i] == 'u'){
                count--;
            }

        }

        return count == 0;
    }
}