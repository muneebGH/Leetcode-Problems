package Medium;

//Given n points on a 2D plane where points[i] = [xi, yi], Return the widest vertical area between two points such that no points are inside the area.
//A vertical area is an area of fixed-width extending infinitely along the y-axis (i.e., infinite height). The widest vertical area is the one with the maximum width.
//Note that points on the edge of a vertical area are not considered included in the area.
//Example:
//Input: points = [[8,7],[9,9],[7,4],[9,7]]
//        Output: 1
//        Explanation: Both the red and the blue area are optimal.

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class WidestVerticalArea {
    public static int maxWidthOfVerticalArea(int[][] points) {


        Integer[] xPoints=new Integer[points.length];
        for (int i = 0; i < points.length; i++) {
            xPoints[i]=points[i][0];
        }

        Arrays.sort(xPoints);

        for (int i = 0; i <xPoints.length-1 ; i++) {
            xPoints[i]=xPoints[i+1]-xPoints[i];
        }
        xPoints[xPoints.length-1]=0;
        return Collections.max(Arrays.asList(xPoints));


    }
}
