package ru.job4j.tracker;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class UsagePackageDate {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Date today is : " + currentDate);

        LocalTime currentTime = LocalTime.now();
        System.out.println("Time right now is : " + currentTime);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Date and time right now is : " + currentDateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String currentDateTimeFormat = currentDateTime.format(formatter);
        System.out.println("Date and time after formating : " + currentDateTimeFormat);

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd -MM - yyyy HH ");
        String currentDateTimeFormat1 = currentDateTime.format(formatter1);
        System.out.println("Date and time after formatting2 : " + currentDateTimeFormat1);

    }
}
