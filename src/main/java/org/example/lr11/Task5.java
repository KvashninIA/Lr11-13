package org.example.lr11;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("world");
        strings.add("Java");
        strings.add("Program");
        String substring = "o";
        List<String> filteredStrings = filterStringsContainingSubstring(strings, substring);
        System.out.println("Исходный список строк: " + strings);
        System.out.println("Список строк, содержащих подстроку '" + substring + "': " + filteredStrings);
    }

    public static List<String> filterStringsContainingSubstring(List<String> strings, String substring) {
        List<String> filteredStrings = new ArrayList<>();
        for (String str : strings) {
            if (str.contains(substring)) {
                filteredStrings.add(str);
            }
        }
        return filteredStrings;
    }
}
