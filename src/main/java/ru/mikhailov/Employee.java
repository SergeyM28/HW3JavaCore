package ru.mikhailov;

public class Employee {
    private String fio;
    private String position;
    private String phoneNumber;
    private int salary;
    private int age;

    public static void salaryIncreaserInside(Employee[]employeeList, int age, int salaryIncrease){
        for(Employee elem : employeeList){
            if (elem.getAge() >= 45){
                elem.setSalary(elem.getSalary() + salaryIncrease);
            }
        }
        System.out.println("\nSalary increase operation finished (Static method inside class Employee)\n");
    }

    public static Integer getAverageSalary(Employee[]employeeList){
        int averageSalary = 0;
        for(Employee elem : employeeList){
            averageSalary += elem.getSalary();
            }
        return averageSalary / employeeList.length;
    }

    public static Integer getAverageAge(Employee[]employeeList){
        int averageAge = 0;
        for(Employee elem : employeeList){
            averageAge += elem.getAge();
        }
        return averageAge / employeeList.length;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fio='" + fio + '\'' +
                ", position='" + position + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(String fio, String position, String phoneNumber, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }


}
