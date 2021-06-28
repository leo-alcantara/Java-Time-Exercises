package se.lexicon;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.SortedMap;

public class LocalDatePractice {

    public static void main(String[] args) {

        //Exercise 1:
        // Create a LocalDate of the current day and print it out.

        LocalDate currentDay = LocalDate.now();
        System.out.println("currentDay = " + currentDay);

        //Exercise2:
        //Create a LocalDate of the current day and print it out in the following pattern using DateTimeFormatter: Thursday 29 march.
        System.out.println(currentDay.format(DateTimeFormatter.ofPattern("eeee dd MMMM")));

        //Exercise3:
        //Create a LocalDate of last Monday. Then print out the entire week in a loop using standard ISO format.
        LocalDate lastMonday = LocalDate.now().minus(Period.ofDays(7));
        System.out.println("lastMonday = " + lastMonday);


        //Exercise 4:
        //Create a LocalDate object from a String by using the .parse() method.

        LocalDate tomorrowDate = LocalDate.parse("2021-06-29");
        System.out.println("tomorrowDate = " + tomorrowDate);


        //Exercise5
        //The date time api provides enums for time units such as day and month. Create a LocalDate of 1945- 05-08 and extract the day of week for that date.
        LocalDate oldDate = LocalDate.parse("1945-05-08");
        System.out.println(oldDate.getDayOfWeek());
        System.out.println(oldDate.getMonth());



        //Exercise6
        //Create a LocalDate of current date plus 10 years and minus 10 months. From that date extract the month and print it out.
        LocalDate currentPlusTen = currentDay.plus(Period.ofYears(10)).minus(Period.ofMonths(10));
        Month monthCurrentPlusTen = currentPlusTen.getMonth();
        System.out.println(monthCurrentPlusTen);


        //Exercise7
        //Using the LocalDate from exercise 6 and your birthdate, create a Period between your birthdate and the date from exercise 5.
        //Print out the elapsed years, months and days.
        LocalDate myBirthDate = LocalDate.of(1978,3,14);
        Period betMyBirthOldDate = Period.between(oldDate, myBirthDate);
        int years = betMyBirthOldDate.getYears();
        int months = betMyBirthOldDate.getMonths();
        int days = betMyBirthOldDate.getDays();
        System.out.println(years + " years, " + months + " months and " + days + " days between " + oldDate + " and " + myBirthDate);


        //Exercise 8
        //Create a period of 4 years, 7 months and 29 days. Then create a LocalDate of current date and add the period you created to the current date.
        Period longPeriod = Period.of(4, 7, 29);
        LocalDate currentPlusLong = currentDay.plus(longPeriod);
        System.out.println(currentPlusLong);

        //Exercise 9
        // Create a LocalTime object of the current time.
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);


        //Exercise 10
        //Extract the nanoseconds of a LocalTime object of current time. Print out the nanoseconds.
        System.out.println(currentTime.truncatedTo(ChronoUnit.MINUTES));
        System.out.println(currentTime.truncatedTo(ChronoUnit.SECONDS));


        //Exercise 11
        //Create a LocalTime object from a String using the .parse() method.
        LocalTime time10 = LocalTime.parse("10:00");
        System.out.println(time10);
        //LocalTime inTenMinutes = currentTime.plusMinutes(10);
        //System.out.println(inTenMinutes);


        //Exercise 12
        //Using DateTimeFormatter format LocalTime from current time and print it out as following pattern: 10:32:53
        System.out.println(currentTime.format(DateTimeFormatter.ISO_LOCAL_TIME));

        //Exercise 13
        //Create a LocalDateTime with the date and time components as: date: 2018-04-05, time: 10.00.
        LocalDateTime newDate = LocalDateTime.of(2018, 4, 5,10, 00);
        System.out.println("Date: " + newDate.getYear() + "-" + newDate.getMonthValue() + "-" + newDate.getDayOfMonth()
        + ". Time: " + newDate.getHour() + ":" + newDate.getMinute());
        System.out.println(newDate);


        //Exercise 14
        //Using DateTimeFormatter format the LocalDateTime object from exercise 11 to a String that should look tile this: Thursday 5 april 10:00
        String custom =newDate.format(DateTimeFormatter.ofPattern("eeee dd MMMM hh:mm"));
        System.out.println(custom);

        //Exercise 15
        //Create a LocalDateTime object by combining LocalDate object and LocalTime object.
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now().truncatedTo(ChronoUnit.SECONDS);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(dateTime);


        //Exercise 16
        //Create a LocalDateTime object. Then get the LocalDate and LocalTime components into separate objects of respective types from the LocalDateTime object.
        LocalDateTime dateAndTime = LocalDateTime.of(2021,6,28,15,00);

        LocalDate day = dateAndTime.toLocalDate();
        System.out.println(day);
        LocalTime hour = dateAndTime.toLocalTime();
        System.out.println(hour);
        System.out.println(day + "T" + hour);

        //Extra assignment
        //Create your own calendar for the year 2018.


    }


}
