
/*
Задача 1: Условие: Напишите программу, которая используя Stream API находит сумму квадратов чисел из массива.

Задача 2: Условие: Напишите программу, которая используя Stream API выводит строки из массива, длинна которых больше 5.

Задача 3: Условие: Напишите программу, которая используя Stream API находит наибольшее число в массиве.

Задача 4: Условие: Напишите программу, которая используя Stream API находит самое длинное слово из массива.
 */
public class Main {
    public static void main(String[] args) {

        //Task1
        int[] numbers = {1, 7, 3, 5, 9};
        System.out.println(Task1.sumOfSquares(numbers));

        // Task2
        String[] strings = {"Klym", "Hayk", "Viktoria", "Kirill", "Andrey", "Ruslan"};
        System.out.println(Task2.filterByLength(strings));

        // Task3
        int[] numbers2 = {7, 5, 8, 77, 35};
        System.out.println(Task3.findMax(numbers2));

        // Task4
        String[] words = {"java", "JavaScript", "Python", "TypeScript", "С++"};
        System.out.println(Task4.findLongestWord(words));


    }
}
