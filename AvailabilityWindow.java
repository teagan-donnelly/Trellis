import java.time.DayOfWeek;
import java.time.LocalTime;

/**
 * 
 * AvailabilityWindow allows the user to submit
 * when they are availible to study
 * @author Teagan Donnelly
 */
public class AvailabilityWindow {
    private DayOfWeek day;
    private LocalTime startTime;
    private LocalTime endTime;

    /**
     * creates a new availibity window
     * @param day the day the user is availible 
     * @param startTime when the window begans
     * @param endTime when the window ends
     */
    public AvailabilityWindow(DayOfWeek day, LocalTime startTime, LocalTime endTime) {
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    /**
     * determines if a given time fits in the window
     * @param time the time to check
     * @return whether the given time fits into the window or not
     */
    public boolean contains(LocalTime time) {
        return !time.isBefore(startTime) && !time.isAfter(endTime);
    }
}