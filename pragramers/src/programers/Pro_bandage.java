package programers;

import java.util.Arrays;

public class Pro_bandage {

    public static int solution(int[] bandage, int health, int[][] attacks) {
        int now = health;
        int count = 0;
        int pointer = 0;
        for(int i = 1; i <= attacks[attacks.length-1][0]; i++) {
            if(attacks[pointer][0] == i) {
                now -= attacks[pointer][1];
                if(now <= 0) {
                    break;
                }
                count = 0;
                pointer++;
            } else {
                now += bandage[1];
                count++;
                if(count == bandage[0]) {
                    now += bandage[2];
                    count = 0;
                }
            }
            now = Math.min(health, now);
        }
        if(now > 0) {
            return now;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 1, 1}, 5, new int[][]{{1, 2}, {3, 2}}));
    }
}
