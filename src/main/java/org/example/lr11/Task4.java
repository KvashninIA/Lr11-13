package org.example.lr11;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        List<Integer> squares = getNumberSquares(numbers);
        System.out.println("Исходный список чисел: " + numbers);
        System.out.println("Список квадратов чисел: " + squares);
    }

    public static List<Integer> getNumberSquares(List<Integer> numbers) {
        List<Integer> squares = new ArrayList<>();
        for (int number : numbers) {
            int square = number * number;
            squares.add(square);
        }
        return squares;
    }
}