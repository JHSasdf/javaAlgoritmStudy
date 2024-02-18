package AccessModifier;

// public, protected, default, private

// class에 사용 가능한 접근제어자는 public과 default만 있음

// method에 사용 가능한 접근제어자 중 protected는 같은 패키지나 자식 패키지에 존재하는 것만 접근 가능

public class ClassAccessModifiers {
    protected void protectedMethod() {}

    public static void main(String[] args) {
        ClassAccessModifiers a = new ClassAccessModifiers();
        a.protectedMethod();
    }
}
