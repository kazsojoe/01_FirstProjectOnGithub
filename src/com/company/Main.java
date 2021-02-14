package com.company;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

/*
//        String st = DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(LocalDateTime.now().atZone(ZoneId.of("UTC+2")));
//        System.out.println(st);


        LocalDate currentDate = LocalDate.now();
//        String intendedDate = LocalDate.of(2020, 7,9).toString();
//        String intendedDate = "";
        String intendedDate = "+10";

        if (intendedDate.equals("")) {
            intendedDate = currentDate.toString();
        }
        if (intendedDate.startsWith("+")) {
            String numOfPlusDaysString = intendedDate.substring(1);
            long numOfPlusDaysLong = Long.parseLong(numOfPlusDaysString);
            intendedDate = currentDate.plusDays(numOfPlusDaysLong).toString();
        }
        if (intendedDate.startsWith("-")) {
            String numOfMinusDaysString = intendedDate.substring(1);
            long numOfMinusDaysLong = Long.parseLong(numOfMinusDaysString);
            intendedDate = currentDate.minusDays(numOfMinusDaysLong).toString();
        }
        System.out.println(intendedDate);


        String currentDateTime = LocalDateTime.now().toString();
//        String intendedDateTime = DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(LocalDateTime.of(2020,7,9,11,35,47,256).atZone(ZoneId.of("UTC+2")));
        String intendedDateTime = "";
//        String intendedDateTime = "-10";

        if (intendedDateTime.equals("")) {
            intendedDateTime = DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(LocalDateTime.now().atZone(ZoneId.of("UTC+2")));
        }
        if (intendedDateTime.startsWith("+")) {
            String numOfPlusDaysString = intendedDateTime.substring(1);
            long numOfPlusDaysLong = Long.parseLong(numOfPlusDaysString);
            intendedDateTime = DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(LocalDateTime.now().plusDays(numOfPlusDaysLong).atZone(ZoneId.of("UTC+2")));
        }
        if (intendedDateTime.startsWith("-")) {
            String numOfMinusDaysString = intendedDateTime.substring(1);
            long numOfMinusDaysLong = Long.parseLong(numOfMinusDaysString);
            intendedDateTime = DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(LocalDateTime.now().minusDays(numOfMinusDaysLong).atZone(ZoneId.of("UTC+2")));
        }
        System.out.println(intendedDateTime);


        String sdf = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        System.out.println(sdf);
*/

//        DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
//        String date = "2020-10-16T14:40:01.112+02:00";
//        LocalDateTime localDateTime = LocalDateTime.parse(date, formatter);
//        System.out.println(localDateTime);
//        String newLDT = localDateTime.minusSeconds(5).toString();
//        System.out.println(newLDT);


        String dt = "2020-10-16T14:40:21.000+02:00";
        System.out.println(dt);
        dt = dt.substring(0,19);
        dt = dt.replace("T", " ");
        System.out.println(dt);


//        String myName = "2020-10-16 14.40.21";
//        LocalDateTime localDT;
//
//        System.out.println(myName);
//        int sec = Integer.parseInt(myName.substring(17,19));
//        System.out.println(sec);
//        sec = sec - 5;
//        System.out.println(sec);
//        if()
//        String newName = myName.substring(16,17) + 'x'+myName.substring(16);
//        System.out.println(newName);
    }
}
