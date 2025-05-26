import java.util.concurrent.*;
import java.util.*;
public class ExecutorServiceandCallable{
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Callable<String>> tasks = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            tasks.add(() -> {
                return "Result from Task " + taskId;
            });
        }
        List<Future<String>> results = executor.invokeAll(tasks);
        for (Future<String> future : results) {
            System.out.println(future.get());
        }
        executor.shutdown();
    }
}

