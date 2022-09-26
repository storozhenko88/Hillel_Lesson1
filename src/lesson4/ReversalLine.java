package lesson4;

public class ReversalLine {

    public static void main(String[] args) {

        String originalText = "ZюукяДZіботZ,ежобZощZяZенZ!ьлаксом";
        String reversalText = "";

        for (int i = originalText.length()-1; i >= 1; i--){
            if (originalText.charAt(i) == 'Z')
                reversalText = reversalText + " ";
            else
                reversalText = reversalText + originalText.charAt(i);
        }

        System.out.println("Original text - " + originalText);
        System.out.println("Reversal text - " + reversalText);
    }
}
