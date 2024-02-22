package g;

public class TextBlocksRunner {
    public static String str = """
            Line 1
                  "Line 2
                     'Line4
            Line 3""";

    public static void main(String[] args) {
//        String str1 = """sfsfsf"""; // error
        String textBlock = """
                Line1: %s
                Line2: %s
                Line3
                Line4
                Line5
                """.formatted("Some value1", "Some value2");
        System.out.print(str);
        System.out.println("========================");
        System.out.println(textBlock);
    }
}
