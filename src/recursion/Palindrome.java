package recursion;

public class Palindrome {

    public boolean isPalindrome(String s) {
        return isPalindrome(0, s);
    }

    private boolean isPalindrome(int index, String s) {
        if (index >= s.length() / 2) return true;
        if (s.charAt(index) != s.charAt(s.length() - index - 1)) return false;
        return isPalindrome(index + 1, s);
    }
}
