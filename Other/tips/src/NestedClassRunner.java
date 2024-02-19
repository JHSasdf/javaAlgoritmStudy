
class DefaultClass{

}

public class NestedClassRunner {
    int i;
    // Nested Class
    // 1. inner class
    // 2. static Nested class - containing Class에 대한 instance를 생성하지 않고, static class에 대한 instance를 만들 수 있음.
    class InnerClass {
        public void method(){
            i = 5;
        }
    }

    static class StaticNestedClass {

    }

    public static void main(String[] args) {
//        InnerClass innerClass = new InnerClass();

        // 바로 접근할 수 있지만 local field에 접근할 수 없음.
        StaticNestedClass staticNestedClass = new StaticNestedClass();
        
        // innerClass 호출하기
        NestedClassRunner nestedClassRunner = new NestedClassRunner();
        InnerClass innerClass = nestedClassRunner.new InnerClass();
    }
}
