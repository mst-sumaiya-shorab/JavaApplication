/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ROAD;

import java.util.Scanner;

public class Ass_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the heights of 10 babies in cm:");
        int lowest = Integer.MAX_VALUE;
        int secondlowest = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            int height = scanner.nextInt();
            if (height < lowest) {
                secondlowest = lowest;
                lowest = height;
            } else if (height < secondlowest) {
                secondlowest = height;
            }
        }
        
        System.out.println("The two lowest heights are: " + lowest + " cm and " + secondlowest + " cm");
        scanner.close();
    }
}
