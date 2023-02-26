package absoft;

/*
Написать метод, который будет возвращать total (total = price * qty * 0.8)
Price может быть как целым числом так и дробным
Метод должен принимать значения price и qty (значения можете задать самостоятельно)
Вывести в консоль "Your total = " + результат
 */

public class test11_methods1 {
    public static void main(String[] args) {
        double p = 12.33;
        int q = 2;
        double total = getTotal(p, q);
        System.out.println("Your total = " + total);
    }

    public static double getTotal(double price, int qty) {
        return price * qty * 0.8;
    }
}
