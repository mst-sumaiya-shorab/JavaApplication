/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ROAD;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class Ass_3 {

    public static int binarysea(double[] array, double target) {
        int i = 0;
        int j = array.length - 1;
//        double epsilon = 0.0001;
        while (i <= j) {
            int mid = (i + j) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        double[] array = {3.3, 3.32, 3.43, 3.48, 3.5, 3.52, 3.6, 3.63, 3.75, 3.86};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the CGPA : ");
        double target = scanner.nextDouble();
        int find = binarysea(array, target);

        if (find != -1) {
            System.out.println("CGPA found at index " + find);
        } else {
            System.out.println("CGPA not found");
        }
    }
    
}
