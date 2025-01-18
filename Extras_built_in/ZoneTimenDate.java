import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
public class ZoneTimenDate {
public static void main(String[] args) {
    ZonedDateTime gmtTime= ZonedDateTime.now(ZoneId.of("GMT"));
    ZonedDateTime istTime= ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
    ZonedDateTime pstTime=ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

    DateTimeFormatter dis= DateTimeFormatter.ofPattern("HH:mm:ss z");

    System.out.println("GMT time : "+ gmtTime.format(dis));
    System.out.println("IST time : "+ istTime.format(dis));
    System.out.println("PST time : "+ pstTime.format(dis));
}
}