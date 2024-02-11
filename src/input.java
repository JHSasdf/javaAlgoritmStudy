import java.io.BufferedReader;
import java.io.InputStreamReader;

public class input {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        String input = buffer.readLine();
        int num = Integer.parseInt(buffer.readLine());
        String [] lst = buffer.readLine().split(" ");
        int fir = Integer.parseInt(lst[0]);
        int scd = Integer.parseInt(lst[1]);
        int third = Integer.parseInt(buffer.readLine());
        int fourth = buffer.read();
        System.out.println(input);
        System.out.println("________________________________");
        System.out.println(num);
        System.out.println("________________________________");
        System.out.println(fir + "\n"+ scd);

        System.out.println(third);
        System.out.println(fourth);

    }
}
