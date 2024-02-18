import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRunner {
    public static void main(String[] args) {
        // array에 추가, 제거를 할 때 해당 배열에 대한 새로운 배열을 복사한다.
        // 이걸 사용하면 read operations를 동기화하거나, read operation에 대해 lock을 사용할 필요가 없음.
        // 중요한 건 write operation이 동기화되었는지의 여부만 확인하는 것.

        // 만약 add 메소드와 get 메소드 모두 동기화된다면
        // 어느 시점에서 동기화가 벌어지든 10000개의 thread중 하나 add, get을 실행할 수 있게 되고
        // get 요청을 해도 다른 thread는 대기해야하는 상황이 됨.
        // CopyOnWriteArray는 add에 대해서만 동기화해줌.
        // add 연산의 경우에는 전체 array를 복사한다. add는 그 복사된 array에서 일어나고 그동안 get 요청은 원본을 기준으로 받아온다.
        // add 작업이 끝난다면 예전 array가 새로운 array로 교체된다.
        // 그래서 이 array.를 복사하는 과정에서 다른 thread들이 이전 array 값을
        // 읽어올 수 있는 것.
        // 즉. add요청이 실행될 때 다른 thread의 get요청은 바뀌기 전의 원본 데이터를 불러오는 것.
        List<String> list = new CopyOnWriteArrayList<>();

        // Threads - 3
        list.add("Ant");
        list.add("Bat");
        list.add("Cat");
        list.add("Coherent");

        // Threads - 10000;
        for(String element:list) {
            System.out.println(element);
        }

    }
}
