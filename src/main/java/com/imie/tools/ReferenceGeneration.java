package com.imie.tools;


import java.util.Calendar;


/**
 * Created by axel on 14/06/16.
 */

public final class ReferenceGeneration {

    public static String generateReference(String prefix){
        Calendar cal = Calendar.getInstance();
        Long date = cal.getTimeInMillis();
        System.out.println("ORD" + cal.get(Calendar.YEAR) + date);
        return prefix + cal.get(Calendar.YEAR) + date;
    }

    public static String generateIncrementalReference(String prefix, Integer lastId) {
        Calendar cal = Calendar.getInstance();
        Long date = cal.getTimeInMillis();
        System.out.println("ORD" + cal.get(Calendar.YEAR) + date);
        return prefix + cal.get(Calendar.YEAR) + date + "ID" + lastId;
    }
}
