package ru.skypro;

import ru.skypro.exceptions.DataInvalidException;
import ru.skypro.task.Task;
import ru.skypro.task.TaskPeriod;
import ru.skypro.task.TaskType;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Map<Integer, Task> taskMap = new HashMap<>();
    public static void main(String[] args){
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
        int type = scanner.nextInt();
        if (type == 0){
            return;
        }
        if (taskMap.remove(type) == null){
            System.out.print("Данного id не найдено \n");
        }
    }

    private static void getTaskOnDate(Scanner scanner) {
        try {
            Task newTask = new Task(
                    "1",
                    "1",
                    1,
                    1,
                    "11-11-2011",
                    "12:12"
            );
            taskMap.put(newTask.getId(), newTask);
            newTask = new Task(
                    "2",
                    "2",
                    2,
                    2,
                    "12-12-2011",
                    "24:12"
            );
            taskMap.put(newTask.getId(), newTask);
        } catch (DataInvalidException e){
            System.err.println();
        }
    }
}
