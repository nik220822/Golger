import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getInstance();
        logger.log("Программа запустилась");
        System.out.println("Введите размер списка");
        int M = parseInt(scanner.nextLine());
        logger.log("Пользователь ввёл размер списка");
        System.out.println("Введите верхнюю границу для значений");
        int N = parseInt(scanner.nextLine());
        logger.log("Пользователь ввёл верхнюю границу");
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            list.add(random.nextInt(N));
        }
        System.out.println(list);
        logger.log("Список создан и заполнен");
        System.out.println("Введите значение для фильтра");
        int F = scanner.nextInt();
        logger.log("Пользователь ввёл значение для фильтра");
        logger.log("Запускаем фильтрацию...");
        list = (new Filter(F)).filterOut(list);
        logger.log("Выводим результат на экран:");
        System.out.println(list);
        logger.log("Завершаем программу");
    }
}
