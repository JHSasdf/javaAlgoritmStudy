package UDEMY_JAVA.javaWorkSpace.ExeptionHandling.src;
// Throwable
// Error, Exception
//         RuntimeException

// RuntimeException의 자식인 것 => unchecked exceptions, 메소드가 이걸 떠넘기면 calling method는 아무 처리도 안해도 됨.
// RuntimeException의 자식이 아닌 것 => checked exceptions, Risky, 메소드가 이걸 떠넘기면, calling 메소드는 이를 처리하거나 또 떠넘겨야 함.


public class CheckedExceptionRunner {
    public static void main(String[] args){
        try {
            someOtherMethod();
            someOthermethod2();
        Thread.sleep(2000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
//    someOtherMethod();


    }

    private static void someOtherMethod() throws InterruptedException {
        Thread.sleep(2000);
    }

    private static void someOthermethod2() throws Exception{
        Thread.sleep(2000);
    }
}
