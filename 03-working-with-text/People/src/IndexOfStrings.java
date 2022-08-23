public class IndexOfStrings {
    public static void main(String[] args) {
        String myText = "apple";
        String myNewText = myText.substring(0,1).toUpperCase();
        StringBuilder newString = new StringBuilder(myText.length());
        StringBuilder capitalisedText = newString.append(myNewText).append(myText.substring(1));

        System.out.println(myText);
        System.out.println(myNewText);
        System.out.println(capitalisedText);
    }
}
