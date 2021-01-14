package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

class BoatstoSavePeopleTest {
    BoatstoSavePeople b;

    @BeforeEach
    void setUp() {
        b = new BoatstoSavePeople();
    }

    @Test
    void numRescueBoats() {
        int[] people = {3, 2, 2, 1};
        int limit = 3;
        Assertions.assertEquals(3, b.numRescueBoats(people, limit));
    }

    @Test
    void numRescueBoats1() {
        int[] people = {1, 2};
        int limit = 3;
        Assertions.assertEquals(1, b.numRescueBoats(people, limit));
    }

    @Test
    void numRescueBoats2() {
        int[] people = {3, 5, 3, 4};
        int limit = 5;
        Assertions.assertEquals(4, b.numRescueBoats(people, limit));
    }

    @Test
    void numRescueBoats3() {
        int[] people = {5, 1, 4, 2};
        int limit = 6;
        Assertions.assertEquals(2, b.numRescueBoats(people, limit));
    }


    @Test
    void numRescueBoats4() {

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
       // int[] people = {5, 1, 4, 2};
        int limit = 6;
        Assertions.assertEquals(2, b.numRescueBoats(inst, limit));
    }

}