package Student;

import ArrayClass.MaxMinAvg;
import java.util.ArrayList;
import java.util.Scanner;

public class GetValue {
    public static void main (String []args){

        Scanner scan = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<Integer> scoreList = new ArrayList<>(); //generic
        int score ;
        String name ;

        while (true) {
            System.out.print("Insert name ");
            name = scan.next();
            //name = scan.nextLine(); cannot use for some reason, Please find out the different point between next() and nextLine()
            System.out.print("Insert score ");
            score = scan.nextInt();
            if (score<0)
                break;
            nameList.add(name);
            scoreList.add(score);
        }

        MaxMinAvg calc = new MaxMinAvg();
        calc.calshowMaxMinAvg(scoreList,nameList);

    }
}
