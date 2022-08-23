public class StringLength {
    public static void main(String[] args) {
        String myText = "for score and seven years ago";
        System.out.println(myText.length());

        char[] chars = myText.toCharArray();
        int index = 200;

        if (index < myText.length()) {
            System.out.println(chars[2]);
        }


        String myTextNew = "for";
        String secondText = "score";
        StringBuilder builder = new StringBuilder(myTextNew.length() + secondText.length())
                .append(myTextNew)
                .append(secondText);
        System.out.println(builder.toString());
    }
}
