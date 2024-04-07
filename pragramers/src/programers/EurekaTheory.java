package programers;

import java.util.Scanner;

public class EurekaTheory {


    boolean[] isSumOfEureka = new boolean[1001];
    boolean[] isTripleOfEureka = new boolean[1001];


    public void processSumOfEureka() {
        for (int i = 1; i < 45; i++) {
            for(int j = 1; j < 45; j++) {
                int eureka1 = i*(i+1)/2;
                int eureka2 = j*(j+1)/2;
                if (eureka1 + eureka2 < 1000 && !isSumOfEureka[eureka1+eureka2]) {
                    isSumOfEureka[(i*(i+1)/2) + (j*(j+1)/2)] = true;
                }
            }
        }
    }

    public  void processTribleOfEureka() {
        for (int i = 1; i < 1000; i++) {
            if (isSumOfEureka[i]) {
                for (int j = 1; j < 45; j++) {
                    int eureka = j*(j+1)/2;
                    if(i+eureka > 1000) {
                        break;
                    }
                    isTripleOfEureka[i+eureka] = true;
                }
            }
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EurekaTheory main = new EurekaTheory();
        main.processSumOfEureka();
        main.processTribleOfEureka();
        int num = sc.nextInt();
        for(int i= 0; i < num; i++) {
        System.out.println(main.isTripleOfEureka[sc.nextInt()]? 1: 0);
        }
    }
}
