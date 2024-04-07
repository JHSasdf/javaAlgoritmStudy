package programers;

public class PivonachiRunner {
    long[] pivonachi = new long[1000001];


    long solution(int n) {
        pivonachi[0] = 0;
        pivonachi[1] = 1;

        for (int i = 2; i <= 100000; i++) {
            pivonachi[i] = (pivonachi[i - 2] + pivonachi[i - 1]) % 1234567;
        }
        return pivonachi[n];
    }

    public static void main(String[] args) {
        PivonachiRunner pivonachiRunner = new PivonachiRunner();

        System.out.println(pivonachiRunner.solution(2));
    }
}
