package ru.mikhailov;

public class Chief extends Employee{
    public Chief(String fio, String position, String phoneNumber, int salary, int age) {
        super(fio, position, phoneNumber, salary, age);
    }
    public static void salaryIncreaserInside(Employee[]employeeList, int age, int salaryIncrease){
        for(Employee elem : employeeList){
            if(!(elem instanceof Chief)) {
                if (elem.getAge() >= 45) {
                    elem.setSalary(elem.getSalary() + salaryIncrease);
                }
            }
        }
        System.out.println("\nSalary increase operation finished (Static method inside class Chief)\n");
    }
}
