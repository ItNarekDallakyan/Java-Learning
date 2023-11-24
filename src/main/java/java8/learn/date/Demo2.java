package java8.learn.date;

import java.time.LocalTime;
import java.time.ZoneId;

public class Demo2 {

  public static void main(String[] args) {

    LocalTime time = LocalTime.now();
    System.out.println("Current Time: " + time);

    LocalTime specificTime = LocalTime.of(12, 20, 25, 40);
    System.out.println("Specific Time of Day: " + specificTime);

    LocalTime timeLosAngeles = LocalTime.now(ZoneId.of("America/Los_Angeles"));
    System.out.println("Current Time in IST: " + timeLosAngeles);

    LocalTime specificSecondTime = LocalTime.ofSecondOfDay(10000);
    System.out.println("10000th second time: " + specificSecondTime);

  }
}
