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
