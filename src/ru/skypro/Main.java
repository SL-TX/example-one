package ru.skypro;

import java.util.Arrays;
import java.util.Objects;
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

    public static void salaryIndex(Integer percent){
        Arrays.stream(eployies).forEach((e)->e.setSalary(e.getSalary()+e.getSalary()*percent/100));
    }

    public static Employee getEmployeeWithMinSalaryInDepartment(String department){
        return Arrays.stream(eployies).filter(e-> Objects.equals(e.getDepartment(), department)).reduce((e1, e2)->e1.getSalary()<e2.getSalary()?e1:e2).orElseThrow();
    }
    public static Employee getEmployeeWithMaxSalaryInDepartment(String department){
        return Arrays.stream(eployies).filter(e-> Objects.equals(e.getDepartment(), department)).reduce((e1,e2)->e1.getSalary()>e2.getSalary()?e1:e2).orElseThrow();
    }
    public static Integer getSumSalariesInDepartment(String department){
        return Arrays.stream(eployies).filter(e-> Objects.equals(e.getDepartment(), department)).map(Employee::getSalary).reduce(Integer::sum).orElseThrow();
    }
    public static Double getAvgSalariesInDepartment(String department){
        return (double) getSumSalariesInDepartment(department)/Arrays.stream(eployies).filter(e-> Objects.equals(e.getDepartment(), department)).count();
    }
    public static void salaryIndexInDepartment(String department, Integer percent){
        Arrays.stream(eployies).filter(e-> Objects.equals(e.getDepartment(), department)).forEach((e)->e.setSalary(e.getSalary()+e.getSalary()*percent/100));
    }
    public static String listNamesOfEmployiesInDepartment(String department){
        return "["+Arrays.stream(eployies).filter(e-> Objects.equals(e.getDepartment(), department)).map(
                (e)->
                        "{"+
                                "\"Фамилия\":\"" + e.getLastName() + '\"' +
                                ", \"Имя\":\"" + e.getFirstName() + '\"' +
                                ", \"Отчество\":\"" + e.getSecondName() + '\"' +
                                ", \"Зарплата\":" + e.getSalary() +
                                "}"
        ).collect(Collectors.joining(",\n"))+"]";
    }

    public static Employee[] listEmployiesWithSalaryMoreThanOrEqual(Integer value){
        var list = Arrays.stream(eployies).filter(e -> e.getSalary() >= value).toList();
        return list.toArray(new Employee[0]);
    }
    public static Employee[] listEmployiesWithSalaryLessThan(Integer value){
        var list = Arrays.stream(eployies).filter(e -> e.getSalary()<value).toList();
        return list.toArray(new Employee[0]);
    }
    public static String specialOutputForListEmployiesMethods(Employee[] eployies){
        return "["+Arrays.stream(eployies).map(
                (e)->
                        "{"+
                                "\"Фамилия\":\"" + e.getLastName() + '\"' +
                                ", \"Имя\":\"" + e.getFirstName() + '\"' +
                                ", \"Отчество\":\"" + e.getSecondName() + '\"' +
                                ", \"Зарплата\":" + e.getSalary() +
                                "}"
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
        //Advanced difficult
        salaryIndex(10);
        System.out.println("TestCase: "+getAllEmployies());
        String randomDepartment = String.valueOf(1+ (int) (Math.random() * 5));
        System.out.println("Сотрудник с минимальной зарплатой в отделе "+randomDepartment+": "+getEmployeeWithMinSalaryInDepartment(randomDepartment));
        System.out.println("Сотрудник с максимальной зарплатой в отделе "+randomDepartment+": "+getEmployeeWithMaxSalaryInDepartment(randomDepartment));
        System.out.println("Сумму затрат на зарплату по отделу "+randomDepartment+": "+getSumSalariesInDepartment(randomDepartment));
        System.out.println("Средняя зарплата по отделу "+randomDepartment+": "+getAvgSalariesInDepartment(randomDepartment));
        salaryIndexInDepartment(randomDepartment,10);
        System.out.println("Ф. И. О. сотрудников отдела "+randomDepartment+": "+listNamesOfEmployiesInDepartment(randomDepartment));
        Integer someValue = 150000;
        System.out.println("Сотрудники с зарплатой меньше числа "+ someValue+ ":");
        System.out.println(specialOutputForListEmployiesMethods(listEmployiesWithSalaryLessThan(someValue)));
        System.out.println("Сотрудники с зарплатой больше числа "+ someValue+ ":");
        System.out.println(specialOutputForListEmployiesMethods(listEmployiesWithSalaryMoreThanOrEqual(someValue)));

    }

}
