
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;


public class Clock {
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_RESET = "\u001B[0m";


  public static void main(String[] args) {
     LocalTime day = LocalTime.now();
     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm");
     String text = day.format(formatter);
     System.out.printf("The " + ANSI_RED + "time" + ANSI_RESET + " is %s \n", text);
  }
}
