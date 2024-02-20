package _08_collection._set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class HashSetRunner {
    public static void main(String[] args) {
        // HashSet 컬렉션 생성
        Set<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Apple"); // 중복 객체 -> 저장 안됨
        set1.add("Kiwi");
        System.out.println(set1);

        // 객체 개수 출력
        System.out.printf("총 %d 종류의 과일이 있습니다. \n\n", set1.size());

        ////////////////////////////////////////////
        // Course 클래스
        // equals 메소드와 hashCode 메소드를 Overriding했기 때문에 같은 객체라고 인식한다.
        Set<Course> set2 = new HashSet<>();
        set2.add(new Course(101, "Java"));
        set2.add(new Course(102, "JS"));
        set2.add(new Course(102, "JS"));
        set2.add(new Course(101, "Java"));
        set2.add(new Course(101, "Java")); // 인스턴스는 다르지만 동등 값, 객체 1개만 저장

        System.out.println(set2);
        for(Course c : set2) {
            System.out.println(c);
        }
        System.out.printf("총 %d 종류의 과정이 있습니다. \n\n", set2.size());


        // case 2. iterator() 메소드로 하나씩 가져오기
        // iterator (반복자) 가 제공하는 메소드

            // - boolean hasNext(): 가져올 객체가 있으면 true, 없으면 false;
            // - E next(): 컬렉션에서 하나의 객체를 가져옴
            // - void remove(): next()로 가져온 객체를 Set 컬렉션에서 제거함
        System.out.println("=== iterator()로 Set 객체 출력");
        Iterator<Course> iterator = set2.iterator();
        while(iterator.hasNext()) {
            Course c = iterator.next();
            System.out.println(c);
        }
    }
}
