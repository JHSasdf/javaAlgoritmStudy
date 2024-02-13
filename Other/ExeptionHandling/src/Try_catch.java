package UDEMY_JAVA.javaWorkSpace.ExeptionHandling.src;

public class Try_catch {
    public static void main(String[] args) {
        method1();

    }
    private static void method1() {
        method2();
        System.out.println("Method1 Ended");
    }

    private static void method2() {
        try{
//            String str =null;
//            str.length();
            int[] i  = {1,2};
            int number = i[3];
            System.out.println("Method2 Ended");
        } catch (NullPointerException ex) {
            System.out.println("nullPointerException");
            ex.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Matched ArrayIndexOutOfBounds Exception");
            ex.printStackTrace();
        }
        catch (Exception ex) {
            System.out.println("Matched Exception");
            ex.printStackTrace();
        }
    }
}

