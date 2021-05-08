package string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/* Raj Kumar Boddupally created on 5/6/2021 inside the package - string */

class PrefixandSuffixSearchTest {
    private static PrefixandSuffixSearch p;

    @BeforeAll
    static void setUp() {
        String[] input = {"apple", "banana", "teeth", "ae", "carrot"};
        p = new PrefixandSuffixSearch(input);
    }

    @Test
    void f() {
        int index = p.f("a", "e");
        Assertions.assertEquals(3, index);
    }
}
