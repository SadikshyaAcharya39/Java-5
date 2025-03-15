import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaDate
{
    public static void main(String[] args) {

//        LocalDate date = LocalDate.now();
//        System.out.println(date);

        LocalDateTime localDateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy:mm:dd  HH:mm:ss");

        String formattedDateTime = localDateTime.format(formatter);

        System.out.println(formattedDateTime);

    }
}
