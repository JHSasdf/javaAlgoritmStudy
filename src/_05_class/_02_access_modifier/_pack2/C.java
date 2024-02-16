package _05_class._02_access_modifier._pack2;

import _05_class._02_access_modifier._pack1.B;

public class C {
    // A는 접근제한자가 default라서 다른 패키지에서 접근 불가능.
//    A a;
    // B는 접근제한자가 public이라서 다른 패키지에서 접근 가능
    B b;

}
