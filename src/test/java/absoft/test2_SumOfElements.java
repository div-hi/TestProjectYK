package absoft;

/*
Напишите программу которая попросит пользователя ввести price и qty (перед вводом значений должен быть текст что именно нужно ввести)

Выведите в консоль "Total:" и результат который равен price * qty.
P.S. Price может быть как целым так и дробным числом. (e.g. 20,99)
 */

import java.util.Scanner;

public class test2_SumOfElements {
    public static void main (String [] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your price:");
        double price = sc.nextDouble();
        System.out.println("Enter your qty:");
        int qty = sc.nextInt();
        System.out.println("Total: " + price*qty);
    }
}