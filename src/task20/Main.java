package task20;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        List<Future<List<String>>> futures = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            futures.add(pool.submit(new FileGenerator(i)));
        }

        for (Future<List<String>> future : futures) {
            try {
                List<String> result = future.get();
                System.out.println("Результат задачи: " + result);
            } catch (Exception e){
                e.printStackTrace();
            }

        }

        pool.shutdown();
    }
}
