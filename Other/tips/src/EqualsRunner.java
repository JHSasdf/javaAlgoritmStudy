import java.util.Objects;

class Client {
    private int id;
    private String name;

    public Client(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // equals
    // hashCode


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id && Objects.equals(name, client.name);
    }

    // 두 객체가 정확히 일치하면 둘의 hashCode도 정확하게 같아야 하고
    // hashCode는 값이 변하지 않는 이상 절대로 바뀌지 않아야 한다.
    // final int prime = 31;
    // int result = 1;
    // result = prime * result + id;
    // return result;

    // bucket이 31개고 id에 따라서 어디에 넣을지 정해짐
    // 저렇게 하면 id가 1일때, id가 32일때 같은 bucket에 들어가는 듯?
    // 컴퓨터가 찾을 때는 result % 31 == 1인 bucket을 찾고 거기서 63을 찾는 식으로 진행되지 않을까 싶다.
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class EqualsRunner {
    public static void main(String[] args) {
        Client c1 = new Client(13, "jihun");
        Client c2 = new Client(13, "jihun");
        Client c3 = new Client(12, "jihun");
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));

    }
}
