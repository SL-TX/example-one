package ru.skypro;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    static Employee[] eployies = new Employee[10];
    public static void init(){
        for (int i = 0; i < 10; i++) {
            eployies[i] = new Employee(
                    "И." + i, "Ф." + i, "О." + i,
                    String.valueOf(1 + (int) i / 2),
                    100000 + (int) (Math.random() * 100000));
        }
    }
    public static String getAllEmployies(){
        return "["+Arrays.stream(eployies).map(Employee::toString).collect(Collectors.joining(",\n"))+"]";
    }

    public static Integer getSumSalaries(){
        return Arrays.stream(eployies).map(Employee::getSalary).reduce(Integer::sum).orElseThrow();
    }

    public static Employee getEmployeeWithMinSalary(){
        return Arrays.stream(eployies).reduce((e1,e2)->e1.getSalary()<e2.getSalary()?e1:e2).orElseThrow();
    }
    public static Employee getEmployeeWithMaxSalary(){
        return Arrays.stream(eployies).reduce((e1,e2)->e1.getSalary()>e2.getSalary()?e1:e2).orElseThrow();
    }
    public static Double getAvgSalaries(){
        return (double) getSumSalaries()/eployies.length;
    }

    public static String listNamesOfAllEmployies(){
        return "["+Arrays.stream(eployies).map(
                (e)->
                        "{"+
                                "\"Фамилия\":\"" + e.getLastName() + '\"' +
                                ", \"Имя\":\"" + e.getFirstName() + '\"' +
                                ", \"Отчество\":\"" + e.getSecondName() + "\"}"
        ).collect(Collectors.joining(",\n"))+"]";
    }
    public static void main(String[] args) {
        init();
        //Basic difficult
        System.out.println("Список всех сотрудников со всеми имеющимися по ним данными: "+getAllEmployies());
        System.out.println("Сумма затрат на зарплаты в месяц: "+getSumSalaries());
        System.out.println("Сотрудник с минимальной зарплатой: "+getEmployeeWithMinSalary());
        System.out.println("Сотрудник с максимальной зарплатой: "+getEmployeeWithMaxSalary());
        System.out.println("Среднее значение зарплат: "+getAvgSalaries());
        System.out.println("Ф. И. О. всех сотрудников: "+listNamesOfAllEmployies());
    }

}
