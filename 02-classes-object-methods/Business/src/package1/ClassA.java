package package1;

import package2.ClassB; // This was automatically imported by the IDE

public class ClassA {
    public static void main(String[] args) {
        ClassB classB = new ClassB();
        classB.publicMethod();
        // classB.protectedMethod (); not able to be accessed from here
        // classB.privateMethod(); not able to access from here
        // classB.packageProctected(); not able to be accessed here
    }
}
