//Given two equal-size strings s and t. In one step you can choose any character of t and replace it with another character.
//Return the minimum number of steps to make t an anagram of s.
//An Anagram of a string is a string that contains the same characters with a different (or the same) ordering.
//Example:
//        Input: s = "bab", t = "aba"
//        Output: 1
//        Explanation: Replace the first 'a' in t with b, t = "bba" which is anagram of s.
//Example:
//        Input: s = "leetcode", t = "practice"
//        Output: 5
//        Explanation: Replace 'p', 'r', 'a', 'i' and 'c' from t with proper characters to make t anagram of s.
public class StepsToMakeAnagram {
    public static int minSteps(String s, String t) {
        int steps=0;
        StringBuilder obj=new StringBuilder(t);
        for (char c :
                s.toCharArray()) {
            int index=obj.indexOf(String.valueOf(c));
            if(index!=-1){
                obj.deleteCharAt(index);
            }else{
                steps=steps+1;
            }
        }


        return steps;
    }
}
