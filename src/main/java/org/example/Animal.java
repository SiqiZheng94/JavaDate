package org.example;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Data
@Builder
public class Animal {
    private String name;
    private LocalDate birthday;

    public void daysUntilNextBirthday(){
        LocalDate today = LocalDate.now();
        int thisYear = today.getYear();
        LocalDate thisYearBirthday = birthday.withYear(thisYear);
        if(thisYearBirthday.isAfter(today)){
            long days = ChronoUnit.DAYS.between(today, thisYearBirthday);
            System.out.println("there are "+days+" days until "+name+ "'s birthday.");
        }else{
            LocalDate nextYearBirthday = birthday.withYear(thisYear + 1);
            System.out.println("the next birthday is on "+nextYearBirthday);

        }

    }
}
