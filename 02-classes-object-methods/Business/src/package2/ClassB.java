package package2;

public class ClassB {
    public void publicMethod() {
        System.out.println("This is a public method of class B");
        privateMethod();
    }

    private void privateMethod() {
        System.out.println("This is the private method of class A");
    }

    protected void protectedMethod() {
        System.out.println("This is the protected method of class B");
    }

    void packageProtected() {
        System.out.println("This is the package protected method");
    }
}
