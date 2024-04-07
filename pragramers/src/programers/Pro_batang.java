package programers;

import java.util.Arrays;

public class Pro_batang {
    int[] solution(String[] wallpapers) {
        int lux, luy, rdx, rdy;
        lux = 0;
        rdx = 0;
        luy = wallpapers[0].length();
        rdy = 0;
        boolean luxExist = false;
        for(int i = 0; i < wallpapers.length; i++) {
            boolean shopExist =  wallpapers[i].contains("#");

            if(shopExist) {
                for(int j = 0; j < wallpapers[i].length(); j++) {
                 if(wallpapers[i].charAt(j) == '#') {
                     luy = Math.min(luy, j);
                     break;
                 }
                }
                for(int j = wallpapers[i].length()-1; j >= 0; j--) {
                    if(wallpapers[i].charAt(j)== '#') {
                        rdy = Math.max(rdy, j);
                        break;
                    }
                }
            }
            if(!luxExist && shopExist) {
                lux = i;
                luxExist = true;
            }
            if(shopExist) {
                rdx = i+1;
            }
        }
        rdy++;
        return new int[] {lux, luy, rdx, rdy};
    }

    public static void main(String[] args) {
        Pro_batang main = new Pro_batang();
        System.out.println(Arrays.toString(main.solution(new String[]{"..........", ".....#....", "......##..", "...##.....", "....#....."})));
    }
}
