package absoft;

/*
Создать массив array из 5 имен ("John", "Dan", "Ashe", "Carl", "Bill")
Отсортируйте массив по алфавиту
Добавьте в конец новый елемент массива - "Stan"
Выведите в стобик все елементы массива (каждое имя должно быть с новой строки)
 */

import java.util.Arrays;

public class test10_array2 {
    public static void main (String [] args) {
        String[] array = {"John", "Dan", "Ashe", "Carl", "Bill"};
        String[] newArray = new String[array.length + 1];
        Arrays.sort(array);
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[newArray.length - 1] = "Stan";
        for (String s : newArray) {
            System.out.println(s);
        }
    }
}
