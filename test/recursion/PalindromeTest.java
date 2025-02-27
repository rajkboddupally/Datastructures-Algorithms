package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    Palindrome p = new Palindrome();

    @Test
    void isPalindrome() {
        assertTrue(p.isPalindrome("madam"));
    }

    @Test
    void isPalindrome1() {
        assertFalse(p.isPalindrome("madame"));
    }
}