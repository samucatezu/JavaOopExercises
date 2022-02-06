package com.company;

// Java Program to guess a Random Number Generation

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        // stores actual and guess number
        int resposta, pergunta;

        // maximum value is 100
        final int MAX = 100;

        // takes input using scanner
        Scanner in = new Scanner(System.in);

        // Random instance
        Random rand = new Random();

        boolean correct = false;

        // correct answer
        resposta = rand.nextInt(MAX) + 1;

        // loop until the guess is correct
        while (!correct) {

            System.out.println(
                    "Digite um numero entre 1 and 100: ");

            // guess value
            pergunta = in.nextInt();

            // if guess is greater than actual
            if (pergunta > resposta) {
                System.out.println("Muito alto, tente novamente");
            }

            // if guess is less than actual
            else if (pergunta < resposta) {
                System.out.println("Muito baixo, tente novamente");
            }

            // guess is equal to actual value
            else {

                System.out.println(
                        "você conseguiu achar o numero!");

                correct = true;
            }
        }
        System.exit(0);
    }
}
