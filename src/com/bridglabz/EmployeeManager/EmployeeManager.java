package com.bridglabz.EmployeeManager;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeManager {
    List<Employee> list = new ArrayList<>();
    Set<Employee> set = new HashSet<>();

    //    A method to add an employee to the list.......................................................................................!
    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee id: ");
        int id = sc.nextInt();
        System.out.println("Enter the name: ");
        String name = sc.next();
        System.out.println("Enter the salary: ");
        double salary = sc.nextDouble();
        System.out.println("Enter the designation: ");
        String designation = sc.next();
        Employee employee = new Employee(id, name, salary, designation);
        System.out.println(set.add(employee));
        System.out.println(list.add(employee));
        System.out.println("Employee details added successfully. ");
//       System.out.println(map);
    }

    //    A method to print the details of all employees in the lis...........................................................................!
    public void displayAll() {
        for (Employee employee : set) {
            System.out.println(employee);
        }
    }

    //    A method to remove an employee from the list.........................................................................!
    public void delete() {
        Scanner sc = new Scanner(System.in);
        boolean found = false;
        System.out.println("Enter your first name: ");
        String name = sc.nextLine();
        Employee contactDelete = null;
        for (Employee contacts2 : set) {
            if (contacts2.getName().equals(contacts2.name)) {
                contactDelete = contacts2;
                found = true;
            }
        }
        if (!found) {
            System.out.println("Contact details is not present..");
        } else {
            set.remove(contactDelete);
            System.out.println("Contact details deleted successfully");
        }
    }

    //    A method to search for an employee by their ID.....................................................................!
    public void searchById() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee id: ");
        int id = sc.nextInt();
        for (Employee employee : set) {
            if (employee.getId() == id) {
                System.out.println(employee);
            } else {
                System.out.println("Employee is absent.");
            }
        }
    }

    //    A method to calculate the average salary of all employees..................................................................!
    double sum = 0;
    double count = 0;

    public void avgSalary() {
        for (Employee employee11 : list) {
            sum = sum + employee11.salary;
            count++;
        }
        double avg = sum / count;
        System.out.println("Average salary :" + avg);
    }

    //    A meth salary (ascending or descending order)............................................................................!
    public void sortSalary(boolean asc) {
        if (asc) {
            Collections.sort(list, (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
            System.out.println(list);
        } else {
            Collections.sort(list, (e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));
            System.out.println(list);
        }
    }


    static boolean ordering = true;

    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Employee contacts"
                    + "\n1 Add contact details  " +
                    "\n2 Display contact details " +
                    "\n3 delete contact details " +
                    "\n 4 Search by id " +
                    "\n5 Sort salary all Employee" +
                    "\n 6 Average salary of all employee ");
            System.out.println("Enter the choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Add Contact:");
                    employeeManager.add();
                    break;
                case 2:
                    System.out.println("Display Contact:");
                    employeeManager.displayAll();
                    break;

                case 3:
                    System.out.println("Delete Contact:");
                    employeeManager.delete();
                    break;

                case 4:
                    System.out.println("Search by id: ");
                    employeeManager.searchById();
                    break;
                case 5:
                    System.out.println("Sort by Salary: ");
                    employeeManager.sortSalary(true);
                    break;
                case 6:
                    System.out.println("Average Salary: ");
                    employeeManager.avgSalary();
                    break;
            }
        }
        while (ordering);
    }
}
