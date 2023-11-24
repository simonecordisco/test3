import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
//Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
//Formatta la data ottenendo 01 marzo 2023
//Stampa sulla console
//Crea dei test per questo esercizio
public class Main {

    public static void main(String[] args) {
        String data = "2023-03-01T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(data);
        dateTime(offsetDateTime);
    }
    public static String dateTime(OffsetDateTime data) {
        String dateTime = data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
        System.out.println(dateTime);
        return dateTime;
    }
}