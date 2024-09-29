/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ROAD;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Ass_12 {

    public static void main(String[] args) {

        String input = "A core i, laptop is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount?";

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);

        int laptop = 0;
        int mouse = 0;

        if (matcher.find()) {
            laptop = Integer.parseInt(matcher.group());
        }
        if (matcher.find()) {
            mouse = Integer.parseInt(matcher.group());
        }

        double discount = 0.15;

        double totalPrice = laptop + mouse;
        double Amount = totalPrice * discount;
        double AfterDiscount = totalPrice - Amount;

        System.out.println("Total cost after 15% discount: " + AfterDiscount + " tk");
    }
}
