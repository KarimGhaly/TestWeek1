package com.example.admin.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 9/1/2017.
 */

public class Main {
    public static void main(String[] args) {
        String firstString = "Karim";
        String secondString = "mirak";
        boolean xx = palindromeCheck(firstString, secondString);
        System.out.println(xx);
        List<Integer> x = new ArrayList<>();
        x.add(2);
        x.add(3);
        x.add(4);
        x.add(5);
        x.add(5);
        x.add(6);
        x.add(7);
        int Re = mostOccurrenceInt(x);
        System.out.println(Re);
        boolean xy = ArmstrongCheck(371);
        System.out.println(xy);
    }


    public static boolean palindromeCheck(String firstStr, String secondString) {
        if (firstStr != null) {
            String reversdStr = "";
            for (int i = firstStr.length() - 1; i > -1; i--) {
                reversdStr += firstStr.toLowerCase().charAt(i);
            }
            if (secondString.toLowerCase().equals(reversdStr)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static int mostOccurrenceInt(List<Integer> intgerList) {
        int Max = 0;
        int Result = 0;
        int count;
        for (int x : intgerList) {
            count = 0;
            for (int i = 0; i < intgerList.size(); i++) {
                int y = intgerList.get(i);
                if (x == y) {
                    count++;
                }
            }
            if (Max < count) {
                Max = count;
                Result = x;
            }
        }
        return Result;
    }

    public static boolean ArmstrongCheck(int orgInt) {
        double Sum = 0;
        boolean Result;
        {
            String inttostr = String.valueOf(orgInt);
            for (int i = 0; i < inttostr.length(); i++) {
                int digit = Integer.parseInt(inttostr.charAt(i) + "");
                Sum = Sum + Math.pow(digit, inttostr.length());
            }
            if (orgInt == Sum) {
                Result = true;
            } else {
                Result = false;
            }
            return Result;
        }
    }
}
