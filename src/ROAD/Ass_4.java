/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ROAD;

import java.util.Random;

public class Ass_4 {

    public static void main(String[] args) {
        int[] array = new int[10];
        Random num = new Random();
        
        for (int i = 0; i < 10; i++) {
            array[i] = num.nextInt(50);
            System.out.print(array[i] + ", ");

        }
        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("\nMax number: " + max);
        System.out.println("Min number: " + min);
    }
}
