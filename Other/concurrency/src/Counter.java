public class Counter {
    private int i = 0;
    synchronized public void increment() {
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

}
