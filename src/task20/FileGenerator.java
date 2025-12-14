package task20;

//1. Создать задачу Callable, которая генерирует 10 файлов с 10 произвольными строками -> засыпает произвольно на 1-3 секунды, результат выполнения –коллекция имен файлов. Запустить 10 задач параллельно в пуле из 3 потоков. Вывести ход программы на экран с указанием имени потока, который выполняет работу.

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

class FileGenerator implements Callable<List<String>> {
    private int taskId;
    private Random random = new Random();

    FileGenerator(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public List<String> call() throws Exception {
        String threadName = Thread.currentThread().getName();
        System.out.println("Задача " + taskId + " запущена в потоке " + threadName);

        List<String> fileNames = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            String fileName = "task_" + taskId + "_file_" + i + ".txt";
            Path path = Paths.get(fileName);

            List<String> lines = new ArrayList<>();
            for (int j = 1; j <= 10; j++) {
                lines.add("произвольная строка " + j);
            }

            Files.write(path, lines, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            fileNames.add(fileName);

            System.out.println("Поток " + threadName + " создал файл " + fileName);
        }

        int sleepTime = 1 + random.nextInt(3);
        System.out.println("Поток " + threadName + " засыпает на " + sleepTime + " сек");
        Thread.sleep(sleepTime*1000);

        System.out.println("Задача " + taskId + " завершена в потоке " + threadName);
        return fileNames;
    }
}