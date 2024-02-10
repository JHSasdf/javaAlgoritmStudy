package UDEMY_JAVA.javaWorkSpace;

import java.util.Arrays;

class Person {
    int number;


    public Person(int number) {
        this.number = number;
    }

    public int getPerson() {
        return number;
    }
}

public class arrays {
    public static void main(String[] args) {
        int[] marks = new int[5];
        int[] marks2 = {7,5,1,4,3,57};
        double[] values = new double[5];
        System.out.println(Arrays.toString(marks));
        System.out.println(Arrays.toString(values));
//        클래스의 배열도 가능, 할당 안하면 null값
        Person[] persons = new Person[3];
        persons[0] = new Person(3);
        System.out.println(Arrays.toString(persons));
        Arrays.fill(marks,3);
        for (int num: marks) {
            System.out.print(num);
        }
        System.out.println();
        System.out.println(Arrays.equals(marks, marks2));
        Arrays.sort(marks2);
        System.out.println(Arrays.toString(marks2));
    }
}
