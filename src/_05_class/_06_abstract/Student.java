package _05_class._06_abstract;

public abstract class Student {
    private String name;
    private int age;
    private int sid;
    private String School;

    public Student(String name, int age, int sid, String school) {
        this.name = name;
        this.age = age;
        this.sid = sid;
        School = school;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSid() {
        return sid;
    }

    public String getSchool() {
        return School;
    }

    public abstract void todo();
}
