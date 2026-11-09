package ru.mirea.block2.practical11;

import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;

final class DateInput {
    static final DateTimeFormatter DATE = DateTimeFormatter.ofPattern("dd.MM.uuuu")
            .withResolverStyle(ResolverStyle.STRICT);
    static final DateTimeFormatter DATE_TIME = DateTimeFormatter.ofPattern("dd.MM.uuuu HH:mm")
            .withResolverStyle(ResolverStyle.STRICT);
}
