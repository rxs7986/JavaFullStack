package backend.Java_8_Features;

import java.sql.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindOldNewDates {
    public static void main(String[] args) {
        ArrayList<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(1999,8,1));
        dates.add(LocalDate.of(2023,9,2));
        dates.add(LocalDate.of(2012,10,3));
        dates.add(LocalDate.of(1992,11,4));
        Optional<LocalDate> earliestDate = dates.stream()
                .min((a,b)->a.compareTo(b));

        Optional<LocalDate> latestDate = dates.stream()
                .max((i,j)->i.compareTo(j));

        System.out.println("The earliest date is: " +earliestDate);
        System.out.println("The latest date is: "+latestDate);





    }
}
