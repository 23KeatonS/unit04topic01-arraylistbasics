import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class ArrayListUtilitiesTest {
    @Test
    public void testGetListMax() {
        ArrayList<Integer> input;
        int expectedOutput;
        int actualOutput;

        // some positive numbers
        input = new ArrayList<>(Arrays.asList(1, 5, 4, 9, 2, 1));
        expectedOutput = 9;
        actualOutput = ArrayListUtilities.getListMax(input);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void testWithoutLongWords(){
        ArrayList<String> input;
        ArrayList<String> expectedOutput;
        ArrayList<String> actualOutput;

        input = new ArrayList<>(Arrays.asList("hi","hello","chicken"));
        expectedOutput = new ArrayList<>(Arrays.asList("hi","hello"));
        actualOutput = ArrayListUtilities.withoutLongWords(input);
        assertEquals(expectedOutput,actualOutput);

        input = new ArrayList<>(Arrays.asList());
        expectedOutput = new ArrayList<>(Arrays.asList());
        actualOutput = ArrayListUtilities.withoutLongWords(input);
        assertEquals(expectedOutput,actualOutput);

        input = new ArrayList<>(Arrays.asList("hi","hello"));
        expectedOutput = new ArrayList<>(Arrays.asList("hi","hello"));
        actualOutput = ArrayListUtilities.withoutLongWords(input);
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void testRemoveLongWords(){
        ArrayList<String> input;
        ArrayList<String> expectedOutput;
        ArrayList<String> actualOutput;

        input = new ArrayList<>(Arrays.asList("hi","hello","chicken"));
        ArrayListUtilities.removeLongWords(input);
        expectedOutput = new ArrayList<>(Arrays.asList("hi","hello"));
        actualOutput =input;
        assertEquals(expectedOutput,actualOutput);



        input = new ArrayList<>(Arrays.asList());
        ArrayListUtilities.removeLongWords(input);
        expectedOutput = new ArrayList<>(Arrays.asList());
        actualOutput =input;
        assertEquals(expectedOutput,actualOutput);

        input = new ArrayList<>(Arrays.asList("hi","hello"));
        ArrayListUtilities.removeLongWords(input);
        expectedOutput = new ArrayList<>(Arrays.asList("hi","hello"));
        actualOutput =input;
        assertEquals(expectedOutput,actualOutput);
    }



    @Test
    public void testReversed(){

        ArrayList<Double> input;
        ArrayList<Double> expectedOutput;
        ArrayList<Double> actualOutput;

        input = new ArrayList<>(Arrays.asList(3.0,4.0,5.0));
        expectedOutput = new ArrayList<>(Arrays.asList(5.0,4.0,3.0));
        actualOutput = ArrayListUtilities.reversed(input);
        assertEquals(expectedOutput,actualOutput);


        input = new ArrayList<>(Arrays.asList());
        expectedOutput = new ArrayList<>(Arrays.asList());
        actualOutput = ArrayListUtilities.reversed(input);
        assertEquals(expectedOutput,actualOutput);


        input = new ArrayList<>(Arrays.asList(3.0,4.0));
        expectedOutput = new ArrayList<>(Arrays.asList(4.0,3.0));
        actualOutput = ArrayListUtilities.reversed(input);
        assertEquals(expectedOutput,actualOutput);



    }


    @Test
    public void testReversedInPlace(){
        ArrayList<Double> input;
        ArrayList<Double> expectedOutput;
        ArrayList<Double> actualOutput;

        input = new ArrayList<>(Arrays.asList(3.0,4.0,5.0));
        expectedOutput = new ArrayList<>(Arrays.asList(5.0,4.0,3.0));
        ArrayListUtilities.reverseInPlace(input);
        actualOutput = input;
        assertEquals(expectedOutput,actualOutput);
 
        input = new ArrayList<>(Arrays.asList());
        expectedOutput = new ArrayList<>(Arrays.asList());
        ArrayListUtilities.reverseInPlace(input);
        actualOutput = input;
        assertEquals(expectedOutput,actualOutput);


        input = new ArrayList<>(Arrays.asList(3.0,4.0));
        expectedOutput = new ArrayList<>(Arrays.asList(4.0,3.0));
        ArrayListUtilities.reverseInPlace(input);
        actualOutput = input;
        assertEquals(expectedOutput,actualOutput);
    }



}
