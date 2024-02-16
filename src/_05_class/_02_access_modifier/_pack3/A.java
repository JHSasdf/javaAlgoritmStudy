package _05_class._02_access_modifier._pack3;

public class A {
    public int field1;

    int field2;

    private int field3;

    // constructor
    public A() {
        // 클래스 내부이므로 접근 제한자의 영향이 없음
        field1 = 1;
        field2 = 2;
        field3 = 3;

        method1();
        method2();
        method3();
    }

    public void method1() {

    }

    void method2() {

    }

    private void method3() {

    }
}
