package Thread;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleAnyCallableRunner {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // 3개의 thread를 이용하면 1초만에 가능, but 1개라면 3초 걸림.
        // 모든 실행이 완료되지 않아도 하나라도 완료되면, 결과 도출 : invokeAny
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        List<CallableTask> tasks = List.of(new CallableTask("jihun"), new CallableTask("another"), new CallableTask("Adam"));

        String result = executorService.invokeAny(tasks);
            System.out.println(result);

        executorService.shutdown();
    }
}
