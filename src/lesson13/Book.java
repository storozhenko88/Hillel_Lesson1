package lesson13;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Book {
    private String path;
    private String buffer = "";
    private ArrayList<String> words = new ArrayList<>();
    private HashMap<String, Integer> popularWords;
    private TreeSet<Integer> topWords = new TreeSet<>();
    public Book(String path) {
        this.path = path;
        generateCopyBook();
    }

    private void generateCopyBook(){
        FileInputStream fileInputStream;


        try {
            fileInputStream = new FileInputStream(path);
            int a;
            while ((a = fileInputStream.read()) != -1) {
                if (a >= 65 && a <= 90 || a >= 97 && a <= 122)
                    buffer += (char) a;

                if (a == 44 || a == 32 || a == 46 || a == 59) {
                    words.add(buffer);
                    buffer = "";
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void searchPopularWords() {
        popularWords = new HashMap<>();
        List<String> exceptionWords = Arrays.asList("A", "The", "If");
        List<Integer> numberRepetitions = new ArrayList<>();
        int count;

        for (String word : words) {
            if (!word.isEmpty()) {
                word = word.substring(0, 1).toUpperCase() + word.substring(1);
                if (!exceptionWords.contains(word)) {
                    if (!popularWords.containsKey(word))
                        popularWords.put(word, 1);
                    else {
                        count = popularWords.get(word);
                        count++;
                        popularWords.put(word, count);
                    }
                }
            }
        }
        for (Map.Entry<String, Integer> wordEntry : popularWords.entrySet()) {
            if (!numberRepetitions.contains(wordEntry.getValue()))
                numberRepetitions.add(wordEntry.getValue());
        }

        Collections.sort(numberRepetitions);


        int numberPins = 10;
        for (int i = numberRepetitions.size()-1; numberPins !=0; i--) {
            for (Map.Entry<String, Integer> wordEntry : popularWords.entrySet()) {
                if (wordEntry.getValue() == numberRepetitions.get(i) && wordEntry.getKey().length() > 2){
                    System.out.println(wordEntry.toString());
                    numberPins--;
                }
            }
        }


        System.out.println(numberRepetitions.toString());

        System.out.println(popularWords.toString());

    }


}
