package Thread;// extends Thread
// implements Runnable

class Task extends Thread {
    private int number;
    public Task(int number) {
        this.number = number;
    }
    public void run() { // SIGNATURE
        System.out.println("\n Thread.Task" + number + " started");
        for (int i = number*100; i <= number*100 + 99; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n Thread.Task" + number + "done");
    }
}

class Task2 implements Runnable {
    public void run() {
        System.out.println("\n Thread.Task2 started");
        for (int i = 201; i <= 299; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n Thread.Task2 done");
    }
}

public class ThreadBasicsRunner {
    // NEW; : thread 정의
    // RUNNABLE : 준비완료지만 다른 thread가 실행중이라서 대기중인 상태
    // RUNNING : 실행중인 상태
    // BLOCKED/WAITING: 외부 서비스 응답을 기다리거나 데이터베이스 이용하고 있을 때, 다른 thread로부터 데이터를 입력받아야 할 때, async
    // TERMINATED/DEAD : thread 실행 끝
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Task1 kicked off");
        Task task1 = new Task(1);
        task1.setPriority(1); // 1 ~ 10, 중간 5. 여기서는 가장 낮은 순위로 늦게 실행됨, but, 이건 그냥 request 정도
        task1.start();

//        Thread.sleep(3000);

        System.out.println("Thread.Task2 kicked off");
        Task2 task2 = new Task2();
        Thread task2Thread = new Thread(task2);
        task2Thread.setPriority(10); // 가장 높은 우선순위 10.
        task2Thread.start();
        Thread.yield(); // 메서드는 현재 실행 중인 스레드가 다른 스레드에게 CPU 실행 시간을 양보(yield)하도록 요청하는 데 사용됩니다.
        // yield() 메서드는 스레드 스케줄링에 대한 정확한 제어를 제공하지 않음

        // WAIT FOR TASK1 TO COMPLETE
        task1.join();
        task2Thread.join();

        // main method
        System.out.println("\n Task3 Kicked Off");
        for (int i = 301; i <= 399; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\n Task3 done");
        System.out.print("\n main done");
    }
}
