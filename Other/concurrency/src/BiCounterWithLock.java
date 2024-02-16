import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {
    private int i = 0;
    private int j = 0;

        // Lock: 동기화된 코드를 여러 조각의 코드로 쪼개는 기능
        // 두 개의 thread가 incrementI incrementJ를 실행하고자 하면 두개 모두 실행,
        // 두 개의 thread가 같은 method를 실행할 때는 하나가 기다림
        // syncronized는 필요 없음.
        // lockForI.lock();을 하면 다른 thread들이 lockForI를 가지고 있는지 확인한다.
        // 아무 thread도 lockForI를 갖지 않으면
        // 1. getI()를 하고 lock을 건다.
        // 2. i++를 하고
        // 3. release를 한다.
    Lock lockForI = new ReentrantLock();
    Lock lockForJ = new ReentrantLock();
    public void incrementI() {
        // tryLock: time, timeUnit, x초동안 기다리고 안되면 말기
//        lockForI.tryLock();
        lockForI.lock(); //Get Lock For I
        i++;
        lockForI.unlock();
        //Release Lock For I
    }

    public int getI() {
        return i;
    }

    public void incrementJ() {
        //Get Lock For J
        lockForJ.lock();
        j++;
        lockForJ.unlock();
        //Release Lock For J
    }
    public int getJ() {
        return j;
    }
}
