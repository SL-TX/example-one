package ru.skypro;

import java.util.List;

public class Mechanic {
    private final String firstName;
    private final String lastName;
    private final String companyName;
    private final List<String> listCarTypes;

    public Mechanic(String firstName, String lastName, String companyName, List<String> listCarTypes) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.listCarTypes = listCarTypes;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public List<String> getListCarTypes() {
        return listCarTypes;
    }

    private void provestiTechObsluzhivanie(){

    }
    private void repairCar(){

    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", listCarTypes=" + listCarTypes +
                '}';
    }
}
