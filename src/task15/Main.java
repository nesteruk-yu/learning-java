package task15;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Sergey", "Dulgery", 39, 6000);
        Employee employee2 = new Employee(2, "Olga", "Skalaban", 341, 400);
        Employee employee3 = new Employee(3, "Katerina", "Sapeshko", 25, 300);
        Employee employee4 = new Employee(4, "Pavel", "Osipenko", 42, 6000);
        Employee employee5 = new Employee(5, "Lera", "Losik", 39, 3000);
        Employee employee6 = new Employee(6, "Valeriy", "Fedorov", 39, 6000);
        Employee employee7 = new Employee(7, "Veronika", "Slavikovna", 33, 1000);
        Employee employee8 = new Employee(8, "Valeriy", "Fedorov", 39, 6000);

//1.4.Создать мапку и записать туда созданных сотрудников в качестве ключа., а в качестве значения им присвоить им профессию.

        Map<Employee, String> employees = new HashMap<>();
        employees.put(employee1, "Lead of testers");
        employees.put(employee2, "Engineer");
        employees.put(employee3, "Teacher");
        employees.put(employee4, "Head of testers");
        employees.put(employee5, "Tester");
        employees.put(employee6, "Cooker");
        employees.put(employee7, "Teacher");
        employees.put(employee8, "Manager");

        raiseSalaryForProfession(employees, 100, "Teacher");
        System.out.println(employee3.getSalary());
        System.out.println(employee7.getSalary());

    }

//1.5 Реализуйте статический метод в классе Main, который повысит зарплату сотрудникам одной профессии. Сигнатура метода к примеру такая.
//private static void raiseSalaryForProfession(Map<Employee, String> employees, int amountOfIncrease). Например: Необходимо повысить зарплату плотникам на 200 рублей. (Обратите внимание на метод entrySet).

    private static void raiseSalaryForProfession(Map<Employee, String> employees, int amountOfIncrease, String profession) {
        for (Map.Entry<Employee, String> employee : employees.entrySet()) {
            Employee emp = employee.getKey();
            profession = employee.getValue();

            if (employee.getValue() == profession) {
                emp.setSalary(emp.getSalary() + amountOfIncrease);
            }
        }
    }
}

