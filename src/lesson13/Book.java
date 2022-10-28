package lesson13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Book {
    private String path;
    String buffer = "";
    ArrayList<String> book = new ArrayList<>();
    private HashMap<String, Integer> popularWords;
    public Book(String nameBook) {
        Library book = new Library();
        path = book.getPath(nameBook);

        if (path == null)
            System.out.println("Book not found");
    }



private ArrayList<String> searchPopularWords (){
    popularWords = new HashMap<>();

        FileInputStream fileInputStream;

    {
        try {
            fileInputStream = new FileInputStream(path);
            int a;
            while ((a = fileInputStream.read()) != -1) {
                if (a >= 65 && a <= 90 || a >= 97 && a <= 122)
                    buffer += (char) a;

                if (a == 44 || a == 32 || a == 46 || a == 59) {
                    book.add(buffer);
                    buffer = "";
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}


/

}
