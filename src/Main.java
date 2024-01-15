import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Задача 1: Виведення перших n елементів послідовності
        printSequenceElements(55);

        // Задача 2: Виведення невід'ємних елементів послідовності
        printNonNegativeElements(90, 85, 80, 75, 70, 65, 60);

        // Задача 3: Виведення чисел, кратних п'яти, у заданому діапазоні
        displayMultiplesOfFive(-29, 10);

        // Задача 4: Обчислення суми чисел та кількості парних чисел у заданому діапазоні
        calculateSumAndEvenCount(50, 150);

        // Задача 5: Знаходження найбільшого значення в масиві
        ArrayList<Integer> array = new ArrayList<>();
        array.add(3);
        array.add(8);
        array.add(1);
        array.add(6);
        array.add(2);
        array.add(8);
        array.add(5);
        array.add(9);
        array.add(4);
        findMaxValue(array);
    }

    // Задача 1: Функція для виведення перших n елементів послідовності
    public static void printSequenceElements(int n) {
        ArrayList<Integer> sequence = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int element = (i - 1) * 2 + 1;
            sequence.add(element);
        }
        System.out.println("Перші " + n + " елементів послідовності: " + sequence);
    }

    // Задача 2: Функція для виведення невід'ємних елементів послідовності
    public static void printNonNegativeElements(int... elements) {
        ArrayList<Integer> nonNegativeElements = new ArrayList<>();
        for (int element : elements) {
            if (element >= 0) {
                nonNegativeElements.add(element);
            }
        }
        System.out.println("Невід'ємні елементи послідовності: " + nonNegativeElements);
    }

    // Задача 3: Функція для виведення чисел, кратних п'яти, у заданому діапазоні
    public static void displayMultiplesOfFive(int start, int end) {
        ArrayList<Integer> multiplesOfFive = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (i % 5 == 0) {
                multiplesOfFive.add(i);
            }
        }
        System.out.println("Числа, кратні п'яті, у діапазоні від " + start + " до " + end + ": " + multiplesOfFive);
    }

    // Задача 4: Функція для обчислення суми чисел та кількості парних чисел у заданому діапазоні
    public static void calculateSumAndEvenCount(int start, int end) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            numbers.add(i);
        }

        int sum = 0;
        int evenCount = 0;

        for (int number : numbers) {
            sum += number;
            if (number % 2 == 0) {
                evenCount++;
            }
        }

        System.out.println("Сума чисел від " + start + " до " + end + ": " + sum);
        System.out.println("Кількість парних чисел у цьому діапазоні: " + evenCount);
    }

    // Задача 5: Функція для знаходження найбільшого значення в масиві
    public static void findMaxValue(ArrayList<Integer> array) {
        if (array.isEmpty()) {
            System.out.println("Масив порожній");
            return;
        }

        int max = array.get(0);

        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) > max) {
                max = array.get(i);
            }
        }

        System.out.println("Найбільше значення в масиві: " + max);
    }
}

