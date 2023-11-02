package UDEMY_JAVA.javaWorkSpace;

public class method {
    public static void helloWorldTwice(int num1, int num2) {
        System.out.printf("%d + %d = %d ", num1, num2, num1+num2).println();
    }
    public static void helloWorldTwice(int num1, int num2, int num3) {
        System.out.printf("%d + %d + %d = %d ", num1, num2, num3, num1+num2+num3).println();
    }
    public static void sayHelloWorld(int num) {
        for (int i = 0; i < num ; i++) {
            System.out.println("Hello World!");
        }
    }
    public static void main(String[] args) {

        helloWorldTwice(1,2);
        helloWorldTwice(1,2,845);
        sayHelloWorld(5);
    }
}
