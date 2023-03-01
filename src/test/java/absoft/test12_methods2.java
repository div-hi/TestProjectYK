package absoft;

/*
Написать 2 метода:
- Первый метод должен принимать как параметр имя пользователя (одно из трех - "Alex", "John", "Stan") и
выводить в консоль текст "Hello [имя]"
- Второй метод должен принимать как параметр имя, которое было введено в первом методе и выводить в
консоль номер места (1, 2 или 3) с соответствующим текстом ("Your seat is [номер места]")
Если имя не "Alex", "John" или "Stan" - вывести в консоль "Sorry, name was not found"
 */

import java.util.Objects;
import java.util.Scanner;

public class test12_methods2 {
    public static void getName(String name) {
        if (Objects.equals(name, "Alex") || Objects.equals(name, "John") || Objects.equals(name, "Stan")) {
            System.out.println("Hello " + name);
        } else {
            System.out.println("Sorry, name was not found");
        }
    }
    public static void getSeat(String name) {
        switch (name){
            case "Alex":
                System.out.println("Your seat is 1");
                break;
            case "John":
                System.out.println("Your seat is 2");
                break;
            case "Stan":
                System.out.println("Your seat is 3");
                break;
        }
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        getName(name1);
        getSeat(name1);
    }
}
