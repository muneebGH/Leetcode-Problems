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
