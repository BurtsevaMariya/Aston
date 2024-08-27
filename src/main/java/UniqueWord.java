import java.util.*;

public class UniqueWord {
    public static void wordUnique() {
        Set<String> uniqueWords = new HashSet<>();
        Map<String, Integer> wordCounts = new HashMap<>();

        String[] strings = {"Слово_1", "Слово_2", "Слово_3", "Слово_4", "Слово_5", "Слово_6", "Слово_7", "Слово_8", "Слово_9", "Слово_10"};

        for (String word : strings) {
            uniqueWords.add(word);
            if (wordCounts.containsKey(word)) {
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
                wordCounts.put(word, 1);
            }
        }

        System.out.println("Уникальные слова:");
        for (String word : uniqueWords) {
            System.out.print(word + "; ");
        }
        System.out.println();

        System.out.println("Сколько повторений каждого слова:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}