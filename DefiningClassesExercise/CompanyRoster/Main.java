package DefiningClassesExercise.CompanyRoster;

import DefiningClassesExercise.CompanyRoster.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Employee> persons = new ArrayList<>();
        Map<String,Double> departments = new HashMap<>();
        for (int i = 0; i < n; i++) {
            Employee employee = null;
            String[] data = scan.nextLine().split(" ");
            String name = data[0];
            double salary = Double.parseDouble(data[1]);
            String position = data[2];
            String department = data[3];
            if(data.length == 4){
              employee = new Employee(name,salary,position,department);
            } else if(data.length == 5){
                if(data[4].contains("@")){
                    String email = data[4];
                    employee = new Employee(name,salary,position,department,email);
                } else {
                    int age = Integer.parseInt(data[4]);
                    employee = new Employee(name,salary,position,department,age);
                }
            } else if(data.length == 6){
                if(data[4].contains("@")){
                    String email = data[4];
                    int age = Integer.parseInt(data[5]);
                    employee = new Employee(name,salary,position,department,email,age);
                } else {
                    int age = Integer.parseInt(data[4]);
                    String email = data[5];
                    employee = new Employee(name,salary,position,department,email,age);
                }
            }
            persons.add(employee);
            if(departments.containsKey(department)){
                departments.put(department, (departments.get(department) + salary) / 2);
            } else {
                departments.put(department,salary);
            }
        }
        String maxDepartment = departments.entrySet().stream().max(Comparator.comparingDouble(Map.Entry::getValue)).get().getKey();
        List<Employee> employeesFromMaxDepartment = new ArrayList<>();
        for (Employee person : persons) {
            if(person.getDepartment().equals(maxDepartment)){
                employeesFromMaxDepartment.add(person);
            }
        }
        employeesFromMaxDepartment = employeesFromMaxDepartment.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList());
        System.out.println("Highest Average Salary: " + maxDepartment);
        for (Employee employee : employeesFromMaxDepartment) {
            System.out.println(employee.getInfo());
        }
    }
}
