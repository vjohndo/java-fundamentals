import business.Company;

public class Person {
    private String middleName = "Christopher";
    public static double PI = 3.14;
    public static int[] nums;

    // static initializers
    static {
        nums = new int[5];
        nums[0] = 3;
        nums[1] = 3;
        nums[2] = 3;
        nums[3] = 3;
        nums[4] = 3;
    }

    // static method allows to define more complicated static variable.
    // need to call initNums on the variable
    public static int[] initNums() {
        int[] nums = new int[5];
        nums[0] = 3;
        nums[1] = 3;
        nums[2] = 3;
        nums[3] = 3;
        nums[4] = 3;
        return nums;
    }


    public void sayHello() {
        System.out.println("hello");
    }

    public void saySomething(String message) {
        System.out.println(message);
    }

    public char getMiddleInitial() {
        return middleName.charAt(0);
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public void testArrayMethods(String[] words) {
        // do something clever with words
    }

    public void testVarargs(int num1, int num2, String... words) {
        // do something clever with words
    }
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.sayHello();
        p1.saySomething("My groovy message");
        char middleInitial = p1.getMiddleInitial();
        System.out.println(middleInitial);
        System.out.println(p1.add(5,5));
        p1.testArrayMethods(new String[] {"1", "2", "3"});
        p1.testVarargs(3, 5, "one", "two", "three");
        System.out.println(PI);
    }

    // Default class is Object which contains the toString method
    @Override
    public String toString() {
        return super.toString();
    }
}
