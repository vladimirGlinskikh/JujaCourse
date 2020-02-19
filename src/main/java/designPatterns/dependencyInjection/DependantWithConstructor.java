package designPatterns.dependencyInjection;

import java.text.DateFormat;
import java.util.Date;

public class DependantWithConstructor {
    private final DateFormat format;

    public DependantWithConstructor(final DateFormat format) {
        this.format = format;
    }

    public String format(final Date date) {
        return format.format(date);
    }
}
