package AnotherPackage;

import AccessModifier.ClassAccessModifiers;

class SonOfClassAccessModifiers extends ClassAccessModifiers {

}
public class UsingProtectedMethodRunner {
    public static void main(String[] args) {
        SonOfClassAccessModifiers classAccessModifiers = new SonOfClassAccessModifiers();

        // protected는 같은 package 안에 있어야한다.
    }
}
