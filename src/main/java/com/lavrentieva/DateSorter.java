package com.lavrentieva;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DateSorter {
    private static DateSorter instance;

    public static DateSorter getInstance() {
        if (instance == null) {
            instance = new DateSorter();
        }
        return instance;
    }

    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
        List<LocalDate> datesWithR = new ArrayList<>();
        List<LocalDate> datesWithoutR = new ArrayList<>();
        for (LocalDate date : unsortedDates) {
            if (date.getMonth().toString().toLowerCase().contains("r")) {
                datesWithR.add(date);
            } else {
                datesWithoutR.add(date);
            }
        }
        Collections.sort(datesWithR);
        Collections.sort(datesWithoutR, Collections.reverseOrder());

        datesWithR.addAll(datesWithoutR);
        return datesWithR;
    }
}

