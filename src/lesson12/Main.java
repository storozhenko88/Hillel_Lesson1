package lesson12;

public class Main {
    public static void main(String[] args) {
        FileNavigator files = new FileNavigator();




        files.add(new FileData("Job", 10,"C:/work"));
        files.add(new FileData("Hobby", 5,"D:/summer"));
        files.add(new FileData("Family", 7,"D:/summer"));

        System.out.println(files.find("D:/summer"));

        System.out.println(files.filterBySize(6));

    }
}
