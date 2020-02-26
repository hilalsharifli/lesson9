package lesson10_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeApp {
    public static void main(String[] args) {


       mergeArrays mergearrays = new mergeArrays();


       mergearrays.mergeMethod(new ArrayList<>(Arrays.asList(1,2,4,5)), new ArrayList<>(Arrays.asList(2,10,22,3,4,5,7,8,9)));

        System.out.println(mergeArrays.mergeMethod(new ArrayList<>(Arrays.asList(1,2,4,5)), new ArrayList<>(Arrays.asList(2,7,8,9))));

    }
}
