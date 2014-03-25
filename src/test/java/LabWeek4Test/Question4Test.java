package LabWeek4Test;

import LabWeek4.Question4;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

public class Question4Test {

    @Test
    public void shouldRemoveAllDivisibleValuesFromListValues() {

        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

        int value = 3;
        int expectedValue = 2;

        assertEquals(expectedValue, Question4.removeValuesDivisibleByInteger(integers, value));
    }
}
