import java.util.Arrays;

public class VarArgsHomework {
    // This method below uses an Array
    //    public static void main(String[] args) {
    //        System.out.println(Arrays.toString(args));
    //    }

    public static void main(String[] args) {
        VarArgsHomework varArgsHomework = new VarArgsHomework();
        varArgsHomework.infiniteArray(new String[] {"hello", "world"});
        varArgsHomework.infiniteVarArgs("hello", "world");
    }

    private void infiniteVarArgs(String... args) {
        System.out.println(Arrays.toString(args));
    }

    public void infiniteArray (String[] args) {
        System.out.println(Arrays.toString(args));
    }
}
