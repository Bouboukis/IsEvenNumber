package com.georgioskachrimanis.javacourse;

public class Main {

    public static void main(String[] args) {

        int number = -1, finishnumber = 101, evenNumbersCount = 0;
        while ((number < finishnumber) && evenNumbersCount < 5){
            number++;
            if (!isEvenNumber(number)){
                continue;
            }
            evenNumbersCount ++;
            System.out.println("The number " + number + " is even.");
        }

        System.out.println("The amount of even numbers is " + evenNumbersCount);
    }

    public static boolean isEvenNumber(int number) {
        return (number % 2) == 0;
    }
}
