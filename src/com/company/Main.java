package com.company;

import java.util.Scanner;

public class Main {

    //    Write a program that reads in lines from standard input
    //    with each line containing a name and two integers and then
    //    uses printf() to print a table with a column of
    //    the names, the integers, and the result of dividing the first
    //    by the second, accurate to three decimal places. You could use
    //    a program like this to tabulate batting averages for
    //    baseball players or grades for students.

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int wins = sc.nextInt();
        int losses = sc.nextInt();
        double average = (double) losses + wins / 2;
        battingAve(name, wins, losses, average);
    }

    private static void battingAve(String name, int wins, int losses, double average) {
        System.out.println("name" + "   |   " + "wins" + "   |   " + "losses" + "   |   " + "average" + "   |   ");
        System.out.println("-------|----------|------------|-------------|--");
        System.out.println(name + " |   " + wins + "     |     " + losses + "      |     " + average + "    |     ");
        System.out.println("-------|----------|------------|-------------|--");
    }

}
