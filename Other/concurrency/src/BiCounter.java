public class BiCounter {
    private int i = 0;
    private int j = 0;
    
    // 동기화의 문제점: 동시에 단 한 개의 synchronized thread만 실행할 수 있음
    // 동기화된 코드들이 매우 많을 때 성능이슈
    synchronized public void incrementI() {
        i++;
        // get i
        // increment
        // set i
        // 만약 두개의 THREAD가 +1을 하려고 할 때
        // 두 thread 모두 같은 연산을 하고 저장해서 생각한 동작이 안될 수 있음. (non-thread-safe)
        // 그래서 필요한 것이 syncronized = 단 한개의 메소드만이 특점 시정에 실행되도록 하는 것. (thread safe)
    }

    public int getI() {
        return i;
    }

    synchronized public void incrementJ() {
        j++;
    }
    public int getJ() {
        return j;
    }
}
