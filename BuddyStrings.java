//E
//Given two strings A and B of lowercase letters, return true if you can swap two letters in A so the result is equal to B, otherwise, return false.
//Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at A[i] and A[j]. For example, swapping at indices 0 and 2 in "abcd" results in "cbad".
//Example:
//        Input: A = "ab", B = "ba"
//        Output: true
//        Explanation: You can swap A[0] = 'a' and A[1] = 'b' to get "ba", which is equal to B.

public class BuddyStrings {
    public boolean buddyStrings(String A, String B) {
//ab ba
        int differences=0;
        char temp = 0;
        for (int i = 0; i <A.length() ; i++) {


            if((A.charAt(i)!=B.charAt(i)))
            {


                if(differences==2)
                {
                    return false;
                }else if(differences==0)
                {
                    differences++;
                    temp=A.charAt(i);
                }
                else if(differences==1)
                {
                    if(temp==B.charAt(i))
                    {
                        differences++;
                    }
                    else
                    {
                        return false;
                    }
                }

            }
        }

        if(differences == 2)
        {
            return  true;
        }
        for (int i = 0; i <A.length() ; i++) {
            if(i==0)
            {
                temp=A.charAt(i);
            }else if(temp!=A.charAt(i))
            {
                return false;
            }

        }
        if(A.equals("") || B.equals(""))
        {
            return false;
        }
        return false;
    }
}
