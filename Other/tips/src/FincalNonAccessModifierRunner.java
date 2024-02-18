final class FinalClass {
    // extends 불가, 즉 inherit을 받을 수 없음.
}

//class SomeClass extends FinalClass {
//
//}
class SomeClass {
    final public void doSomething() {}

    public void doSomethingElse(final int arg) {
        // 변수의 값을 자주 수정해 주는 것은 지양해야함.
//        arg = 6; // comfile error
    }
}

class ExtendingClass extends SomeClass {
//    public void doSomething() {}
    // final method는 overriding 불가능
}
public class FincalNonAccessModifierRunner {
    public static void main(String[] args) {
        final int i;
        i = 7;
//        i = 8; // error
    }
}
