import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        Integer anno = data.getYear();
        String mese = String.valueOf(data.getMonth());
        Integer giorno = data.getDayOfMonth();
        String  nomeGiorno = String.valueOf(data.getDayOfWeek());

        System.out.println("Anno: " + anno);
        System.out.println("Mese: " + mese);
        System.out.println("Giorno: " + giorno);
        System.out.println("Nome Giorno: " + nomeGiorno);
    }
}
