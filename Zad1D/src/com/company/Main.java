package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
	    int tries;
        int max;
        int min;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj MIN");
        min = scanner.nextInt();

        System.out.println("Podaj MAX");
        max = scanner.nextInt();

        System.out.println("Podaj liczbe prób");
        tries = scanner.nextInt();
        int minZakres = min;
        int maxZakres = max*10;
        int counter = 0;
        for (int i = 0; i <= tries; i++) {
            int number = ThreadLocalRandom.current().nextInt(minZakres, maxZakres + 1);

            if(number < max){
                counter++;
            }
        }
        System.out.println("Liczba zmiescila sie w przedziale : " + counter + " razy");



    }
}
