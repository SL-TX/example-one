package ru.skypro;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
// Аналог репозитория похоже
public class EmployeeBook {

    private final Employee[] eployies = new Employee[10];

    public EmployeeBook() {

    }

    public void init() {
        for (int i = 0; i < 10; i++) {
            eployies[i] = new Employee(
                    "И." + i, "Ф." + i, "О." + i,
                    String.valueOf(1 + (int) i / 2),
                    100000 + (int) (Math.random() * 100000));
        }
    }

    public String getAllEmployies() {
        return "[" + Arrays.stream(eployies).map(Employee::toString).collect(Collectors.joining(",\n")) + "]";
    }

    public Integer getSumSalaries() {
        return Arrays.stream(eployies).map(Employee::getSalary).reduce(Integer::sum).orElseThrow();
    }

    public Employee getEmployeeWithMinSalary() {
        return Arrays.stream(eployies).reduce((e1, e2) -> e1.getSalary() < e2.getSalary() ? e1 : e2).orElseThrow();
    }

    public Employee getEmployeeWithMaxSalary() {
        return Arrays.stream(eployies).reduce((e1, e2) -> e1.getSalary() > e2.getSalary() ? e1 : e2).orElseThrow();
    }

    public Double getAvgSalaries() {
        return (double) getSumSalaries() / eployies.length;
    }

    public String listNamesOfAllEmployies() {
        return "[" + Arrays.stream(eployies).map(
                (e) ->
                        "{" +
                                "\"Фамилия\":\"" + e.getLastName() + '\"' +
                                ", \"Имя\":\"" + e.getFirstName() + '\"' +
                                ", \"Отчество\":\"" + e.getSecondName() + "\"}"
        ).collect(Collectors.joining(",\n")) + "]";
    }

    public void salaryIndex(Integer percent) {
        Arrays.stream(eployies).forEach((e) -> e.setSalary(e.getSalary() + e.getSalary() * percent / 100));
    }

    public Employee getEmployeeWithMinSalaryInDepartment(String department) {
        return Arrays.stream(eployies).filter(e -> Objects.equals(e.getDepartment(), department)).reduce((e1, e2) -> e1.getSalary() < e2.getSalary() ? e1 : e2).orElseThrow();
    }

    public Employee getEmployeeWithMaxSalaryInDepartment(String department) {
        return Arrays.stream(eployies).filter(e -> Objects.equals(e.getDepartment(), department)).reduce((e1, e2) -> e1.getSalary() > e2.getSalary() ? e1 : e2).orElseThrow();
    }

    public Integer getSumSalariesInDepartment(String department) {
        return Arrays.stream(eployies).filter(e -> Objects.equals(e.getDepartment(), department)).map(Employee::getSalary).reduce(Integer::sum).orElseThrow();
    }

    public Double getAvgSalariesInDepartment(String department) {
        return (double) getSumSalariesInDepartment(department) / Arrays.stream(eployies).filter(e -> Objects.equals(e.getDepartment(), department)).count();
    }

    public void salaryIndexInDepartment(String department, Integer percent) {
        Arrays.stream(eployies).filter(e -> Objects.equals(e.getDepartment(), department)).forEach((e) -> e.setSalary(e.getSalary() + e.getSalary() * percent / 100));
    }

    public String listNamesOfEmployiesInDepartment(String department) {
        return "[" + Arrays.stream(eployies).filter(e -> Objects.equals(e.getDepartment(), department)).map(
                (e) ->
                        "{" +
                                "\"Фамилия\":\"" + e.getLastName() + '\"' +
                                ", \"Имя\":\"" + e.getFirstName() + '\"' +
                                ", \"Отчество\":\"" + e.getSecondName() + '\"' +
                                ", \"Зарплата\":" + e.getSalary() +
                                "}"
        ).collect(Collectors.joining(",\n")) + "]";
    }

    public Employee[] listEmployiesWithSalaryMoreThanOrEqual(Integer value) {
        var list = Arrays.stream(eployies).filter(e -> e.getSalary() >= value).toList();
        return list.toArray(new Employee[0]);
    }

    public Employee[] listEmployiesWithSalaryLessThan(Integer value) {
        var list = Arrays.stream(eployies).filter(e -> e.getSalary() < value).toList();
        return list.toArray(new Employee[0]);
    }

    public String specialOutputForListEmployiesMethods(Employee[] eployies) {
        return "[" + Arrays.stream(eployies).map(
                (e) ->
                        "{" +
                                "\"Фамилия\":\"" + e.getLastName() + '\"' +
                                ", \"Имя\":\"" + e.getFirstName() + '\"' +
                                ", \"Отчество\":\"" + e.getSecondName() + '\"' +
                                ", \"Зарплата\":" + e.getSalary() +
                                "}"
        ).collect(Collectors.joining(",\n")) + "]";
    }

    public void addNewEmplyeeInMem(String firstName, String lastName, String secondName, String department, Integer salary) {
        for (var i = 0; i < 10; i++) {
            if (eployies[i] == null) {
                eployies[i] = new Employee(firstName, lastName, secondName, department, salary);
                return;
            }
        }
        throw new RuntimeException("Все ячейки массива заняты");
    }

    public void delEmployeeById(Integer id) {
        eployies[id] = null;
    }

    public void delEmployeeByFIO(String firstName, String lastName, String secondName) {
        for (var i = 0; i < 10; i++) {
            if (eployies[i] != null && Objects.equals(eployies[i].getFirstName(), firstName) &&
                    Objects.equals(eployies[i].getLastName(), lastName) &&
                    Objects.equals(eployies[i].getSecondName(), secondName)
            )
                eployies[i] = null;
        }
    }

    public void setEmployeeSalaryAndDepartment(String firstName, String lastName, String secondName, Optional<String> department, Optional<Integer> salary) {
        for (var i = 0; i < 10; i++) {
            if (Objects.equals(eployies[i].getFirstName(), firstName) &&
                    Objects.equals(eployies[i].getLastName(), lastName) &&
                    Objects.equals(eployies[i].getSecondName(), secondName)
            ) {
                if (salary.isPresent())
                    eployies[i].setSalary(salary.get());
                if (department.isPresent())
                    eployies[i].setDepartment(department.get());
            }
        }
    }

}
