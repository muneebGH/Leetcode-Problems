//E
//Given an array of positive integers arr, calculate the sum of all possible odd-length subarrays.
//
//A subarray is a contiguous subsequence of the array.
//
//Return the sum of all odd-length subarrays of arr.
//Example:
//        Input: arr = [1,4,2,5,3]
//        Output: 58
//        Explanation: The odd-length subarrays of arr and their sums are:
//        [1] = 1
//        [4] = 4
//        [2] = 2
//        [5] = 5
//        [3] = 3
//        [1,4,2] = 7
//        [4,2,5] = 11
//        [2,5,3] = 10
//        [1,4,2,5,3] = 15
//        If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class SumOfOddSubArrays {
    public static int sumOddLengthSubarrays(int[] arr) {

        List<List<Integer>> arrays=new ArrayList<>();
        for(int i=0;i<=arr.length-1;i++)
        {
            for(int j=0;j<=arr.length-i-1;j++)
            {
                List<Integer> ls=new ArrayList<>(j+i);
                for(int k=j;k<=j+i;k++)
                {
                    ls.add(arr[k]);
                }
                arrays.add(ls);
            }
        }

        return arrays.stream()
                .filter(ls -> ls.size()%2!=0)
                .map(ls -> ls.stream().mapToInt(i-> (int)i).sum())
                .mapToInt(i -> (int)i)
                .sum();

    }
}
