package _05_class._02_access_modifier._pack5;

public class personRunner {

    public static void main(String[] args) {
        Person p1 = new Person("minion");
        Person p2 = new Person("phho");

        p1.setAge(4);
        System.out.println(p1.getName() + " and " + p1.getAge());

        p2.setAge(-13);
        System.out.println(p2.getName() + " and " + p2.getAge());
    }

}
