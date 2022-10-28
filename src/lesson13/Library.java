package lesson13;

import java.util.HashMap;

public class Library {
    private String path;
    private String nameBook;
    private HashMap<String, String> books;

    public Library() {
        books = new HashMap<>();
        books.put("pussInBoots", "src/lesson13/books/pussInBoots.txt");
    }

    public String getPath (String nameBook){
        if(books.containsKey(nameBook))
           path = books.get(nameBook);

        return path;
    }
}
