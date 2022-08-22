public class ConcatStrings {
    public static void main(String[] args) {
        String text1 = "this is my text1";
        String text2 = "this is my text2";

        System.out.println(text1 + text2);
        System.out.println(text1 + " " + text2);

        System.out.println(text1.concat(text2));
        System.out.println(text1.concat(" " + text2)); // not ideal

        // Best method for lots of strings or if you're inside a loop

        String finalString = new StringBuilder(text1.length() + text2.length() + 1) // builder can take an input i.e. final string size for better mem allocation
                .append(text1)
                .append(" ")
                .append(text2)
                .toString();
        System.out.println(finalString);

        // Now deprecated due to threads.

        String finalString2 = new StringBuffer(text1.length() + text2.length() + 1) // builder can take an input i.e. final string size for better mem allocation
                .append(text1)
                .append(" ")
                .append(text2)
                .toString();
        System.out.println(finalString);

        // String formatting
        System.out.printf("%s %s", text1, text2);
        String oneMoreFinalString = String.format("%s %s", text1, text2);
        System.out.println(oneMoreFinalString);
    }
}
