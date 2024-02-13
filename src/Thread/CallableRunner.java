package Thread;

import java.util.concurrent.*;

class CallableTask implements Callable<String> {
    private final String name;
    public CallableTask(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "Hello!" + name;
    }
}

public class CallableRunner {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> welcomeFuture = executorService.submit(new CallableTask("jihun"));
        System.out.println("\n new Callable Thread.Task \"jihun \" executed");

        // get method를 future에 사용하면 promise를 반환함.
        String myName = welcomeFuture.get();
        System.out.println(myName);


        System.out.print("\n Main completed!");
        executorService.shutdown();
    }
}
