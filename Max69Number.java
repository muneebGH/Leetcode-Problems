//E
//Given a positive integer num consisting only of digits 6 and 9.
//Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).
//Example:
//        Input: num = 9669
//        Output: 9969
//        Explanation:
//        Changing the first digit results in 6669.
//        Changing the second digit results in 9969.
//        Changing the third digit results in 9699.
//        Changing the fourth digit results in 9666.
//        The maximum number is 9969.

public class Max69Number {
    public int maximum69Number (int num) {
        char[] numConverted=String.valueOf(num).toCharArray();
        for (int i = 0; i < numConverted.length; i++) {
            if(numConverted[i]=='6')
            {
                numConverted[i]='9';
                return Integer.parseInt(String.valueOf(numConverted));
            }
        }

        return Integer.parseInt(String.valueOf(numConverted));


    }
}
