package package2;

public class OtherClass {
    public void method1() {
        ClassB classB = new ClassB();
        classB.protectedMethod(); // protected methods can be accessed by other class

        // classB.privateMethod(); --> can't access
    }
}
