package ru.skypro;

// Ентити
//@Getter
public class Employee {
    private static int counter;
    private final Integer id;
    private final String firstName;
    private final String lastName;
    private final String secondName;
    //@Setter
    private String department;//1-5
    //@Setter
    private Integer salary;

    public Employee(final String firstName, final String lastName, final String secondName, final String department, final Integer salary) {
        this.id = counter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.secondName = secondName;
        this.department = department;
        this.salary = salary;
    }

    // Alt+Insert generated && modified to JSON output
    @Override
    public String toString() {
        return "{" +
                "\"ИД\":" + id +
                ", \"Фамилия\":\"" + lastName + '\"' +
                ", \"Имя\":\"" + firstName + '\"' +
                ", \"Отчество\":\"" + secondName + '\"' +
                ", \"Отдел\":\"" + department + '\"' +
                ", \"Зарплата\":" + salary +
                "}";
    }

    public String toStringOnlyFIO() {
        return "{" +
                "\"Фамилия\":\"" + lastName + '\"' +
                ", \"Имя\":\"" + firstName + '\"' +
                ", \"Отчество\":\"" + secondName + "\"" +
                "}";
    }

    public String toStringWithoutDepartment() {
        return "{" +
                "\"Фамилия\":\"" + lastName + '\"' +
                ", \"Имя\":\"" + firstName + '\"' +
                ", \"Отчество\":\"" + secondName + "\"" +
                ", \"Зарплата\":" + salary +
                "}";
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
