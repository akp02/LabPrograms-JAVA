/*8. A. Create a public enum Weekday with constants for MONDAY, TUESDAY,... until
SUNDAY. The enum should have an instance method boolean isWeekDay() and
an instance method boolean isHoliday(). The isHoliday() method should return
the opposite of isWeekDay(). Write a program which demonstrates how this
enum could be used, which has a method which takes a Weekday as the
argument and prints a message depending on whether the Weekday is a holiday
or not.

B. Create a class called Teacher with data members for storing Teacher_ID,
Teacher_name, T_specialization, T_Collegename, T_experience, T_Course and methods */
public enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    static boolean isHoliday(Weekday w){
        if(w == SATURDAY || w == SUNDAY) return true;
        return false;
    }
    static boolean isWeekday(Weekday w){
        if(w == SATURDAY || w == SUNDAY) return false;
        return true;
    }
}
/**
 * InnerWeekday
 */
class InnerWeekday{

    public static void main(String[] args) {
        Weekday w = Weekday.MONDAY;
        if((Weekday.isHoliday(w))){
            System.out.println("hi there");
        }        
    }
}
