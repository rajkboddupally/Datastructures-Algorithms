package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {
    PalindromeNumber p;
    @BeforeEach
    void setUp() {
        p=new PalindromeNumber();
    }

    @Test
    void isPalindrome() {
        int input = 121;
        Assertions.assertTrue(p.isPalindrome(input));
    }

    @Test
    void isPalindrome1() {
        int input = -121;
        Assertions.assertFalse(p.isPalindrome(input));
    }
}