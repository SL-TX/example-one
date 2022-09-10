package ru.skypro;

public class Main {
    private static final EmployeeBook book = new EmployeeBook();

    public static void main(String[] args) {
        book.init();
        //Basic difficult
        System.out.println("Список всех сотрудников со всеми имеющимися по ним данными: " + book.getAllEmployies());
        System.out.println("Сумма затрат на зарплаты в месяц: " + book.getSumSalaries());
        System.out.println("Сотрудник с минимальной зарплатой: " + book.getEmployeeWithMinSalary());
        System.out.println("Сотрудник с максимальной зарплатой: " + book.getEmployeeWithMaxSalary());
        System.out.println("Среднее значение зарплат: " + book.getAvgSalaries());
        System.out.println("Ф. И. О. всех сотрудников: " + book.listNamesOfAllEmployies());
        //Advanced difficult
        book.salaryIndex(10);
        System.out.println("TestCase: " + book.getAllEmployies());
        String randomDepartment = String.valueOf(1 + (int) (Math.random() * 5));
        System.out.println("Сотрудник с минимальной зарплатой в отделе " + randomDepartment + ": " + book.getEmployeeWithMinSalaryInDepartment(randomDepartment));
        System.out.println("Сотрудник с максимальной зарплатой в отделе " + randomDepartment + ": " + book.getEmployeeWithMaxSalaryInDepartment(randomDepartment));
        System.out.println("Сумму затрат на зарплату по отделу " + randomDepartment + ": " + book.getSumSalariesInDepartment(randomDepartment));
        System.out.println("Средняя зарплата по отделу " + randomDepartment + ": " + book.getAvgSalariesInDepartment(randomDepartment));
        book.salaryIndexInDepartment(randomDepartment, 10);
        System.out.println("Ф. И. О. сотрудников отдела " + randomDepartment + ": " + book.listNamesOfEmployiesInDepartment(randomDepartment));
        Integer someValue = 150000;
        System.out.println("Сотрудники с зарплатой меньше числа " + someValue + ":");
        System.out.println(book.specialOutputForListEmployiesMethods(book.listEmployiesWithSalaryLessThan(someValue)));
        System.out.println("Сотрудники с зарплатой больше числа " + someValue + ":");
        System.out.println(book.specialOutputForListEmployiesMethods(book.listEmployiesWithSalaryMoreThanOrEqual(someValue)));
        //Very difficult
        book.delEmployeeById(1);
        book.delEmployeeByFIO("И.4", "Ф.4", "О.4");
        book.addNewEmplyeeInMem("asdf", "fdsa", "sasd", "3", 120000);
        book.addNewEmplyeeInMem("QQasdf", "QWfdsa", "WWasd", "1", 60000);
        book.setEmployeeSalaryAndDepartment("И.6", "Ф.6", "О.6", "1", 300000);
        book.setEmployeeSalaryAndDepartment("И.7", "Ф.7", "О.7", null, 250000);
        System.out.println("TestCase: ");
        System.out.println(book.getAllEmployies());

    }

}
