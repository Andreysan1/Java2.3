package lesson3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] words = {"aa", "bb", "cc", "dd", "ee", "ff", "gg", "aa", "bb", "hh", "kk", "ll", };
        System.out.println(Arrays.toString(words));

        Map<String, Integer> hmap = new HashMap<>();
        for (String x : words) {
            hmap.put(x, hmap.getOrDefault(x, 0) + 1);
        }
        System.out.println(hmap);

        Phone phBook = new Phone();
        phBook.add("Иванов", "89657859895");
        phBook.add("Сидоров", "89657851295");
        phBook.add("Петров", "89657859165");
        phBook.add("Васечкин", "89657759895");
        phBook.add("Иванова", "89657859365");
        phBook.add("Иванов", "89653259455");
        phBook.add("Сидоров", "896573585895");

        System.out.println("Тел:" + phBook.get("Иванов"));
        System.out.println("Тел:" + phBook.get("Петров"));
        System.out.println("Тел:" + phBook.get("Сидоров"));

    }
}
