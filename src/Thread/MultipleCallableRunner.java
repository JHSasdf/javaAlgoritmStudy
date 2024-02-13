package Thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.List;

public class MultipleCallableRunner {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // 3개의 thread를 이용하면 1초만에 가능, but 1개라면 3초 걸림.
        // 모든 실행이 완료될 때까지 기다림: invokeAll
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        List<CallableTask> tasks = List.of(new CallableTask("jihun"), new CallableTask("another"), new CallableTask("Adam"));

        List<Future<String>> results = executorService.invokeAll(tasks);
        for(Future<String> result : results) {
            System.out.println(result.get());
        }
        executorService.shutdown();
    }
}
