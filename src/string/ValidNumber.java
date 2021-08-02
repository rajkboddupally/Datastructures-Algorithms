package string;

/* Raj Kumar Boddupally created on 7/22/2021 inside the package - string */
/*
A valid number can be split up into these components (in order):

A decimal number or an integer.
(Optional) An 'e' or 'E', followed by an integer.
A decimal number can be split up into these components (in order):

(Optional) A sign character (either '+' or '-').
One of the following formats:
One or more digits, followed by a dot '.'.
One or more digits, followed by a dot '.', followed by one or more digits.
A dot '.', followed by one or more digits.
An integer can be split up into these components (in order):

(Optional) A sign character (either '+' or '-').
One or more digits.
For example, all the following are valid numbers: ["2", "0089", "-0.1", "+3.14", "4.", "-.9", "2e10", "-90E3", "3e+7", "+6e-1", "53.5e93", "-123.456e789"], while the following are not valid numbers: ["abc", "1a", "1e", "e3", "99e2.5", "--6", "-+3", "95a54e53"].

Given a string s, return true if s is a valid number.
 */
public class ValidNumber {

    public static void main(String[] args) {
        ValidNumber v = new ValidNumber();
        String[] strArr = {".1", "2", "0089", "-0.1", "+3.14", "4.", "-.9", "2e10", "-90E3", "3e+7", "+6e-1",
                "53.5e93", "-123.456e789"};
        for (String input : strArr) {
            System.out.println(input + "  valid number " + v.isNumber(input));
        }
        System.out.println("************************");
        String[] strArr1 = {"92e1740e91", "+.", "4e+", "abc", "1a", "1e", "e3", "99e2.5", "--6", "-+3", "95a54e53", ".", ".e1"};
        for (String input : strArr1) {
            System.out.println(input + "  Invalid number " + v.isNumber(input));
        }
    }

    public boolean isNumber(String s) {
        if (s.isBlank()) return false;
        boolean eChecked = false, dotChecked = false, signChecked = false, numChecked = false;
        char[] sArr = s.toCharArray();

        for (int i = 0; i < sArr.length; i++) {
            char c = sArr[i];
            if (c >= '0' && c <= '9') {
                numChecked = true;
            } else if (c == '+' || c == '-') {
                if (signChecked || (i > 0 && !(sArr[i - 1] == 'e' || sArr[i - 1] == 'E'))) return false;
                signChecked = true;
                numChecked = false;
            } else if (c == '.') {
                if (dotChecked || eChecked) return false;
                dotChecked = true;
            } else if (c == 'e' || c == 'E') {
                if (eChecked || !numChecked) return false;
                eChecked = true;
                numChecked = false;
                signChecked = false;
            } else {
                return false;
            }
        }
        return numChecked;
    }
}
