import business.Company;

public class Person {
    private String middleName = "Christopher";


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
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.sayHello();
        p1.saySomething("My groovy message");
        char middleInitial = p1.getMiddleInitial();
        System.out.println(middleInitial);
        System.out.println(p1.add(5,5));
    }
}
