package LabWeek4Test;

import LabWeek4.Question3;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;

public class Question3Test {

    @Test
    public void shouldCheckIfValueIsInStringArray() {

        String[] strings = { "Ben", "Lai" };
        String valueToCheck = "Ben";

        assertTrue(Question3.compareStringValueToArray(strings, valueToCheck));
    }
}
