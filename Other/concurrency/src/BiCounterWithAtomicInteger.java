import java.util.concurrent.atomic.AtomicInteger;

// locks 대신 AtomicInteger 사용
// 복잡한 연산일 경우는 locks 사용해줘야함.
public class BiCounterWithAtomicInteger {
    private AtomicInteger i = new AtomicInteger();
    private AtomicInteger j = new AtomicInteger();


    public void incrementI() {
        i.incrementAndGet();

        // 자동으로 이 코드조각이 thread-safe인지 확인하고 increment해줌
    }

    public int getI() {
        return i.get();
    }

    public void incrementJ() {
        //Get Lock For J
        j.incrementAndGet();
        //Release Lock For J
    }
    public int getJ() {
        return j.get();
    }
}
