package com.max.idea;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;


public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(in).useLocale(Locale.ENGLISH);
        System.out.println("input line:");
        String a = inp.nextLine();
        boolean res;
        if (a.contains("Java") && a.startsWith("I like") && a.endsWith("!!!"))
            System.out.printf("Upper case string: %s\n", a.toUpperCase());
        a=a.replace('a', 'o');
        System.out.printf("Part of \"o\" string: %s\n", a.substring(7, 11));
    }
}