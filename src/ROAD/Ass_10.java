/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ROAD;

public class Ass_10 {

    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 1, 2, 4, 5, 6, 5, 4, 7};
        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;

                }
            }
            if (count == 1) {
                System.out.println(numbers[i] + ", ");
            }
        }
    }
}
