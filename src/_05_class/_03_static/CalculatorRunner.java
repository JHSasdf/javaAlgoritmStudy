package _05_class._03_static;

public class CalculatorRunner {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        double cirCleArea = num1*num1*Calculator.pi;
        int minusResult = Calculator.minus(num1, num2);
        int plusResult = Calculator.plus(num1, num2);
        System.out.println("원의 넓이" + cirCleArea);
        System.out.println("마이너스 결과" + minusResult);
        System.out.println("플러스 결과" + plusResult);
    }
}
