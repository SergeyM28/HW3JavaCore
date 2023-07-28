package ru.mikhailov;

/*
1.
– Создать класс ”Сотрудник”с полями: ФИО, должность, телефон, зарплата, возраст;
– Написать метод выводящую всю доступную информацию об объекте с использованием форматирования строк.
– Создать массив из 5 сотрудников
– Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000. Возраст и размер повышения должны
быть параметрами метода.
– Написать тот же метод повышения в качестве статического в классе сотрудника. Метод должен принимать в качестве
параметра массив сотрудников.
– Написать методы (принимающие на вход массив сотрудников), вычисляющие средний возраст и среднюю зарплату сотрудников,
вывести результаты работы в консоль.
2.
Опишите класс руководителя, наследник от сотрудника. Перенесите статический метод повышения зарплаты в класс руководителя,
модифицируйте метод таким образом, чтобы он мог поднять заработную плату всем, кроме руководителей. В основной программе
создайте руководителя и поместите его в общий массив сотрудников. Повысьте зарплату всем сотрудникам и проследите,
чтобы зарплата руководителя не повысилась.
*/

public class Main {
    public static void main(String[] args) {

        // 1.
        // - Создать класс ”Сотрудник”с полями: ФИО, должность, телефон, зарплата, возраст
        // * реализовано в классе Emplyee.

        // - Написать метод выводящую всю доступную информацию об объекте с использованием форматирования строк
        // * реализовано как простое переопределение toString. Для удобства в майне также создан статичный метод showAllData

        // - Создать массив из 5 сотрудников
        Employee e1 = new Employee("Neville Longbottom", "intern", "79111111111", 15000, 17);
        Employee e2 = new Employee("Luna Lovegood", "intern", "79222222222", 15000, 16);
        Employee e3 = new Employee("Draco Malfoy", "intern", "79333333333", 17000, 17);
        Employee e4 = new Employee("Severus Snape", "shift supervisor", "79444444444", 85000, 50);
        Employee e5 = new Employee("Minerva McGonagall", "senior manager", "79333333333", 100000, 60);

        Employee[] emplyeeList = {e1, e2, e3, e4, e5};
        showAllData(emplyeeList);

        //– Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000. Возраст и
        // размер повышения должны быть параметрами метода.
        salaryIncreaser(emplyeeList, 45, 5000);
        showAllData(emplyeeList);

        //– Написать тот же метод повышения в качестве статического в классе сотрудника. Метод должен принимать в качестве
        // параметра массив сотрудников.
        Employee.salaryIncreaserInside(emplyeeList, 45, 5000);
        showAllData(emplyeeList);

        // Написать методы (принимающие на вход массив сотрудников), вычисляющие средний возраст и среднюю зарплату
        // сотрудников, вывести результаты работы в консоль.
        System.out.println("\nAverage salary --> " + Employee.getAverageSalary(emplyeeList));
        System.out.println("\nAverage age --> " + Employee.getAverageAge(emplyeeList) + "\n");

        //2.
        //Опишите класс руководителя, наследник от сотрудника. Перенесите статический метод повышения зарплаты в класс руководителя,
        //модифицируйте метод таким образом, чтобы он мог поднять заработную плату всем, кроме руководителей. В основной программе
        //создайте руководителя и поместите его в общий массив сотрудников. Повысьте зарплату всем сотрудникам и проследите,
        //чтобы зарплата руководителя не повысилась.
        Chief c1 = new Chief("Albus Dumbledore", "CEO", "79666666666", 1000000, 65);
        Employee[] emplyeeList2 = {e1, e2, e3, e4, e5, c1};
        showAllData(emplyeeList2);
        Chief.salaryIncreaserInside(emplyeeList2, 45, 5000);
        showAllData(emplyeeList2);
        }

    public static void salaryIncreaser(Employee[]employeeList, int age, int salaryIncrease){
        for(Employee elem : employeeList){
            if (elem.getAge() >= 45){
                elem.setSalary(elem.getSalary() + salaryIncrease);
            }
        }
        System.out.println("\nSalary increase operation finished\n");
    }
    public static void showAllData(Employee[]employeeList){
        for(Employee elem :employeeList){
            System.out.println(elem.toString());
        }
    }



}