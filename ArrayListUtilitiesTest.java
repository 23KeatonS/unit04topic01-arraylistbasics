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


    
}
