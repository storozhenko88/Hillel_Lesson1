package lesson12;

public class Main {
    public static void main(String[] args) {
        FileNavigator files = new FileNavigator();

        files.add("C:/work", new FileData("Job", 10,"C:/work"));
        files.add("D:/summer", new FileData("Hobby", 5,"D:/summer"));
        files.add("D:/summer", new FileData("Family", 7,"D:/summer"));
        files.add("D:/travel", new FileData("City", 2,"D:/travel"));
        files.add("C:/work", new FileData("Homework", 12,"C:/work"));

        System.out.println("\nlist of files in the given path - D:/summer");
        System.out.println(files.find("D:/summer"));

        System.out.println("\nlist of files not exceeding 6 bytes");
        System.out.println(files.filterBySize(6));


        System.out.println("\ndeleted files along the path - D:/summer");
        files.remove("D:/summer");


        System.out.println("\nlist of files after sorting by file size");
        System.out.println(files.sortBySize());

    }
}
