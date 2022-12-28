package common;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


public class GetDateTime {

//    private LocalDateTime date;

    public String getDate() {
        LocalDateTime date = LocalDateTime.now();
        String format = date.atZone(ZoneId.of("GMT")).format(DateTimeFormatter.RFC_1123_DATE_TIME);
        return format;
    }


}
