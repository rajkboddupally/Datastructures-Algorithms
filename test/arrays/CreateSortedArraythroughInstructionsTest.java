package arrays;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

class CreateSortedArraythroughInstructionsTest {
    CreateSortedArraythroughInstructions c;

    @BeforeEach
    void setUp() {
        c = new CreateSortedArraythroughInstructions();
    }

    @Test
    void createSortedArray() {
        int[] inst = {1, 5, 6, 2};
        Assert.assertEquals(1, c.createSortedArray(inst));
    }

    @Test
    void createSortedArray1() {
        int[] inst = {1, 2, 3, 6, 5, 4};
        Assert.assertEquals(3, c.createSortedArray(inst));
    }

    @Test
    void createSortedArray2() {
        int[] inst = {1, 3, 3, 3, 2, 4, 2, 1, 2};
        Assert.assertEquals(4, c.createSortedArray(inst));
    }

    @Test
    void createSortedArray3() {
        Properties prop = new Properties();
        try (InputStream input = CreateSortedArraythroughInstructionsTest.class.getClassLoader().getResourceAsStream("foo.properties")) {


            if (input == null) {
                System.out.println("Sorry, unable to find config.properties");
                return;
            }

            //load a properties file from class path, inside static method
            prop.load(input);

            //get the property value and print it out
            //System.out.println(prop.getProperty("arr"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        int[] inst = new int[prop.getProperty("arr").split(",").length];
        String[] input = prop.getProperty("arr").split(",");

        for (int i = 0; i < inst.length; i++) {
            inst[i] = Integer.valueOf(input[i]);
        }
        //System.out.print(inst.length);
        Assert.assertEquals(49995000, c.createSortedArray(inst));
    }
}