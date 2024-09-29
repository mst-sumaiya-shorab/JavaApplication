/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ROAD;

import java.util.Scanner;

public class Ass_5 {

    public static void main(String[] args) {
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        int amount = scanner.nextInt();

        for (int i = 0; i < notes.length; i++) {
            if (amount >= notes[i]) {
                int notecount = amount / notes[i];
                amount = amount % notes[i];
                System.out.println(notes[i] + " " + notecount);
            }
        }
    }
}
