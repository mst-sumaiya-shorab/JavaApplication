/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ROAD;

import java.util.Scanner;

public class Ass_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        String result = input.replaceAll("[AEIOUaeiou]", "");
        System.out.println("String without vowels: " + result);
    }

}
