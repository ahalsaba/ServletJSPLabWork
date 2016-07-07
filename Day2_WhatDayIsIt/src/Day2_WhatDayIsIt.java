/**
 * Created by AHALSABA on 7/6/2016.
 */
import java.util.Scanner;

public class Day2_WhatDayIsIt {



        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter a month-day-year (00/00/0000) and when you wish to stop, type 'quit': ");
            String next = sc.nextLine();
            while (!next.equals("quit")){
                int month = Integer.parseInt(next.substring(0,2));
                int day = Integer.parseInt(next.substring(3,5));
                int year = Integer.parseInt(next.substring(6,10));
                System.out.println(day + " "+ month + " "+  year);
                if (month == 1 || month == 2){
                    month += 12;
                    year -= 1;
                }
                int a =(int)( 13*((double)month+1)/5);
                int b = (int)((double)year/4);
                int c = 6*(int)(((double)year/100));
                int d = (int)((double)year/400);
                System.out.println(a + " "+ b + " "+  c+ " "+  d);
                int total = a+b+c+d+day+year;
                int remainder = total%7;
                if (remainder == 0) {
                    System.out.println("Saturday");
                }else if(remainder == 1) {
                    System.out.println("Sunday");
                }else if(remainder == 2) {
                    System.out.println("Monday");
                }else if (remainder == 3) {
                    System.out.println("Tuesday");
                }else if (remainder == 4) {
                    System.out.println("Wednesday");
                }else if(remainder == 5) {
                    System.out.println("Thursday");
                }else
                    System.out.println("Friday");




                next = sc.nextLine();

            }
        }

}
