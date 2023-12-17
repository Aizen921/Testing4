import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void dateTest() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        Integer anno = data.getYear();
        String mese = String.valueOf(data.getMonth());
        Integer giorno = data.getDayOfMonth();
        String  nomeGiorno = String.valueOf(data.getDayOfWeek());

        assertEquals(2023,anno);
        assertEquals("MARCH",mese);
        assertEquals(1,giorno);
        assertEquals("WEDNESDAY",nomeGiorno);
    }
}