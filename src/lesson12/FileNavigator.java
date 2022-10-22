package lesson12;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class FileNavigator {

    private Map<String, LinkedList<FileData>> fileStorage = new HashMap<>();

    public void add (FileData file){

        if (!fileStorage.containsKey(file.getPath())){
            LinkedList<FileData> files = new LinkedList<>();
            files.add(file);
            fileStorage.put(file.getPath(), files);
        }
        else
    }
}
