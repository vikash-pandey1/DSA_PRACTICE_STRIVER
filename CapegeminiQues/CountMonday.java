
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CountMonday {

    public static void main(String[] args) {
        // Example start and end dates
        LocalDate startDate = LocalDate.of(2022, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 12, 31);

        long totalMondays = countMondaysBetweenDates(startDate, endDate);
        System.out.println("Total Mondays: " + totalMondays);
    }

    public static long countMondaysBetweenDates(LocalDate startDate, LocalDate endDate) {
        // Get the first Monday on or after the start date
        LocalDate firstMonday = startDate.with(java.time.temporal.TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));

        // If the first Monday is after the end date, return 0
        if (firstMonday.isAfter(endDate)) {
            return 0;
        }

        // Calculate the total number of weeks between the first Monday and the end date
        long weeksBetween = ChronoUnit.WEEKS.between(firstMonday, endDate);

        // Add 1 to include the first Monday
        return weeksBetween + 1;
    }
}
