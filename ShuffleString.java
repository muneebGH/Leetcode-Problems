//E
//Given a string s and an integer array indices of the same length.
//The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
//Return the shuffled string.
//Example:
//        Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
//        Output: "leetcode"
//        Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.

public class ShuffleString {
    public static String restoreString(String s, int[] indices) {
        char[] shuffled=new char[s.length()];
        char[] c=s.toCharArray();
        for(int i=0;i<c.length;i++){
            shuffled[indices[i]]=c[i];
        }

        return String.valueOf(shuffled);
    }
}
