package Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PathInZigZagBinaryTree {
    public static List<Integer> pathInZigZagTree(int label) {

        List<Integer> ls = new ArrayList<>();
        ls.add(label);

        while (true) {
            int logicalParent = Math.floorDiv(label, 2);
            int levelOfLabel = (int) (Math.log(label) / Math.log(2));
            if (levelOfLabel <= 1) {
                if (levelOfLabel != 0) {
                    ls.add(1);
                }
                break;
            }
            int levelOfParent = levelOfLabel - 1;
            int minOfParent = (int) Math.pow(2, levelOfParent);
            int maxOfParent = (minOfParent * 2) - 1;
            if (levelOfLabel % 2 == 0) {
                label = maxOfParent - (logicalParent - minOfParent);
            } else {
                label = minOfParent + (maxOfParent - logicalParent);
            }
            ls.add(label);
        }

        Collections.reverse(ls);
        return ls;
    }


}
