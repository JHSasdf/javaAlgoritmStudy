package programers;

import java.util.Arrays;

public class JerGeRunner {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] students = new int [n+1];
        Arrays.fill(students, 1);
        for(int i: lost) {
            students[i]--;
        }
        for(int i: reserve) {
            students[i]++;
        }
        for(int i = 1; i < students.length -1; i++) {
            if(students[i-1] == 0) {
                if(students[i] == 2) {
                    students[i]--;
                    students[i-1]++;
                }
            }
            if(students[i+1] == 0) {
                if(students[i] == 2) {
                    students[i]--;
                    students[i+1]++;
                }
            }
        }
        int lastStudent = students.length-1;
        if(students[lastStudent-1] ==0) {
            if(students[lastStudent] == 2) {
                students[lastStudent]--;
                students[lastStudent-1]++;
            }
        }
        return (int) Arrays.stream(students).filter(e -> e >= 1).count()-1;
    }
    public static void main(String[] args) {
        JerGeRunner main = new JerGeRunner();
        System.out.println(main.solution(5, new int[] {2,4},new int[] {1,3,5}));
    }
}
