//E
//Given two arrays of integers nums and index. Your task is to create target array under the following rules:
//
//Initially target array is empty.
//From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
//Repeat the previous step until there are no elements to read in nums and index.
//Return the target array.
//
//It is guaranteed that the insertion operations will be valid.
//    Example:
//        Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
//        Output: [0,4,1,3,2]
//        Explanation:
//        nums       index     target
//        0            0        [0]
//        1            1        [0,1]
//        2            2        [0,1,2]
//        3            2        [0,1,3,2]
//        4            1        [0,4,1,3,2]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.function.IntUnaryOperator;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TargetArray {
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList toReturn=new ArrayList(nums.length);
        int i=0;
        for (int indexElem:index
             ) {
            toReturn.add(index[i],nums[i++]);
        }

        return toReturn.stream().mapToInt(e -> (int)e).toArray();
    }
}
