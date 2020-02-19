package com.company;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        byte age = 30;
//        long viewsCount = 3_123_456_789L;
//        float price = 10.99F;
//        char letter = 'A';
//        String dup = "chacha";
//        boolean isEligible = false;
//
//        Date now = new Date();
//        now.getTime();
//	    System.out.println(dup);
//        System.out.println(now);

        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);

        String message = "Hello World" + "!";
        System.out.println(message);

        int [] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println(Arrays.toString(numbers));

        int[] numbas = {2,3,4,5,1,4};
        Arrays.sort(numbas);
        System.out.println(Arrays.toString(numbas));

//        9 Multi-dimensional arrays
//        int[][] numbers2 = new int[2][3];
//        numbers2[0][0] = 1;
        int[][] numbers2 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(numbers2));

//        10 - Constants - all capital letters for constants
        final float PI = 3.14F;

//        11 - Arithmetic Expressions
        int result = 10 + 3;
        double r2 = (double)10/ (double)3;
        int x = 1;
        int y = x++;
//        prefix
        ++x;
//        postfix
        x++;
        x += 2;
        System.out.println(result);
        System.out.println(r2);
        System.out.println(x);
        System.out.println(y);

//        12 - Order of Operations
//        Implicit casting
//        byte > short > int > long > float > double
        String xx = "1";
        int yy = Integer.parseInt(xx) + 2;
        System.out.println(yy);
//        Explicit Casting
        double flt = 2.2;
        int cope = (int)flt + 3;
        System.out.println(cope);

//      14 - Math Class
        int result2 = Math.round(1.1F);
        System.out.println(result2);
        int result3 = (int)Math.ceil(1.6F);
        System.out.println(result3);

//      15 - Formatting Numbers
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String r1 = currency.format(1234567.891);
        System.out.println(r1);

//      16 - Reading Input
        System.out.print("Age: ");
        Scanner scanner = new Scanner(System.in);
        byte age1 = scanner.nextByte();
        System.out.println("You are " + age1);
    }
}
