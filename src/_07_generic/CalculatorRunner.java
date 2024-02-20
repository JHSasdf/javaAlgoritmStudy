package _07_generic;

public class CalculatorRunner {
    public static void main(String[] args) {
        Calculator<Integer> calculator1 = new Calculator(5, 10);
        Calculator<Double> calculator2 = new Calculator(5.622, 0.641);
        Calculator<Double> calculator3 = new Calculator(0.1, 0.2);
        System.out.println("Integer Sum: " + calculator1.add());
        System.out.println("Double Sum: " + calculator2.add());
        System.out.println("Double Sum: " + calculator3.add());

    }
}
