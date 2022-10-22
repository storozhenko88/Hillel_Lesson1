package lesson12;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class FileNavigator {

    private Map<String, LinkedList<FileData>> fileStorage = new HashMap<>();

    public void add(FileData file) {

        if (!fileStorage.containsKey(file.getPath())) {
            LinkedList<FileData> files = new LinkedList<>();
            files.add(file);
            fileStorage.put(file.getPath(), files);
        } else
            fileStorage.get(file.getPath()).add(file);
    }

    public LinkedList<FileData> find(String path) {
        return fileStorage.get(path);
    }

    public LinkedList<FileData> filterBySize(int sizeLimitFile) {
        LinkedList<FileData> validFiles = new LinkedList<>();

        for (Map.Entry<String, LinkedList<FileData>> fileEntry:  fileStorage.entrySet()) {
            for (FileData file: fileEntry.getValue()) {
                if (file.getSize() < sizeLimitFile)
                    validFiles.add(file);
            }
        }
        return validFiles;
    }
}
