package lesson12;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class FileNavigator {

    private Map<String, LinkedList<FileData>> fileStorage = new HashMap<>();

    public void add(String path, FileData file) {

        if (path.equals(file.getPath())) {
            if (!fileStorage.containsKey(file.getPath()))
                fileStorage.put(path, new LinkedList<>());

            fileStorage.get(file.getPath()).add(file);
        }else System.out.println(file.getName() + " -  file not added, path is not correct");
    }

    public LinkedList<FileData> find(String path) {
        return fileStorage.get(path);
    }

    public LinkedList<FileData> filterBySize(int sizeLimitFile) {
        LinkedList<FileData> validFiles = new LinkedList<>();

        for (Map.Entry<String, LinkedList<FileData>> fileEntry : fileStorage.entrySet()) {
            for (FileData file : fileEntry.getValue()) {
                if (file.getSize() < sizeLimitFile)
                    validFiles.add(file);
            }
        }
        return validFiles;
    }

    public void remove(String path) {
        fileStorage.remove(path);
    }

    public LinkedList<FileData> sortBySize() {
        LinkedList<FileData> sortedFiles = new LinkedList<>();
        FileData temporaryStorageFile;

        for (Map.Entry<String, LinkedList<FileData>> fileEntry : fileStorage.entrySet())
            sortedFiles.addAll(fileEntry.getValue());

        for (int i = 0; i < sortedFiles.size(); i++)
            for (int j = 1; j < (sortedFiles.size() - i); j++)
                if (sortedFiles.get(j-1).getSize() > sortedFiles.get(j).getSize()) {
                    temporaryStorageFile = sortedFiles.get(j-1);
                    sortedFiles.set(j-1, sortedFiles.get(j));
                    sortedFiles.set(j, temporaryStorageFile);
                }

        return sortedFiles;
    }
}
