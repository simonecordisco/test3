import org.junit.Test;

import javax.swing.text.DateFormatter;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testFormatDateTime() {

        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        assertEquals("01 marzo 2023",Main.dateTime(data));
    }
}