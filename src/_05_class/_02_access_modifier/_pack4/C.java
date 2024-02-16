package _05_class._02_access_modifier._pack4;

// A와 C는패키지가 다르므로 import 해야함.
import _05_class._02_access_modifier._pack3.A;

public class C {

    public void method() {
        A a = new A(); // _pack3.A 와 _pack3.B는 서로 같은 패키지이기 때문에 import 없이 가져올 수 있음

        // 필드 변경
        a.field1 = 11;
//      a.field2 = 13; // default field이기 때문에 다른 package에서 접근 불가, 컴파일 에러
//      a.field3 = 11; // private field이기 때문에 접근불가, 컴파일 에러

        // 메소드 호출
        a.method1();
//      a.method2(); // default method이기 때문에 다른 package에서 접근 불가, 컴파일 에러
//      a.method3(); // private method이기 때문에 접근 불가, 컴파일 에러
    }
}
