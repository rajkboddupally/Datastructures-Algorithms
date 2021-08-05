import arrays.CanFormArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CanFormArrayTest {

    CanFormArray canFormArray;

    @BeforeEach
    public void setUp() throws Exception {

        canFormArray = new CanFormArray();
    }

    @Test
    public void testAdd() {
        int[] arr = {91, 78, 4, 64, 3};
        int[][] pieces = {{78}, {3}, {4, 64}, {91}};
        Assertions.assertTrue(canFormArray.canFormArray(arr, pieces));
    }

    @Test
    public void testAdd1() {
        int[] arr = {85};
        int[][] pieces = {{85}};
        Assertions.assertTrue(canFormArray.canFormArray(arr, pieces));
    }

    @Test
    public void testAdd2() {
        int[] arr = {49, 18, 16};
        int[][] pieces = {{16, 18, 49}};
        Assertions.assertFalse(canFormArray.canFormArray(arr, pieces));
    }

    @Test
    public void testAdd3() {
        int[] arr = {15, 88};
        int[][] pieces = {{88}, {15}};
        Assertions.assertTrue(canFormArray.canFormArray(arr, pieces));
    }

    @Test
    public void testAdd4() {
        int[] arr = {1, 3, 5, 7};
        int[][] pieces = {{2, 4, 6, 8}};
        Assertions.assertFalse(canFormArray.canFormArray(arr, pieces));
    }

    @Test
    public void testAdd5() {
        int[] arr = {1, 2, 3};
        int[][] pieces = {{1}, {3, 2}};
        Assertions.assertFalse(canFormArray.canFormArray(arr, pieces));
    }

    @Test
    public void testAdd6() {
        int[] arr = {37, 69, 3, 74, 46};
        int[][] pieces = {{37, 69, 3, 74, 46}};
        Assertions.assertTrue(canFormArray.canFormArray(arr, pieces));
    }

    @Test
    public void testAdd7() {
        int[] arr = {12, 21, 11, 22};
        int[][] pieces = {{12, 21}, {1, 2}};
        Assertions.assertFalse(canFormArray.canFormArray(arr, pieces));
    }


}
