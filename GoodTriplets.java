//E
//Given an array of integers arr, and three integers a, b and c. You need to find the number of good triplets.
//
//A triplet (arr[i], arr[j], arr[k]) is good if the following conditions are true:
//
//0 <= i < j < k < arr.length
//|arr[i] - arr[j]| <= a
//|arr[j] - arr[k]| <= b
//|arr[i] - arr[k]| <= c
//Where |x| denotes the absolute value of x.
//
//Return the number of good triplets.
//Example:
//        Input: arr = [3,0,1,1,9,7], a = 7, b = 2, c = 3
//        Output: 4
//        Explanation: There are 4 good triplets: [(3,0,1), (3,0,1), (3,1,1), (0,1,1)].


public class GoodTriplets {
    public static int countGoodTriplets(int[] arr, int a, int b, int c) {

        int count=0;
        for(int i=0;i<arr.length-2;i++)
        {

            for(int j=i+1;j<arr.length-1;j++)
            {

                for(int k=j+1;k<arr.length;k++)
                {
                    int elemOne=arr[i];
                    int elemTwo=arr[j];
                    int elemThree=arr[k];
                    if((Math.abs(elemOne-elemTwo)<=a)&& (Math.abs(elemTwo-elemThree)<=b)&&(Math.abs(elemOne-elemThree)<=c))
                    {
                        count+=1;
                    }
                }
            }
        }

        return count;
    }
}
