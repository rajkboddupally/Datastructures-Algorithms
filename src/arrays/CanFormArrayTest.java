package arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class CanFormArrayTest {

    CanFormArray canFormArray;
    @Before
    public void setUp() throws Exception {

        canFormArray = new CanFormArray();
    }

    @Test
    public void testAdd() {
        int[] arr = {91,78,4,64,3};
        int[][] pieces = {{78},{3},{4,64},{91}};
        Assert.assertEquals(true, canFormArray.canFormArray(arr,pieces));
    }

    @Test
    public void testAdd1() {
        int[] arr = {85};
        int[][] pieces = {{85}};
        Assert.assertEquals(true, canFormArray.canFormArray(arr,pieces));
    }

    @Test
    public void testAdd2() {
        int[] arr = {49,18,16};
        int[][] pieces = {{16,18,49}};
        Assert.assertEquals(false, canFormArray.canFormArray(arr,pieces));
    }

    @Test
    public void testAdd3() {
        int[] arr = {15,88};
        int[][] pieces = {{88},{15}};
        Assert.assertEquals(true, canFormArray.canFormArray(arr,pieces));
    }

    @Test
    public void testAdd4() {
        int[] arr = {1,3,5,7};
        int[][] pieces = {{2,4,6,8}};
        Assert.assertEquals(false, canFormArray.canFormArray(arr,pieces));
    }

    @Test
    public void testAdd5() {
        int[] arr = {1,2,3};
        int[][] pieces = {{1}, {3,2}};
        Assert.assertEquals(false, canFormArray.canFormArray(arr,pieces));
    }

    @Test
    public void testAdd6() {
        int[] arr = {37,69,3,74,46};
        int[][] pieces = {{37,69,3,74,46}};
        Assert.assertEquals(true, canFormArray.canFormArray(arr,pieces));
    }

    @Test
    public void testAdd7() {
        int[] arr = {12,21,11,22};
        int[][] pieces = {{12,21},{1,2}};
        Assert.assertEquals(false, canFormArray.canFormArray(arr,pieces));
    }


}
