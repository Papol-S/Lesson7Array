package ArrayClass;
import java.util.ArrayList;

public class MaxMinAvg {
    public void calshowMaxMinAvg (ArrayList<Integer> Score,ArrayList<String> Name){
        int sum = 0;
        float avg ;
        int countLow = 0;
        int countHigh = 0;

        int max = Score.get(0);
        int min = Score.get(0);
        int scoreMinIdx ;
        String nameMin ;
        int scoreMaxIdx ;
        String nameMax ;

        for (Integer value : Score) sum += value;

        avg = sum/Score.size();

        for (Integer integer : Score) {
            if (integer < avg)
                countLow++;

            else if (integer > avg)
                countHigh++;

            if (integer > max)
                max = integer;

            if (integer < min)
                min = integer;
        }

//        for (int i=0; i<Score.size(); i++) {
//            if (Score.get(i)<avg)
//                countLow++;
//            else if (Score.get(i)>avg)
//                countHigh++;
//        }
//
//        for (int i=0; i<Score.size();i++){
//            if (Score.get(i) > max)
//                max = Score.get(i);
//        }
//
//        for (int i=0; i<Score.size();i++){
//            if (Score.get(i) < min)
//                min = Score.get(i);
//        }

        scoreMaxIdx = Score.indexOf(max);
        nameMax = Name.get(scoreMaxIdx);
        scoreMinIdx = Score.indexOf(min);
        nameMin = Name.get(scoreMinIdx);

        System.out.printf("Average score is %.1f\n",avg);
        System.out.printf("Amount of student that score are lower than average score is %d\n",countLow);
        System.out.printf("Amount of student that score are higher than average score is %d\n",countHigh);
        System.out.println("The lowest score is "+nameMin);
        System.out.println("The highest score is "+nameMax);

//        System.out.println(sum);
//        System.out.println(avg);
//        System.out.println(countLow);
//        System.out.println(countHigh);
//
//        System.out.println(max);
//        System.out.println(nameMax);
//        System.out.println(min);
//        System.out.println(nameMin);

        }//End method
}//End class