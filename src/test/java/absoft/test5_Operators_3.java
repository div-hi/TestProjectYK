package absoft;
/*
Написать программу в которой пользователь будет вводить число (от 1 до 7)
и выводить соответствующий числу день недели (e.g. 1 - понедельник, 2 - вторник и т.д.)
Если число не в диапазоне от 1 до 7 - вывести текст "Ошибка, введите число от 1 до 7"
Используйте конструкцию if-else-if
 */

import java.util.Scanner;

public class test5_Operators_3 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = sc.nextInt();
        if (number == 1){
            System.out.println("Понедельник");
        } else if (number == 2){
            System.out.println("Вторник");
        } else if (number == 3){
            System.out.println("Среда");
        } else if (number == 4){
            System.out.println("Четверг");
        } else if (number == 5){
            System.out.println("Пятница");
        } else if (number == 6){
            System.out.println("Суббота");
        } else if (number == 7){
            System.out.println("Воскресенье");
        } else {
            System.out.println("Ошибка, введите число от 1 до 7");
        }
    }

}
