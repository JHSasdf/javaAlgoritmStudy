package _03_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = null;
        ArrayList<String> words = new ArrayList<>();
        do {
            word = scanner.nextLine();
            words.add(word);

        } while(!word.equals("exit"));
        words.remove(words.size()-1);
        words.stream().forEach(System.out::println);
    }
}
