package com.lavrentieva;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<LocalDate> unsortedDates = new ArrayList<>(List.of(
                LocalDate.of(2023, 7, 1),
                LocalDate.of(2023, 1, 2),
                LocalDate.of(2023, 1, 1),
                LocalDate.of(2023, 5, 3)
        ));
        DateSorter dateSorter = DateSorter.getInstance();
        Collection<LocalDate> dateSorted = dateSorter.sortDates(unsortedDates);
        System.out.println(dateSorted);


    }
}
