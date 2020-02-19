package designPatterns.dependencyInjection;

import java.text.DateFormat;
import java.util.Date;

public class Dependant {
    private final DateFormat format = DateFormat.getDateInstance();

    public String format(final Date date) {
        return format.format(date);
    }
}
