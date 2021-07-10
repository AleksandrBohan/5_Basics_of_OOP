package Task3;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Calendar {
    private int day;
    private int month;
    private int year;
    Weekends weekend;

    Calendar(int day, int month, int year, boolean weekendDay){
        this.day = day;
        this.month = month;
        this.year = year;

        if (weekendDay = true){
           new Weekends(day, month, year).saveInformation(weekend.weekends, weekend, "New Year");
           weekend.outputInformation(weekend.weekends);
        }
    }

    static class Weekends{

       private int weekendDay;
       private int weekendMonth;
       private int weekendYear;
       private Map<Weekends,String> weekends;
       private Weekends weekend;
       private String note;

        void saveInformation(Map <Weekends, String> weekends, Weekends weekend, String note){

            this.weekends = weekends;
            this.weekend = weekend;
            this.note = note;

            weekends.put(weekend, note);
            System.out.println();
        }


        Weekends(int day, int month, int year){
            this.weekendDay = day;
            this.weekendMonth = month;
            this.weekendYear = year;
            saveInformation(weekends, weekend, note);
        }

        void outputInformation(Map<Weekends, String> weekends){
            this.weekends = weekends;
            Set<Map.Entry<Weekends, String>> set = weekends.entrySet();
            System.out.println(set);
        }


    }

    public static void main(String[] args) {
        Calendar calendar = new Calendar(1, 1, 2021, true);

    }
}
