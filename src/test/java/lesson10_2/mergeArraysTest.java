package lesson10_2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class mergeArraysTest {


    @Test
    void mergeMethod() {
        List Expected = Arrays.asList(1, 2, 4, 5, 7, 8, 9);
        List Actual = Arrays.asList(mergeArrays.mergeMethod(new ArrayList<>(Arrays.asList(1,2,4,5)), new ArrayList<>(Arrays.asList(2,7,8,9))));
        assertEquals(Expected,Actual);
    }
}