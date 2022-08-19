public class StripText {
    public static void main(String[] args) {
        String firstName = "   Jake\n   ";
        System.out.printf("'%s'", firstName.strip());

        String multiline = """
                    first line
                        second line
                    third line
                """;
        System.out.println(multiline.stripIndent());
    }

    public static String split(String text) {
        return text.replace(" ", "");
    }
}
