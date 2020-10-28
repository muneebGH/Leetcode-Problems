//E
//You're given strings J representing the types of stones that are jewels,
//and S representing the stones you have.  Each character in S is a
//type of stone you have.  You want to know how many of the stones you have are also jewels.
//
//The letters in J are guaranteed distinct, and all characters in J and S are letters.
//Letters are case sensitive, so "a" is considered a different type of stone from "A".
//Example:
//        Input: J = "aA", S = "aAAbbbb"
//        Output: 3

public class JewlesAndStones {
    public static int numJewelsInStones(String J, String S) {
        int count=0;
        char[] strChars=J.toCharArray();
        for (char c:strChars
             ) {
            count+=S.chars().filter(ch->ch==c).count();
        }
        return count;
    }
}
