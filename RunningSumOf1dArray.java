//E
// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//Return the running sum of nums.
//
//Example:
//        Input: nums = [1,2,3,4]
//        Output: [1,3,6,10]
//        Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].


public class RunningSumOf1dArray {
    public static int[] runningSum(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            if(i!=0)
            {
                nums[i]=nums[i-1]+nums[i];
            }
        }

        return nums;
    }
}
