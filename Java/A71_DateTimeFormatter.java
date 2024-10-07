import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class A71_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        // DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");  
        // DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy -- E");  
        // DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy -- E a");  
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy -- E H:m a");  
        // DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-dd-MM");
        String myDate = dt.format(df);
        System.out.println(myDate);

        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
        String myDate1 = dt.format(df2);
        System.out.println(myDate1);
    }
}
