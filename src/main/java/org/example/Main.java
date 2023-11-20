package org.example;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        System.out.println("2 weeks after now is: "+date.plusWeeks(2));

        LocalDateTime currentTime = LocalDateTime.now();
        LocalDateTime futureTime = LocalDateTime.of(2024,1,1,0,0);
        if (currentTime.isAfter(futureTime)){
            System.out.println("current time is after the specified time.");
        }
        else {
            System.out.println("current time is before the specified time.");
        }

        System.out.println("there are "+ChronoUnit.DAYS.between(currentTime, futureTime)+" days between "+currentTime+" and "+futureTime);

        Animal dog = Animal.builder()
                .name("Puto")
                .birthday(LocalDate.of(2022, 1, 29))
                .build();
        dog.daysUntilNextBirthday();



    }
}