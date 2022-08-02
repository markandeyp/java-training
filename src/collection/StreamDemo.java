package collection;

import games.guesstheword.WordList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(WordList.WORDS);

        List<String> sixOrMore = new ArrayList<>();

        for (String word : words) {
            if (word.length() >= 6) {
                sixOrMore.add(word);
            }
        }

        List<String> sevenOrMore = words.stream().filter(word -> word.length() >= 7).toList();

        boolean doAllLettersContainA = words.stream().allMatch(word -> word.contains("A") || word.contains("a"));

        List<String> wordsWitOO = words.stream().filter(word -> word.contains("oo")).toList();

        List<String> eleventhOnwards = words.stream().skip(10).toList();

        List<String> wordsBeforePrecision = words.stream().skip(20).takeWhile(word -> !word.equals("employ")).toList();

        System.out.printf("There are %s word with at least 6 letters\n", sixOrMore.size());
        System.out.printf("There are %s word with at least 7 letters\n", sevenOrMore.size());
        System.out.printf("There are %s word(s) with OO\n", wordsWitOO.size());
        System.out.printf("Do All letters contain A: %s\n", doAllLettersContainA);

        System.out.printf("Tenth word:%s\n", words.get(10));
        System.out.printf("Eleventh word:%s\n", eleventhOnwards.get(0));
        System.out.printf("Words before Precision:%s\n", wordsBeforePrecision.size());

        words.stream().forEach(System.out::println);
    }
}
