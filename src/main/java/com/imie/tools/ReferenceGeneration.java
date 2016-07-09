package com.imie.tools;


import java.util.Calendar;


/**
 * This class is a static tool class used to generated reference.
 *
 * Created by axel on 14/06/16.
 */
public final class ReferenceGeneration {

    /**
     * This function generate reference for every Order and Delivery.
     * (Invoice reference is generated into Invoice Service insert).
     *
     * @param prefix
     * @return
     */
    public static String generateReference(String prefix){
        Calendar cal = Calendar.getInstance();
        Long date = cal.getTimeInMillis();
        return prefix + cal.get(Calendar.YEAR) + date;
    }
}
