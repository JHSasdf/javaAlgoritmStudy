public class ThreadBasicsRunner {

    public static void main(String[] args) {
        for (int i = 101; i <= 199; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n Task1 done");
        for (int i = 201; i <= 299; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n Task2 done");
        for (int i = 301; i <= 399; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\n Task3 done");
        System.out.print("\n main done");
    }
}
