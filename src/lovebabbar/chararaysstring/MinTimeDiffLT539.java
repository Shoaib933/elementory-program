package lovebabbar.chararaysstring;

import java.util.Arrays;
import java.util.List;

public class MinTimeDiffLT539 {

    static void main() {

        IO.println("Minimum Diff : "+findMinDifference( List.of("12:10", "10:15", "13:15", "17:20", "18:00", "19:47", "22:59")));
    }

    public static  int findMinDifference(List<String> timePoints) {
        int[] minutes = new int[timePoints.size()];

        for(int i =0; i<timePoints.size(); i++) {
            String str = timePoints.get(i);
            int hours = Integer.parseInt(str.substring(0,2));
            int min = Integer.parseInt(str.substring(3,5));
            int totalMinutes = hours * 60 + min;
            minutes[i] = totalMinutes;
        }
        Arrays.sort(minutes);
        int mini = Integer.MAX_VALUE;
        for(int i = 0; i<minutes.length-1; i++) {
            int diff = minutes[i+1] - minutes[i];
            mini = Math.min(mini, diff);
        }

        //something missing
        // one day = 1440 minutes
        int lastDiff = minutes[0] + 1440 - minutes[minutes.length-1];
        mini = Math.min(mini, lastDiff);

        return mini;

    }

//    static int minMinutesDiff(List<String> str) {
//        int[] timeInMinutes = new int[str.size()];
//
//        for (int i = 0; i < timeInMinutes.length; i++) {
//            String time = str.get(i);
//            int hrs = Integer.parseInt(time.substring(0, 2));
//            int minutes = Integer.parseInt(time.substring(3, 5));
//            int totalMinutes = hours * 60 + min;
//            timeInMinutes[i] = totalMinutes;
//        }
//
//        Arrays.sort(timeInMinutes);
//        int mini = Integer.MAX_VALUE;
//
//        for (int i = 0; i < timeInMinutes.length-1; i++) {
//             mini = Math.min(mini, timeInMinutes[i+1] - timeInMinutes[i]);
//        }
//        // one day = 1440 mins --- circular diff in watch
//
//        int lastdiff = 1440 + timeInMinutes[0] + timeInMinutes[timeInMinutes.length - 1];
//        return Math.min(mini, lastdiff);
//    }
}
