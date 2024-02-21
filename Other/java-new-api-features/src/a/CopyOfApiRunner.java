package a;

import java.util.ArrayList;
import java.util.List;

public class CopyOfApiRunner {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("RANGA");
        names.add("RANGA");
        names.add("RANGA");


        System.out.println(names);
        // copyOf로 생성된 List는 immutable함
        // 이미 immutable한 경우 만들지 않음. 원본이 반환됨.
        List<String> copy = List.copyOf(names);
//        doNotChange(copy);
        List<String> list = List.of("sfsf", "kim");
        List<String> copy2 = List.copyOf(list);
        System.out.println(copy == names); // false
        System.out.println(list == copy2); // true
        System.out.println(copy);
    }

    private static void doNotChange(List<String> names) {
        names.add("showldNotBeAlloed");
    }
}
