package ArrayClass;

import java.util.ArrayList;
import java.util.Collections;


public class calshowStatData {
    public void calcScore (ArrayList<Integer> scoreList) {

        float range;
        float median;

        Collections.sort(scoreList);

        for (Integer integer : scoreList) {
            System.out.print(integer + " ");
        }

        //find range
        range = scoreList.get(scoreList.size()-1)-scoreList.get(0);
        System.out.println("\nrange is "+range);

        // find median
        if (scoreList.size()%2 == 1) {
            median = scoreList.get((scoreList.size()-1)/2);
            System.out.println("median from odd "+median);
        }
        else  {
            System.out.println("high boundary is "+scoreList.get(scoreList.size()/2));
            System.out.println("low boundary is "+scoreList.get(scoreList.size()/2-1));


            median = ((float)(scoreList.get(scoreList.size()/2))+(scoreList.get(scoreList.size()/2-1)))/2;
            System.out.println("median from even "+median);

        }
    } //end method
} //end class

