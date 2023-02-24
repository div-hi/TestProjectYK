package absoft;
/*
Создать массив array из 10 целых чисел
C помощью цикла записать в массив числа от 1 до 10
Вывести в консоль все записанные в него числа в таком виде - [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 */

public class test9_array {
    public static void main(String[] args) {
        int[] array = new int[11];
        for (int i = 1; i < array.length; i++) {
            array[i] = i;
            if (i == 1) {
                System.out.print("[" + array[i]);
            } else if (i == 10) {
                System.out.print(", " + array[i] + "]");
            } else {
                System.out.print(", " + array[i]);
            }
        }
    }
}