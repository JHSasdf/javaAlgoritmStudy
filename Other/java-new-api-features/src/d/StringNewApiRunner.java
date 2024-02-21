package d;

class SampleClass {
    String str = null;
}
public class StringNewApiRunner {
    public static void main(String[] args) {
        System.out.println("".isBlank());
        System.out.println(" L R ".strip().replace(" ", "@"));
        System.out.println(" L R ".stripLeading().replace(" ", "@"));
        System.out.println(" L R ".stripTrailing().replace(" ", "@"));
        // 라인 종결자로 구분된 문자열을 stream으로 만드려면 lines()를 쓰면 된다.
        "Line1\nLine2\nLine3\nLine4".lines().forEach(System.out::println);

        String a ="UPPER".transform(s -> s.substring(2));
        System.out.println(a);
        System.out.println("My name is %s. My age is %d. ".formatted("Ranga", 25));

        String str = null;
        SampleClass sampleClass = new SampleClass();
        System.out.println(sampleClass.str.isBlank());
        System.out.println(str.isBlank());
    }
}
