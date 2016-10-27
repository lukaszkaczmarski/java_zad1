package com.company;

import jdk.internal.util.xml.impl.Input;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
	    int tries = 0;
        int max = 0;
        int min = 0;

        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Podaj MIN");
            min = scanner.nextInt();

            System.out.println("Podaj MAX");
            max = scanner.nextInt();

            System.out.println("Podaj liczbe prób");
            tries = scanner.nextInt();
        }
        catch (InputMismatchException ex){
            System.out.println("Podana wartosc nie jest liczba");
            return;
        }

        int minZakres = min;
        int maxZakres = max*10;
        int counter = 0;
        for (int i = 0; i <= tries; i++) {
            int number = ThreadLocalRandom.current().nextInt(minZakres, maxZakres + 1);
            System.out.println("Wylosowana liczba : " +number);

            if(number < max){
                counter++;
            }
        }
        System.out.println("Ilosc liczb ktore zmiescily sie w przedziale : " +counter);



    }
}
