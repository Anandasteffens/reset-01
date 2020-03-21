import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Data {

    public static String getDataHora() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm.ss.SSSS"));
    }

}
