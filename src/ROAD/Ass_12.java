/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ROAD;

/**
 *
 * @author User
 */
public class Ass_12 {

    public static void main(String[] args) {
        int laptop = 85000;
        int mouse = 1500;
        double discount = 15.0;

        double totalPrice = laptop + mouse;

        double Amount = totalPrice * (discount / 100);
        double AfterDiscount = totalPrice - Amount;
        System.out.println("Total cost after 15% discount: " + AfterDiscount + " tk");
    }
}
