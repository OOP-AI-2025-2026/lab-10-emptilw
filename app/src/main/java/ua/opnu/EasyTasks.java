package ua.opnu;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

public class EasyTasks {

    public static void main(String[] args) {
        // Для виконання лабораторної роботи необхідно написати вміст методів згідно умовам завдання,
        // після чого протестувати метод за допомогою тестів, які знаходяться в папці
        // src\test\TaskTest.java
    }

    public List<Integer> doubling(List<Integer> nums) {
        // TODO: напишіть вміст методу згідно умовам для того, щоб пройти тести
        return nums.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
    }

    public List<Integer> square(List<Integer> nums) {
        // TODO: напишіть вміст методу згідно умовам для того, щоб пройти тести
        return nums.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
    }

    public List<String> moreY(List<String> strings) {
        // TODO: напишіть вміст методу згідно умовам для того, щоб пройти тести
        return strings.stream()
                .map(s -> "y" + s + "y")
                .collect(Collectors.toList());
    }

    public List<Integer> noNeg(List<Integer> nums) {
        // TODO: напишіть вміст методу згідно умовам для того, щоб пройти тести
        return nums.stream()
                .filter(n -> n >= 0)
                .collect(Collectors.toList());
    }

    public List<Integer> no9(List<Integer> nums) {
        // TODO: напишіть вміст методу згідно умовам для того, щоб пройти тести
        return nums.stream()
                .filter(n -> n % 10 != 9 && n % 10 != -9) // для від’ємних чисел типу -19
                .collect(Collectors.toList());
    }

    public List<String> noZ(List<String> strings) {
        // TODO: напишіть вміст методу згідно умовам для того, щоб пройти тести
        return strings.stream()
                .filter(s -> !s.contains("z") && !s.contains("Z"))
                .collect(Collectors.toList());
    }

    public List<String> refinedStrings(List<String> strings) {
        // TODO: напишіть вміст методу згідно умовам для того, щоб пройти тести
        return strings.stream()
                .distinct()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .collect(Collectors.toList());
    }

    public List<String> flatten(List<String> strings) {
        // TODO: напишіть вміст методу згідно умовам для того, щоб пройти тести
        return strings.stream()
                .flatMap(s -> List.of(s.split(" ")).stream())
                .collect(Collectors.toList());
    }

}