package LabWeek5;

import java.util.Scanner;

public class Q1CoinFlipMain {

    public static void main(String[] args) {

        Q1CoinClass q1CoinClass = new Q1CoinClass();

        Scanner scanner = new Scanner(System.in);

        //Asks user for input, It will display 1000 random coin flips if you want
        System.out.println("How many times would you like to flip the coin?");
        int flipCount = scanner.nextInt();

        q1CoinClass.flipCoin(flipCount);

        System.out.printf("Current coin status = %s", q1CoinClass.getCoinStatus());
    }
}
