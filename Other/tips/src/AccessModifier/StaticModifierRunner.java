package AccessModifier;

class Player {
    private String name;
    // static: instance별로 변수를 갖는 것이 아닌 모든 instance가 공유하는 field, method
    // static method에서는 non static field와 static method에 접근 불가능함.
    // but, instance method에서는 static field, static method에 접근 가능.
    private static int count;

    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setCount(int count) {
        Player.count = count;
    }

    public Player(String name) {
        this.name = name;
        count++;

    }
}
public class StaticModifierRunner {
    public static void main(String[] args) {
        Player player1 = new Player("Ronaldo");
        System.out.println(player1.getCount()); // 이렇게도 호출할 수 있는데 추천하지는 않음.
        Player player2 = new Player("Messi");
        System.out.println(Player.getCount());
    }
}
