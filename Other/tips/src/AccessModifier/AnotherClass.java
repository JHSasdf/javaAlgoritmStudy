package AccessModifier;

class SonClass extends ClassAccessModifiers {
    
}

class NotSonClass {

}
public class AnotherClass{

    public static void main(String[] args) {
        SonClass sonClass = new SonClass();
        sonClass.protectedMethod();
        NotSonClass notSonClass =new NotSonClass();
//        notSonClass.protectedMethod(); // 에러
    }
}
