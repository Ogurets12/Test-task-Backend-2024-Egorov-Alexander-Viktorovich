package ru.prosoft;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex9 {
    public static void main(String[] args) {
        String filename = "src/main/java/ru/prosoft/text.txt";
        Map<String, Integer> wordCountMap = countWords(filename);
        printWordCount(wordCountMap);
    }

    public static Map<String, Integer> countWords(String filename) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordCountMap;
    }

    public static void printWordCount(Map<String, Integer> wordCountMap) {
        wordCountMap.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}

