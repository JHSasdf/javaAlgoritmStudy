package _03_Array;

// Collection Type
// : 객체를 효율적으로 추가, 삭제, 검색 할 수 있도록 관련 인터페이스 & 클래스를 java.util에 포함시켜 놓음

// : List
//  ㄴ ArrayList

// : set
//   ㄴ HashSet
//   ㄴ TreeSet,
//   ㄴ LinkedSet

// : Map
//   ㄴ HashMap
//   ㄴ HashTable
//   ㄴ TreeMap
//   ㄴ LinkedMap

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// ArrayList 클래스
// - List collection에서 가장 많이 사용되는 collection
// - 표준 배열보다 조금 느릴 수 있으나, 배열에서 많은 조작이 필요한 경우 유용
// - 크기를 미리 지정하지 않아도 됨. (동적할당)
// - List 컬렉션은 객체 자체를 저장하는 게 아니라, 객체 주소를 저장 -> 동일한 객체 중복 저장 가능, null 저장 가능
public class ArrayListRunner {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(3,4,8,6));

        numbers.addAll(List.of(3,5,7,8,6,3,7));
        // 요소 접근
        System.out.println(numbers.get(3));

        // 요소 수정
        numbers.set(3, 27486);
        System.out.println(numbers.get(3));
        System.out.println(numbers);

        // 중간에 요소 삽입
        numbers.add(0, 348);
        System.out.println(numbers);

        // ArrayList끼리 연결
        numbers.addAll(Arrays.asList(39,468765,123,48));
        System.out.println(numbers);

        // 요소 위치 찾기
        System.out.println(numbers.indexOf(123));
        System.out.println(numbers.indexOf(468765));
        System.out.println(numbers.indexOf(99));

        // 요소 삭제
        numbers.remove(2);

        // 리스트 크기
        System.out.println(numbers.size());

        // 모든 요소 순회
        for (Integer n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
        // 모든 요소 삭제
        numbers.clear();
        System.out.println("numbers is..." + numbers);

        ArrayList<Student> students = new ArrayList<>(List.of(new Student("jihun", 26), new Student("Joey", 14)));
        students.add(new Student("JYANET", 21));
        for (Student student: students) {
            System.out.println(student);
        }
        System.out.println(students.size());
        System.out.println(students.get(1).getName());
    }
}

class Student{


    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // 사용자 정의 타입에서 오버라이드 하지 않으면, Object 객체에 있는 toString method가 호출.
    // 이는 객체의 클래스 이름과 해시코드를 문자열로 반환 (즉 참조값 반환)
    @Override
    public String toString() {
        return "name: " + this.name + "/ age: " + this.age;
    }



}