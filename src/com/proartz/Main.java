package com.proartz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // search if words contains word from the words map
        Map<String, Integer> wordsMap = new HashMap<>();

        wordsMap.put("love", 1);
        wordsMap.put("hate", 2);
        wordsMap.put("sorrow", 3);
        wordsMap.put("pain", 4);
        wordsMap.put("affection", 5);
        wordsMap.put("death", 0);


        boolean quit = false;
        while(!quit) {
            // take input from the user
            System.out.println("Enter the sentence:");
            String sentence = scanner.nextLine();

            // divide it to the words
            String[] words = sentence.toLowerCase().split(" ");

            for (String word : words) {
                if (wordsMap.containsKey(word)) {
                    int value = wordsMap.get(word);

                    // return value from the map for the word
                    System.out.println("Value for the " + word + " is " + value);

                    if(value == 0) {
                        System.out.println("And death shall have no dominion.");
                        quit = true;
                        break;
                    }
                }
            }
        }
    }
}
