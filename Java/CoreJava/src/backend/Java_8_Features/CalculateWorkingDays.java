package backend.Java_8_Features;

import java.time.LocalDate;
import java.time.DayOfWeek;

public class CalculateWorkingDays {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.of(2023, 7, 1); // Replace with your desired date

        int workingDays = 0;
        int daysRemaining = currentDate.lengthOfMonth() - currentDate.getDayOfMonth() + 1;

        for (int i = 0; i < daysRemaining; i++) {
            DayOfWeek dayOfWeek = currentDate.plusDays(i).getDayOfWeek();
            if (dayOfWeek != DayOfWeek.SATURDAY && dayOfWeek != DayOfWeek.SUNDAY) {
                workingDays++;
            }
        }

        System.out.println("Number of working days until the end of the month: " + workingDays);
    }
}
