//E2
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
//Example:
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Output: Because nums[0] + nums[1] == 9, we return [0, 1].


import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {


        HashMap<Integer,Integer> hashMap=new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++)
        {
            hashMap.put(nums[i],i);
            nums[i]=target-nums[i];

        }
        for(int i=0;i<nums.length;i++)
        {
            int elem=nums[i];
            Integer indexPrev=hashMap.get(elem);
            if(indexPrev!=null)
            {
                if(indexPrev.intValue()!=i && nums[indexPrev.intValue()]+elem==target)
                {
                    return new int[]{i,indexPrev.intValue()};
                }
            }

        }



        return null;
    }
}
