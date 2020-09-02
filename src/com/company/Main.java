package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        String st = DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(LocalDateTime.now().atZone(ZoneId.of("UTC+2")));
    }
}
