package practice3.task5;

import java.util.function.Predicate;

public class SimplePredicateExample {
    public static void main(String[] args) {
        // Определение предиката: проверка, является ли число положительным
        Predicate<Integer> isPositive = number -> number > 0;

        // Проверка числа 5 с помощью предиката
        boolean result = isPositive.test(5);
        System.out.println("Is 5 positive? " + result);

        // Проверка числа -3 с помощью предиката
        result = isPositive.test(-3);
        System.out.println("Is -3 positive? " + result);
    }
}

