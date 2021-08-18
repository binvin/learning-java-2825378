import java.util.Calendar;

public class StudentProfile {
    String firstName;
    String lastName;
    int expectedGradYear;
    int credits;
    double GPA;
    String major;

    public StudentProfile(String firstName, String lastName,
                          int expectedGradYear, double GPA,
                          String major, int credits){
        this.firstName = firstName;
        this.lastName = lastName;
        this.expectedGradYear = expectedGradYear;
        this.GPA = GPA;
        this.major = major;
        this.credits = credits;
    }

    public void incrementExpectedGradYear(){
        int year = Calendar.getInstance().get(Calendar.YEAR);
        if (this.credits > 90) {
            this.expectedGradYear = year + 1;
        } else if (this.credits > 60) {
            this.expectedGradYear = year + 2;
        } else if (this.credits > 30) {
            this.expectedGradYear = year + 3;
        } else {
            this.expectedGradYear = year + 4;
        }
    }
}
