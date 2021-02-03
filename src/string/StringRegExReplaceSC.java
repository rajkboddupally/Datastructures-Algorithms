package string;

import java.util.HashSet;
import java.util.Set;

public class StringRegExReplaceSC {
    public static void main(String[] args) {
        String input = "Hello! wecome$%WE #hello)()%!@#;";

        input = input.toLowerCase();

        char[] charArr = input.toCharArray();

        StringBuilder sb = new StringBuilder();
        Set<String> distinctStrings = new HashSet<>();

        for (char c : charArr) {

            if (c >= 'a' && c <= 'z') {
                sb.append(c);
            } else {
                distinctStrings.add(sb.toString());
                sb = new StringBuilder();
            }
        }

        for (String str : distinctStrings) {
            System.out.println(str);
        }
    }
}
