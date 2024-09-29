/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ROAD;
/*
 * this code about of without shorting linear searching
 */
public class Ass_1 {

    public static double findhighest(double[] array) {
        double highest = array[0];
        for (double i : array) {
            if (i > highest) {
                highest = i;
            }
        }
        return highest;
    }
    
    public static double findsechighest(double[] array) {
        double highest = findhighest(array);
        double sechighest = array[0];
        for (double i : array) {
            if (i < highest && i > sechighest) {
                sechighest = i;
            }
        }
        return sechighest;
    }

    public static void main(String[] args) {

        double[] array = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        double sechighest = findsechighest(array);

        System.out.println("The second highest CGPA is :  " + sechighest);

    }
}
