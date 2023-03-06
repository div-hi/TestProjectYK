package absoft;

import java.util.Scanner;

import static com.fasterxml.jackson.core.io.NumberInput.parseDouble;
import static java.lang.Integer.parseInt;

/*
Напишите программу в которой:
1) Пользователь должен ввести product name, price и qty для 5 продуктов
2) Программа должна посчитать total = price * qty для каждого продукта
3) Программа должна вывести в консоль product name и total по каждому продукта (пример Phone | 120.0)

Note1: price может быть как целым так и дробным числом
Note2: price и qty не могут быть равны "0" (вывести ошибку и прервать программу)
Note3: класс откуда будет раниться тест, должен содержать в себе ТОЛЬКО ВЫЗОВ МЕТОДОВ (допускается создание переменных)
Сами методы должны лежать в отдельном классе и вызываться из него.
 */
public class Program {
    public static void getProducts() {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Введите количество продуктов:");
        int arrayLength = 5;//parseInt(sc.nextLine());
        String[] name1 = new String[arrayLength];
        double[] price1 = new double[arrayLength];
        int[] qty1 = new int[arrayLength];
        for (int x = 0; x < price1.length; x++) {
            System.out.println("Введите название продукта: ");
            name1[x] = sc.nextLine();
            System.out.println("Введите цену на продукт: ");
            String price = sc.nextLine();
            price1[x] = parseDouble(price);
            if (price1[x] == 0) {
                System.out.println("Ошибка! Цена не может быть 0!");
                System.exit(1);
            }
            System.out.println("Введите количество продуктов: ");
            String numbr = sc.nextLine();
            qty1[x] = parseInt(numbr);
            if (qty1[x] == 0) {
                System.out.println("Ошибка! Количество не может быть 0!");
                System.exit(1);
            }
        }
            getList(name1,getTotal(price1, qty1));
    }

    public static double[] getTotal(double[] price, int[] qty) {
        double[] total = new double[price.length];
        for (int x = 0; x < price.length; x++) {
            double productTotal = price[x] * qty[x];
            total[x] = productTotal;
        }
        return total;
    }

    public static void getList(String[] name, double[] total) {
        for (int x = 0; x < total.length; x++) {
            System.out.println(name[x] + " | " + total[x]);
        }
    }
}