package _07_generic;

public class CalculatorRunner {
    public static void main(String[] args) {
        Calculator<Integer> calculator1 = new Calculator(5, 10);
        Calculator<Double> calculator2 = new Calculator(5.622, 0.641);
        System.out.println("Integer Sum: " + calculator1.add());
        System.out.println("Double Sum: " + calculator2.add());
    }
}
