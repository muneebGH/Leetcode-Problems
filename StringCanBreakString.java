import java.util.Arrays;


//Given two strings: s1 and s2 with the same size, check if some permutation of string s1 can break some permutation of string s2 or vice-versa. In other words s2 can break s1 or vice-versa.
//A string x can break string y (both of size n) if x[i] >= y[i] (in alphabetical order) for all i between 0 and n-1.
//Example:
//        Input: s1 = "abc", s2 = "xya"
//        Output: true
//        Explanation: "ayx" is a permutation of s2="xya" which can break to string "abc" which is a permutation of s1="abc".
//Example:
//        Input: s1 = "abe", s2 = "acd"
//        Output: false
//        Explanation: All permutations for s1="abe" are: "abe", "aeb", "bae", "bea", "eab" and "eba" and all permutation for s2="acd" are: "acd", "adc", "cad", "cda", "dac" and "dca". However, there is not any permutation from s1 which can break some permutation from s2 and vice-versa.
public class StringCanBreakString {

    public static boolean checkIfCanBreak(String s1, String s2) {
        var arr1=s1.toCharArray();
        var arr2=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean faultDetected=false;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]<arr2[i]){
                faultDetected=true;
                break;
            }
        }

        if(!faultDetected) return true;
        for (int i = 0; i <arr2.length ; i++) {
            if(arr2[i]<arr1[i]){
                return false;
            }
        }
        return true;
    }
}
