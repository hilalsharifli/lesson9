package lesson10_2;
import java.util.*;

public class mergeArrays {


    public static List mergeMethod(List FirstNums, List SecondNums){


        Set<Integer> mergedNumlist = new HashSet<>(FirstNums);
        mergedNumlist.addAll(SecondNums);

        List<Integer> MergedNums = new ArrayList<>(mergedNumlist);



        return MergedNums;


    }
}
