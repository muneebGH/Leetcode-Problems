//E
//Given an integer n and an integer start.
//
//Define an array nums where nums[i] = start + 2*i (0-indexed) and n == nums.length.
//
//Return the bitwise XOR of all elements of nums.
//
//Example:
//        Input: n = 5, start = 0
//        Output: 8
//        Explanation: Array nums is equal to [0, 2, 4, 6, 8] where (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8.
//        Where "^" corresponds to bitwise XOR operator.


import java.util.Arrays;
import java.util.function.IntBinaryOperator;

public class XorOperationArray {
    public static int xorOperation(int n, int start) {

        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=start+2*i;
        }

        Arrays.stream(arr).forEach(System.out::println);

        return Arrays.stream(arr).reduce((l,r)-> l ^ r).getAsInt();

    }
}
