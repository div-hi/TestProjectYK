package absoft;
/*
Написать программу в которой пользователь должен ввести целое число (n) в диапазоне от 1 до 20
Вывести в консоль ТОЛЬКО числа от 1 до n (включительно)
Если введенное пользователем число (n) меньше 1 или больше 20 - вывести текст "Ошибка, введите число от 1 до 20"
 */

import java.util.Scanner;

public class test8_for_2 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            if (n < 1 || n > 20){
             System.out.println("Ошибка, введите число от 1 до 20");
             System.exit(1);
        }
            for (int x = 1; x <= n; x++ ){
             System.out.println(x);
        }
        sc.close();
        }
    }
