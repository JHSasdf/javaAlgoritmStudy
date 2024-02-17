package _05_class._06_abstract;

public class StudnetRunner {
    public static void main(String[] args) {
        Kim kim = new Kim("김철수", 12, 2017102720, "김고등학교");
        Baek baek = new Baek("백종원", 57, 10002264, "마포고등학교");
        System.out.println(kim);
        kim.todo();

        System.out.println(baek);
        baek.todo();
    }
}
