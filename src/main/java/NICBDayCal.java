/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nic;

import javax.swing.JTextField;

/**
 *
 * @author Gishan-mac
 */
public class NICBDayCal {

    public static String nicmethod(JTextField jtf) {
        /* if (jtf.getText().length() == 10 && (jtf.getText().charAt(9) == 'v' || jtf.getText().charAt(9) == 'V' || jtf.getText().charAt(9) == 'x' || jtf.getText().charAt(9) == 'X')) {
         return year(jtf) + " - " + md(jtf);
         }else if (jtf.getText().length() > 10) {
         return"Invalid";
         } else {
         return "Invalid";
         }*/

        return (jtf.getText().length() == 10 && (jtf.getText().charAt(9) == 'v' || jtf.getText().charAt(9) == 'V' || jtf.getText().charAt(9) == 'x' || jtf.getText().charAt(9) == 'X') && ((Integer.valueOf(jtf.getText().substring(2, 5)) > 500 && Integer.valueOf(jtf.getText().substring(2, 5)) < 867) || (Integer.valueOf(jtf.getText().substring(2, 5)) > 0 && Integer.valueOf(jtf.getText().substring(2, 5)) < 367))) ? (year(jtf) + " - " + md(jtf)) : "Wrong Entry";
    }

    public static String gender(JTextField jtf) {
        if (jtf.getText().length() == 10 && (jtf.getText().charAt(9) == 'v' || jtf.getText().charAt(9) == 'V' || jtf.getText().charAt(9) == 'x' || jtf.getText().charAt(9) == 'X')) {
            if (Integer.valueOf(jtf.getText().substring(2, 5)) > 0 && Integer.valueOf(jtf.getText().substring(2, 5)) < 367) {
                return "Male";
            } else if (Integer.valueOf(jtf.getText().substring(2, 5)) > 500 && Integer.valueOf(jtf.getText().substring(2, 5)) < 867) {
                return "Female";
            } else {
                return "";
            }
        } else {
            return "";
        }
    }

    private static int year(JTextField jtf) {
        return Integer.valueOf("19" + jtf.getText().substring(0, 2));
    }

    private static String md(JTextField jtf) {
        String month;
        int date, days = Integer.valueOf(jtf.getText().substring(2, 5));
        days = (days > 500) ? days - 500 : days;
        if (0 < days && days <= 31) {
            month = "January";
            date = days;
        } else if (31 < days && days <= 60) {
            month = "February";
            date = days - 31;
        } else if (60 < days && days <= 91) {
            month = "March";
            date = days - 60;
        } else if (91 < days && days <= 121) {
            month = "April";
            date = days - 91;
        } else if (121 < days && days <= 152) {
            month = "May";
            date = days - 121;
        } else if (152 < days && days <= 182) {
            month = "June";
            date = days - 152;
        } else if (182 < days && days <= 213) {
            month = "July";
            date = days - 182;
        } else if (213 < days && days <= 244) {
            month = "August";
            date = days - 213;
        } else if (244 < days && days <= 274) {
            month = "September";
            date = days - 244;
        } else if (274 < days && days <= 305) {
            month = "October";
            date = days - 274;
        } else if (305 < days && days <= 335) {
            month = "November";
            date = days - 305;
        } else if (335 < days && days <= 366) {
            month = "December";
            date = days - 335;
        } else {
            return "Wrong Entry";
        }
        return month + " - " + date;
    }
}
