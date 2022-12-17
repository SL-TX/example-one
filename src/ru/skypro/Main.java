package ru.skypro;

import ru.skypro.exceptions.DataInvalidException;
import ru.skypro.task.Task;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    static Map<Integer, Task> taskMap = new HashMap<>();
    public static void main(String[] args){
        testInitTasks();
        try (Scanner scanner = new Scanner(System.in)) {
            label:
            while (true) {
                printMenu();
                System.out.print("Выберите пункт меню: ");
                if (scanner.hasNextInt()) {
                    int menu = scanner.nextInt();
                    switch (menu) {
                        case 1:
                            inputTask(scanner);
                            break;
                        case 2:
                            removeTask(scanner);
                            break;
                        case 3:
                            getTaskOnDate(scanner);
                            break;
                        case 0:
                            break label;
                    }
                } else {
                    scanner.next();
                    System.out.println("Выберите пункт меню из списка!");
                }
            }
        }
    }

    private static void testInitTasks() {
        try {
            Task newTask = new Task(
                    "Планерка по понедельникам",
                    "Планерка по понедельникам",
                    2,
                    3,
                    "17-10-2022",
                    "10:00"
            );
            taskMap.put(newTask.getId(), newTask);
            newTask = new Task(
                    "Обеденный перерыв",
                    "Обеденный перерыв",
                    1,
                    2,
                    "17-10-2022",
                    "13:00"
            );
            taskMap.put(newTask.getId(), newTask);
        } catch (DataInvalidException e){
            System.err.println();
        }
    }

    private static void inputTask(Scanner scanner) {
        System.out.print("Введите название задачи: \n");
        String taskName = scanner.next();
        System.out.print("Введите описание задачи: \n");
        String description = scanner.next();
        System.out.print("Выберите тип задачи: \n 1: Личная \n 2: Рабочая\n");
        int type = scanner.nextInt();
        System.out.print("Выберите периодичность задачи: \n");
        int taskPeriod = scanner.nextInt();
        System.out.print("Выберите дату задачи: \n Формат Даты: 'dd-mm-yyyy'\n");
        String date = scanner.next();
        System.out.print("Выберите время задачи: \n Формат Времени: 'hh:mm'\n");
        String time = scanner.next();
        try {
            Task newTask = new Task(
                    taskName,
                    description,
                    type,
                    taskPeriod,
                    date,
                    time
                    );
            taskMap.put(newTask.getId(), newTask);
        } catch (DataInvalidException e){
            System.err.println();
        }
    }

    private static void printMenu() {
        System.out.println(
                """
                        1. Добавить задачу
                        2. Удалить задачу
                        3. Получить задачу на указанный день
                        0. Выход
                        """
        );
    }

    private static void removeTask(Scanner scanner) {
        System.out.print("Выберите id задачи: \n");
        for (var task:taskMap.entrySet()) {
            System.out.print(task.getKey()+" "+task.getValue().toString()+" \n");
        }
        System.out.print("0 - отменить \n");
        int idTask = scanner.nextInt();
        if (idTask == 0){
            return;
        }
        if (taskMap.containsKey(idTask)){
            taskMap.get(idTask).deleteTask();
            System.out.print("Удалено\n");
        } else {
            System.out.print("Данного id не найдено \n");
        }
    }

    private static void getTaskOnDate(Scanner scanner) {
        System.out.print("Выберите дату задачи: \n Формат Даты: 'dd-mm-yyyy'\n");
        String date = scanner.next();
        List<Task> response = taskMap.values().stream().filter(
                (t) ->  t.whenNext(date)
        ).toList();
        response.forEach(task -> {
            System.out.print(task.toString() + " \n");
        });
    }
}
