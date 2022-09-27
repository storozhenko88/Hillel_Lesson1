package lesson4;

public class ReversalLine {

    public static void main(String[] args) {

        String originalText = "ZюукяДZіботZ,ежобZощZяZенZ!ьлаксом";
        String[] word = originalText.split("Z");


        for (String str: word) {
            System.out.print(new StringBuilder(str).reverse() + " ");
        }


    }
}
