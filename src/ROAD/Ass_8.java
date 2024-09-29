/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ROAD;

import java.util.Scanner;

public class Ass_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        int wordCount ;
        int charCount = 0;
        int vowelCount = 0;
        int consonantCount = 0;

        String[] words = input.split("\\s+");
         wordCount = words.length;
        
        
         for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                charCount++;
                c = Character.toLowerCase(c);
                if ("aeiou".indexOf(c) != -1) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
         
         System.out.println("Words: " + wordCount);
        System.out.println("Chars: " + charCount);
        System.out.println("Vowel: " + vowelCount);
        System.out.println("Consonant: " + consonantCount);
    }
}
