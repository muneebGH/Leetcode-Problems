//There is a room with n bulbs, numbered from 0 to n-1, arranged in a row from left to right. Initially all the bulbs are turned off.
//
//        Your task is to obtain the configuration represented by target where target[i] is '1' if the i-th bulb is turned on and is '0' if it is turned off.
//
//        You have a switch to flip the state of the bulb, a flip operation is defined as follows:
//
//        Choose any bulb (index i) of your current configuration.
//        Flip each bulb from index i to n-1.
//        When any bulb is flipped it means that if it is 0 it changes to 1 and if it is 1 it changes to 0.
//
//        Return the minimum number of flips required to form target.
//
//
//Example:
//        Input: target = "10111"
//        Output: 3
//        Explanation: Initial configuration "00000".
//        flip from the third bulb:  "00000" -> "00111"
//        flip from the first bulb:  "00111" -> "11000"
//        flip from the second bulb:  "11000" -> "10111"
//        We need at least 3 flip operations to form target.

public class BulbSwitcherIV {
    public static int minFlips(String target) {
        int flipCount=0;
        char startChar='0';
        StringBuilder original=new StringBuilder();
        char[] targetArray=target.toCharArray();
        for (char c : targetArray) {
            if (c != startChar) {
                char toAppend = startChar == '0' ? '1' : '0';
                original.append(toAppend);
                flipCount += 1;
                startChar = toAppend;
            }
        }
        return flipCount;
    }
}
