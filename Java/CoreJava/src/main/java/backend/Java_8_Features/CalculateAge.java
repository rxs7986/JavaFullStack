package backend.Java_8_Features;

import java.time.LocalDate;
import java.time.Period;

public class CalculateAge {
    public static void main(String[] args) {
        LocalDate dob = LocalDate.of(1999,1,8);
        LocalDate now = LocalDate.now();
        Period gap = Period.between(now,dob);
        System.out.println("The age is: " +gap);
        System.out.println("The age only in years is: " +gap.getYears());

    }
}
