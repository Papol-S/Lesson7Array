package Student;

import ArrayClass.calshowStatData;
import java.util.ArrayList;
import java.util.Scanner;


public class GetValue {
    public static void main (String []args) {
        Scanner scan = new Scanner(System.in);

        int score;

        ArrayList<Integer> scoreList = new ArrayList<>();

        while (true) {
            System.out.print("Please insert score ");
            score = scan.nextInt();
            if (score < 0)
                break;
            scoreList.add(score);
        }

       calshowStatData calc = new calshowStatData();
        calc.calcScore(scoreList);

    }
}
